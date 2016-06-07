package ro.ase.cts.proiect.composite;

import java.util.ArrayList;
import java.util.List;

public class CoordonatorEchipa extends Angajat{

	String nume;
	String echipaCoordonata;
	boolean esteDisponibil;
	ArrayList<Angajat> subordonati = new ArrayList<>();
	
	public CoordonatorEchipa(String nume, String echipaCoordonata,
			boolean esteDisponibil) {
		super();
		this.nume = nume;
		this.echipaCoordonata = echipaCoordonata;
		this.esteDisponibil = esteDisponibil;
	}

	@Override
	public String getInformatii() {
		StringBuilder sb= new StringBuilder();
		sb.append(this.nume + " coordoneaza "+this.echipaCoordonata+" cu urmatoarea activitate:\n");
		
		for(Angajat angajat : this.subordonati){
			sb.append(angajat.getInformatii()+"\n");
		}
		
		return sb.toString();
	}

	@Override
	public int getOreLucrate() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void adaugaSubordonat(Angajat angajat) {
		this.subordonati.add(angajat);
		
	}

	@Override
	public void stergeSubordonat(Angajat angajat) {
		if(this.subordonati.size()!=0)
		    this.subordonati.remove(angajat);
		
	}

	@Override
	public List<Angajat> getSubordonati() {
		if(this.subordonati.size()!=0){
			return this.subordonati;
		}
		throw new UnsupportedOperationException();
	}
	

}
