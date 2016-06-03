package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.prototype.PrototipAchizitieMaterialRomConstruct;
import junit.framework.TestCase;

public class TestAchizitieTimpLivrare extends TestCase {

	public TestAchizitieTimpLivrare(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testTimpLivrarePesteMaxim(){
		int timp = 31;
		try{
			PrototipAchizitieMaterialRomConstruct achizitie = new PrototipAchizitieMaterialRomConstruct
					("a", 300, true, 20, 26, "b", true, true, 3, "02.02.2016");
		
		achizitie.setTimpLivrare(timp);
		fail("Accepta timp mai mare de 31 de zile");
		}
		catch(Exception e){
			
		}
	
	}

}
