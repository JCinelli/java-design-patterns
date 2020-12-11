package fr.diginamic.builder.entity;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.builder.exception.ZoneException;

public class Zoo {

	
	private String nom;
	
	private List<Zone> zones;

	Zoo(String nom) {
		this.nom = nom;
		this.zones = new ArrayList<>();
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addAnimalToZone(String nomZone, Animal animal) {
		Zone maZone = null;
		
		for (Zone zone : zones) {
			if (zone.getNom().equals(nomZone)) {
				maZone = zone;
				break;
			}
		}
		
		if(maZone != null) {
			try {
				maZone.addAnimal(animal);
			} catch (ZoneException e) {
				System.err.println(e);
			}
		}
	}

	public void addZone(Zone maZone) {
		this.zones.add(maZone);
	}
}
