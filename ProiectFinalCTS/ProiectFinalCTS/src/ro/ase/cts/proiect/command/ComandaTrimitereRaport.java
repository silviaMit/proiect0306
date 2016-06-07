package ro.ase.cts.proiect.command;

import ro.ase.cts.proiect.composite.Constructor;

public class ComandaTrimitereRaport extends Comanda{

Constructor angajat;
	
	
	public ComandaTrimitereRaport(Constructor angajat) {
		super();
		this.angajat = angajat;
	}


	@Override
	public void asigneazaSarcina() {
		this.angajat.trimiteRaportActivitate();
		
	}

}
