package fr.diginamic.composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.diginamic.composite.entities.Departement;
import fr.diginamic.composite.entities.Employe;

public class TestComposite {
	
	Departement dsin;
	Departement bigData;
	Departement javaDev;
	
	Employe empDsin1;

	@Before
	public void init() {
		dsin = new Departement();
		empDsin1 = new Employe(10000, "RASPEY", "Cécile");
		Employe empDsin2 = new Employe(8000, "BECHKAR", "BILEL");
		
		dsin.addIElement(empDsin1);
		dsin.addIElement(empDsin2);
		
		bigData = new Departement();
		Employe empBigData1 = new Employe(7500, "RAMMEY", "Jean");
		Employe empBigData2 = new Employe(3500, "ZOUZOU", "Michou");
		
		bigData.addIElement(empBigData1);
		bigData.addIElement(empBigData2);
		
		javaDev = new Departement();
		Employe empJavaDev1 = new Employe(7500, "MATHY", "Minie");
		Employe empJavaDev2 = new Employe(3500, "SARDINE", "Greg");
		
		javaDev.addIElement(empJavaDev1);
		javaDev.addIElement(empJavaDev2);
		
		
		dsin.addIElement(bigData);
		dsin.addIElement(javaDev);
	}
	
	@Test
	public void testCalculerSalaire() {
		assertEquals(10000, empDsin1.calculerSalaire(), 00000.1);
		
		assertEquals(40000, dsin.calculerSalaire(), 00000.1);
	}

}
