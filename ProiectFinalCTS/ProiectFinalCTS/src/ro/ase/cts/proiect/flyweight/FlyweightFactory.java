package ro.ase.cts.proiect.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	
	HashMap<TipConstructie, ScheletConstructie> schelete = new HashMap<>();
	
	public ScheletConstructie getScheletConstructie(TipConstructie tip){
		ScheletConstructie constructie = schelete.get(tip);
		if(constructie == null){
			switch (tip) {
			case BIROURI:
				constructie = new CladireBirouri();
				constructie.setMaterialUtilizat("beton");
				constructie.setDurataIncarcare("20 secunde");
				schelete.put(tip, constructie);
				break;
				
			case MALL:
				constructie = new CladireShoppingMall();
				constructie.setMaterialUtilizat("metal");
				constructie.setDurataIncarcare("15 secunde");
				schelete.put(tip, constructie);
				break;
			}
		}
		
		return constructie;
	}

}
