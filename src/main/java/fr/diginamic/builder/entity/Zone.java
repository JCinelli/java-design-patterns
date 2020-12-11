package fr.diginamic.builder.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import fr.diginamic.builder.exception.ZoneException;

public class Zone {

	private String nom;
	private int capacite;
	private List<Animal> animaux;

	public Zone(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.animaux = new ArrayList<>();
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public void addAnimal(Animal animal) throws ZoneException {
			if(this.capacite != this.animaux.size()) {
				this.animaux.add(animal);
			} else {
				throw new ZoneException("La zone '"+ this.nom +"' a deja atteint sa capacité maximal");
			}
	}
}
