package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.composite.Constructor;
import junit.framework.TestCase;

public class TestOreLucrateConstructor extends TestCase {

	public TestOreLucrateConstructor(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSetOreLucrateValoriNormale() throws Exception{
		Constructor muncitor = new Constructor("Ionut", "sofer", 18);
		
		int ore = 23;
		
		try {
			muncitor.setOreLucrate(ore);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Probleme la setter pe valori normale", 
				ore,muncitor.getOreLucrate());	
	}
}
