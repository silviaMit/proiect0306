package ro.ase.cts.proiect.testsuite;

import ro.ase.cts.proiect.test.TestDataCurentaStadiuConstructie;
import ro.ase.cts.proiect.test.TestProgresStadiuConstructie;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteStadiuConstructie {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestDataCurentaStadiuConstructie.class);
		suite.addTestSuite(TestProgresStadiuConstructie.class);
		return suite;
	}

}
