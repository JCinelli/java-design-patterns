package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.diginamic.factory.ObjCoFactory;
import fr.diginamic.factory.entity.EnceinteConnecte;
import fr.diginamic.factory.entity.ObjetConnecte;
import fr.diginamic.factory.entity.Tablette;
import fr.diginamic.factory.entity.TelephonePortable;
import fr.diginamic.factory.enums.TypeObjCo;

public class FactoryTest {
	
	ObjCoFactory objCoFactory;
	
	@Test
	public void testCaseTel() {
		ObjetConnecte createObjCo = ObjCoFactory.createObjCo(TypeObjCo.Téléphone_Portable, 150);
		
		assertEquals(TelephonePortable.class, createObjCo.getClass());
	}
	
	@Test
	public void testCaseTabl() {
		ObjetConnecte tablette = ObjCoFactory.createObjCo(TypeObjCo.Tablette, 1552);
		
		assertEquals(Tablette.class, tablette.getClass());
	}
	
	@Test
	public void testCaseEnce() {
		ObjetConnecte enceinte = ObjCoFactory.createObjCo(TypeObjCo.Enceinte_Connectee, 1454);
		
		assertEquals(EnceinteConnecte.class, enceinte.getClass());
	}

}
