package ro.ase.cts.proiect.flyweight;

public class FlyweightConstructie implements IFlyweightConstructie{
	
	//stare permanenta
	public ScheletConstructie schelet;

	public FlyweightConstructie(ScheletConstructie schelet) {
		super();
		this.schelet = schelet;
	}

	@Override
	public void afisareProgres(StadiuConstructie stadiuConstructie) {
		this.schelet.afisareDateInitialeConstructie();
		System.out.println("Progres constructie "+stadiuConstructie.progres+"% la data de "+stadiuConstructie.getData());
		
	}
	
	

}
