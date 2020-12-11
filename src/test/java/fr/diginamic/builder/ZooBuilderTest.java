package fr.diginamic.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.diginamic.builder.entity.Dragon;
import fr.diginamic.builder.entity.Zoo;
import fr.diginamic.builder.entity.ZooBuilder;
import fr.diginamic.builder.exception.ZoneException;

public class ZooBuilderTest {
	
	ZooBuilder zooBuilder;
	
	@Before
	public void init() {
		zooBuilder = new ZooBuilder("Zoo de la terre du milieu");
	}

	@Test
	public void testAppendZone() {
		zooBuilder.appendZone("Zone des dragons", 5);
		
		Zoo zoo = zooBuilder.get();
		
		assertEquals(1, zoo.getZones().size());
		assertEquals("Zone des dragons", zoo.getZones().get(0).getNom());
	}
	
	@Test
	public void testAppendAnimal() {
		Dragon drag = new Dragon("Pupuce");
		
		zooBuilder.appendZone("Zone des dragons", 5).appendAnimal("Zone des dragons", drag);
		
		Zoo zoo = zooBuilder.get();
		
		assertEquals("Pupuce", zoo.getZones().get(0).getAnimaux().get(0).getNom());
	}
	
	@Test (expected = ZoneException.class)
	public void testAppendAnimalDepacement() throws ZoneException {
		Dragon drag = new Dragon("Pupuce");
		
		zooBuilder.appendZone("Zone des dragons", 5);
		
		for (int i = 0; i < 6; i++) {
			zooBuilder.appendAnimal("Zone des dragons", drag);
		}
	}

}
