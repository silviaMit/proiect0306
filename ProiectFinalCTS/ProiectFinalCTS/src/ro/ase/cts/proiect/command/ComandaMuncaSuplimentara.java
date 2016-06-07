package ro.ase.cts.proiect.command;

import ro.ase.cts.proiect.composite.Constructor;

public class ComandaMuncaSuplimentara extends Comanda{

	Constructor angajat;
	
	public ComandaMuncaSuplimentara(Constructor angajat) {
		super();
		this.angajat = angajat;
	}


	@Override
	public void asigneazaSarcina() {
		this.angajat.muncesteSuplimentar();
		
	}

}
