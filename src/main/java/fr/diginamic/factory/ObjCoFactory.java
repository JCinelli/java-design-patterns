package fr.diginamic.factory;

import fr.diginamic.factory.entity.EnceinteConnecte;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.entity.Tablette;
import fr.diginamic.factory.entity.TelephonePortable;
import fr.diginamic.factory.enums.TypeObjCo;

public class ObjCoFactory {
	
	public static ObjetConnecte createObjCo(TypeObjCo type, int limiteVolts) {
		switch (type) {
		case Téléphone_Portable:
			 return new TelephonePortable(limiteVolts);
		case Tablette:
			 return new Tablette(limiteVolts);
		case Enceinte_Connectee:
			 return new EnceinteConnecte(limiteVolts);
		default:
			return null;
		}
	}
}
