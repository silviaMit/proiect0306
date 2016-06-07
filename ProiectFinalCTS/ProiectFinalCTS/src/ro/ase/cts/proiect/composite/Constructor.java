package ro.ase.cts.proiect.composite;

import java.util.List;

import ro.ase.cts.proiect.exceptii.ExceptieStareAngajatIncorecta;
import ro.ase.cts.proiect.state.StareAngajat;
import ro.ase.cts.proiect.state.StareAngajatOreComplete;
import ro.ase.cts.proiect.state.StareAngajatRestantOre;

public class Constructor extends Angajat {
	String nume;
	String post;
	int oreLucrate;
	StareAngajat stare;

	public Constructor(String nume, String post, int oreLucrate) throws Exception {
		super();
		if(nume==null || post==null){
			throw new Exception("Valori nule in constructor");
		
		}
		this.nume = nume;
		this.post = post;
		this.oreLucrate = oreLucrate;
		stare = new StareAngajatRestantOre();
	}

	@Override
	public String getInformatii() {
		return this.nume + " pe postul de "+this.post+" a lucrat "+this.oreLucrate+" ore.";
	}

	@Override
	public int getOreLucrate() {
		return this.oreLucrate;
	}

	@Override
	public void adaugaSubordonat(Angajat angajat) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void stergeSubordonat(Angajat angajat) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public List<Angajat> getSubordonati() {
		throw new UnsupportedOperationException();
	}
	
	public void setStare(StareAngajat stareNoua) throws ExceptieStareAngajatIncorecta {
		if(stare instanceof StareAngajatOreComplete)
			if(stareNoua instanceof StareAngajatRestantOre)
				throw new ExceptieStareAngajatIncorecta();
		
		this.stare = stareNoua;
	}
	
	public void asignareResponsabilitati(){
		this.stare.asignareResponsabilitati();
	}
	
	public void muncesteSuplimentar(){
		System.out.println(this.nume+" are "+this.oreLucrate+" ore si munceste suplimentar");
		this.oreLucrate++;
	}
	
	public void trimiteRaportActivitate(){
		System.out.println(this.nume+" are "+this.oreLucrate+" ore si trimite raport activitate");
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public StareAngajat getStare() {
		return stare;
	}

	public void setOreLucrate(int oreLucrate) {
		this.oreLucrate = oreLucrate;
	}

}
