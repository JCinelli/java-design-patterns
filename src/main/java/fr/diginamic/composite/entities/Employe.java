package fr.diginamic.composite.entities;

import fr.diginamic.composite.interfaces.IElement;

public class Employe implements IElement {

//	FIELDS
	private double salaire;
	private String nom;
	private String prenom;
	
//	CONSTRUCTOR
	public Employe(double salaire, String nom, String prenom) {
		super();
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
	}

//	METHODS
	@Override
	public double calculerSalaire() {
		return salaire;
	}

//	GETTERS & SETTERS
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
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

}
