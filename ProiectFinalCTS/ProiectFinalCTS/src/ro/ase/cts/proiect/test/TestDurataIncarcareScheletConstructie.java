package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.flyweight.CladireBirouri;
import junit.framework.TestCase;

public class TestDurataIncarcareScheletConstructie extends TestCase {

	public TestDurataIncarcareScheletConstructie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetDurataValoriNormale() throws Exception{
		CladireBirouri cladire = new CladireBirouri();
		
		String val = "15";
		
		try {
			cladire.setDurataIncarcare(val);;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Probleme la setter pe valori normale", 
				val,cladire.getDurataIncarcare());	
	}
}
