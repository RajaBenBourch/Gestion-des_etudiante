package com.gestioncloud.entities;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private double note;
	
	public Etudiant(String nom, String prenom, double note) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}

	public Etudiant(int id, String nom, String prenom, double note) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.note = note;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", note=" + note + "]";
	}
	
	
	
}	
