package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.flyweight.StadiuConstructie;
import junit.framework.TestCase;

public class TestProgresStadiuConstructie extends TestCase {

	public TestProgresStadiuConstructie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetProgresValoriNegative(){
		
		StadiuConstructie stadiu = new StadiuConstructie(60, "12.02.2016");
		
		int valoareNegativa = -70;
		
		try{
			stadiu.setProgres(valoareNegativa);
			fail("Metoda nu arunca exceptie pe valori negative");
		}
		catch(Exception ex){
			
		}
		
	}

}
