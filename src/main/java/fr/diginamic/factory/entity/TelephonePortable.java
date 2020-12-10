package fr.diginamic.factory.entity;

import fr.diginamic.factory.enums.TypeObjCo;

public class TelephonePortable extends ObjetConnecte {
	
	private TypeObjCo type;

	public TelephonePortable(int limiteVolts) {
		super(limiteVolts);
		this.type = TypeObjCo.Téléphone_Portable;
	}

}
