package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.composite.Constructor;
import junit.framework.TestCase;

public class TestPostConstructor extends TestCase {

	public TestPostConstructor(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testPostNullInConstructor(){
		String post = null;
		try {
			Constructor muncitor = new Constructor("Ion",post,3);
			fail("Constructor implementat gresit pentru null");
		} catch (Exception e) {
			//e.printStackTrace();
		}	
	}
}
