package ro.ase.cts.proiect.flyweight;

public class CladireBirouri extends ScheletConstructie {
	
	@Override
	public void afisareDateInitialeConstructie() {
		System.out.println("\nMaterial utilizat schelet cladire birouri: "+this.getMaterialUtilizat()+". Durata incarcare in memorie date: "
	+this.getDurataIncarcare());
		
	}

}
