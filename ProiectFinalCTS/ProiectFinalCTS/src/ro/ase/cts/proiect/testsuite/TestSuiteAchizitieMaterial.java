package ro.ase.cts.proiect.testsuite;

import ro.ase.cts.proiect.test.TestAchizitieGreutate;
import ro.ase.cts.proiect.test.TestAchizitieTimpLivrare;
import ro.ase.cts.proiect.test.TestCantitateAchizitie;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteAchizitieMaterial {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestAchizitieGreutate.class);
		suite.addTestSuite(TestAchizitieTimpLivrare.class);
		suite.addTestSuite(TestCantitateAchizitie.class);
		return suite;
	}

}
