package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.prototype.PrototipAchizitieMaterialRomConstruct;
import junit.framework.TestCase;

public class TestAchizitieGreutate extends TestCase {

	public TestAchizitieGreutate(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSubGreutateMinima(){
		int greutateNoua = 100;
		try{
			PrototipAchizitieMaterialRomConstruct achizitie = new PrototipAchizitieMaterialRomConstruct
					("a", 300, true, 20, 26, "b", true, true, 3, "02.02.2016");
		
		achizitie.setGreutateMaterial(greutateNoua);
		fail("Accepta greutate < 100");
		}
		catch(Exception e){
			
		}
	
	}
}
