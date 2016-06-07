package ro.ase.cts.proiect.flyweight;

public class CladireShoppingMall extends ScheletConstructie{


	@Override
	public void afisareDateInitialeConstructie() {
		System.out.println("\nMaterial utilizat schelet shopping mall: "+this.getMaterialUtilizat()+". Durata incarcare in memorie date: "
				+this.getDurataIncarcare());
					
		
	}


}
