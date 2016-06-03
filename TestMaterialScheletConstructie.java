package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.composite.Constructor;
import ro.ase.cts.proiect.flyweight.CladireBirouri;
import junit.framework.TestCase;

public class TestMaterialScheletConstructie extends TestCase {

	public TestMaterialScheletConstructie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetMaterialValoriNormale() throws Exception{
		CladireBirouri cladire = new CladireBirouri();
		
		String mat = "metal";
		
		try {
			cladire.setMaterialUtilizat(mat);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Probleme la setter pe valori normale", 
				mat,cladire.getMaterialUtilizat());	
	}
}
