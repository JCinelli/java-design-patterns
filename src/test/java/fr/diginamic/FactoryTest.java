package fr.diginamic;

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
	
	@Before
	public void init() {
		objCoFactory  = new ObjCoFactory();
	}

	@Test
	public void testCaseTel() {
		ObjetConnecte createObjCo = ObjCoFactory.createObjCo(TypeObjCo.Téléphone_Portable, 150);
		
		assertEquals(createObjCo.getClass(), TelephonePortable.class);
	}
	
	@Test
	public void testCaseTabl() {
		ObjetConnecte tablette = ObjCoFactory.createObjCo(TypeObjCo.Tablette, 1552);
		
		assertEquals(tablette.getClass(), Tablette.class);
	}
	
	@Test
	public void testCaseEnce() {
		ObjetConnecte enceinte = ObjCoFactory.createObjCo(TypeObjCo.Enceinte_Connectee, 1454);
		
		assertEquals(enceinte.getClass(), EnceinteConnecte.class);
	}

}
