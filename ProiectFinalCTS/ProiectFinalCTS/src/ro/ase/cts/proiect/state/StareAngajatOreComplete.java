package ro.ase.cts.proiect.state;

import ro.ase.cts.proiect.command.ComandaTrimitereRaport;
import ro.ase.cts.proiect.command.ManagerComenzi;
import ro.ase.cts.proiect.template.ConstructiiFirmaConstructSRL;

public class StareAngajatOreComplete extends StareAngajat{

	@Override
	public void asignareResponsabilitati() {
		ManagerComenzi.adaugaComanda(new ComandaTrimitereRaport(ConstructiiFirmaConstructSRL.angajatCurent));
	}

}
