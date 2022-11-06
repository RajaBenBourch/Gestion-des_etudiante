package com.gestioncloud.metier;

import java.util.Collection;

import com.gestioncloud.entities.Etudiant;

public interface IEtudiant {
	public Etudiant findOne(int id);
	public Collection<Etudiant> findAll();
	public void add(Etudiant etudiant);
	public void update(Etudiant etudiant);
	public void delete(int id);
}
