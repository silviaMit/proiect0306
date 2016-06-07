package ro.ase.cts.proiect.composite;

import java.util.List;

public abstract class Angajat {
	
	public abstract String getInformatii();
	public abstract int getOreLucrate();
	
	public abstract void adaugaSubordonat(Angajat angajat);
	public abstract void stergeSubordonat(Angajat angajat);
	public abstract List<Angajat> getSubordonati();

}
