package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.prototype.PrototipAchizitieMaterialRomConstruct;
import junit.framework.TestCase;

public class TestCantitateAchizitie extends TestCase {

	public TestCantitateAchizitie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCantitateMinima() throws Exception{
		int cantitateMin = 30;
		
			PrototipAchizitieMaterialRomConstruct achizitie = new PrototipAchizitieMaterialRomConstruct
					("a", 300, true, 20, 26, "b", true, true, 3, "02.02.2016");
		
		achizitie.setCantitate(cantitateMin);
		assertEquals("Verificare setCantitate cu valoare minima",
				cantitateMin,achizitie.getCantitate());
	
	}

}
