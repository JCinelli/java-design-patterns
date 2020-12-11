package fr.diginamic.singletons;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigSingletonTest {

	@Test
	public void testUrl() {
		String value = ConfigSingleton.getInstance().getParam("db.url");
		
		assertEquals("jdbc:mysql://localhost:3306/mabase", value);
	}
	
	@Test
	public void testUser() {
		String value = ConfigSingleton.getInstance().getParam("db.user");
		
		assertEquals("root", value);
	}
	
	@Test
	public void testPass() {
		String value = ConfigSingleton.getInstance().getParam("db.password");
		
		assertEquals("1234", value);
	}

}
