package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.composite.Constructor;
import junit.framework.TestCase;

public class TestNumeConstructor extends TestCase {

	public TestNumeConstructor(String name) {
		super(name);
		System.out.println("Initializare TestCase");
	}

	protected void setUp() throws Exception {
		System.out.println("Pregatire test");
	}

	protected void tearDown() throws Exception {
		System.out.println("Finalizare test");
	}
	
	public void testNumeNullInConstructor(){
		String nume = null;
		try {
			Constructor muncitor = new Constructor(nume,"muncitor",3);
			fail("Constructor implementat gresit pentru null");
		} catch (Exception e) {
			//e.printStackTrace();
		}	
	}

}
