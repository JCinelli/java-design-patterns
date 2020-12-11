package fr.diginamic.builder.entity;

public class ZooBuilder {
	
	private Zoo zoo;
	
	public ZooBuilder(String nom) {
		this.zoo = new Zoo(nom);
	}
	
	public ZooBuilder appendZone(String nomZone, int capacite) {
		Zone maZone = new Zone(nomZone, capacite);
		
		this.zoo.addZone(maZone);
		return this;
	}
	
	public ZooBuilder appendAnimal(String nomZone, Animal animal) {
		this.zoo.addAnimalToZone(nomZone, animal);
		return this;
	}
	
	public Zoo get() {
		return this.zoo;
	}
	
	

}
