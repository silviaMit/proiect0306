package ro.ase.cts.proiect.testsuite;

import ro.ase.cts.proiect.test.TestNumeConstructor;
import ro.ase.cts.proiect.test.TestOreLucrateConstructor;
import ro.ase.cts.proiect.test.TestPostConstructor;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteClasaConstructor {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestNumeConstructor.class);
		suite.addTestSuite(TestOreLucrateConstructor.class);
		suite.addTestSuite(TestPostConstructor.class);
		return suite;
	}

}
