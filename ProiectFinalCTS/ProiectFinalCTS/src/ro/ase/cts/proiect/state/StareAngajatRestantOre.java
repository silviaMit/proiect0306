package ro.ase.cts.proiect.state;

import ro.ase.cts.proiect.command.ComandaMuncaSuplimentara;
import ro.ase.cts.proiect.command.ManagerComenzi;
import ro.ase.cts.proiect.template.ConstructiiFirmaConstructSRL;

public class StareAngajatRestantOre extends StareAngajat{

	@Override
	public void asignareResponsabilitati() {
		ManagerComenzi.adaugaComanda(new ComandaMuncaSuplimentara(ConstructiiFirmaConstructSRL.angajatCurent));
		
	}

}
