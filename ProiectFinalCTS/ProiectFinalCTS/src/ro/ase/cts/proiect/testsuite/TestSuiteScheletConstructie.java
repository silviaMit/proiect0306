package ro.ase.cts.proiect.testsuite;

import ro.ase.cts.proiect.test.TestDurataIncarcareScheletConstructie;
import ro.ase.cts.proiect.test.TestMaterialScheletConstructie;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteScheletConstructie {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestDurataIncarcareScheletConstructie.class);
		suite.addTestSuite(TestMaterialScheletConstructie.class);
		return suite;
	}

}
