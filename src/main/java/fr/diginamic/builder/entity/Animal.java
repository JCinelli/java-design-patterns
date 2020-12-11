package fr.diginamic.builder.entity;

public abstract class Animal {

	private String nom;

	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
