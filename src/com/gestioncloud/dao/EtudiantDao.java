package com.gestioncloud.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;

import com.gestioncloud.entities.Etudiant;
import com.gestioncloud.metier.IEtudiant;

public class EtudiantDao implements IEtudiant {

	@Override
	public Etudiant findOne(int id) {
		Etudiant etudiant = null;
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM etudiant WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				double note = result.getDouble("note");
				etudiant = new Etudiant(id, nom, prenom, note);
			}
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return etudiant;
	}

	@Override
	public Collection<Etudiant> findAll() {
		Collection<Etudiant> etudiants = new ArrayList<Etudiant>();
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM etudiant");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				double note = result.getDouble("note");
				Etudiant etudiant = new Etudiant(id, nom, prenom, note);
				etudiants.add(etudiant);
			}
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return etudiants;
	}

	@Override
	public void add(Etudiant etudiant) {
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO etudiant VALUES (NULL, ?, ?, ?)");
			stmt.setString(1, etudiant.getNom());
			stmt.setString(2, etudiant.getPrenom());
			stmt.setDouble(3, etudiant.getNote());
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}

	@Override
	public void update(Etudiant etudiant) {
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE etudiant SET nom = ?, prenom = ?, note = ? WHERE id = ?");
			stmt.setString(1, etudiant.getNom());
			stmt.setString(2, etudiant.getPrenom());
			stmt.setDouble(3, etudiant.getNote());
			stmt.setInt(4, etudiant.getId());
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}

	@Override
	public void delete(int id) {
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM etudiant WHERE id = ?");
			stmt.setInt(1, id);
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}
}
