package ro.ase.cts.proiect.test;

import ro.ase.cts.proiect.flyweight.StadiuConstructie;
import junit.framework.TestCase;

public class TestDataCurentaStadiuConstructie extends TestCase {

	public TestDataCurentaStadiuConstructie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetDataValoriNormale(){
		
		StadiuConstructie stadiu = new StadiuConstructie(60, "12.02.2016");
		
		String data = "01.02.2016";
		
		try{
			stadiu.setData(data);
		}
		catch(Exception ex){
			
		}
		assertEquals("Probleme la setter pe valori normale", 
				data,stadiu.getData());	
	}

}
