package ro.ase.cts.proiect.prototype;

public class PrototipAchizitieMaterialRomConstruct extends PrototipAchizitieMaterialAbstract{

	public PrototipAchizitieMaterialRomConstruct(String numeMaterial,
			double greutateMaterial, boolean esteFragil, double pretMaterial,
			int cantitate, String numeMagazin, boolean esteMagazinOnline,
			boolean acceptaPlataCard, int timpLivrare, String dataComanda) {
		super(numeMaterial, greutateMaterial, esteFragil, pretMaterial, cantitate,
				numeMagazin, esteMagazinOnline, acceptaPlataCard, timpLivrare,
				dataComanda);
		System.out.println("\nAsteptati. Se genereaza comanda...");
	}

	@Override
	public void trimiteComanda() {
		System.out.println("\nSe trimite comanda:");
		System.out.println("Material: "+this.numeMaterial);
		System.out.println("Greutate material: "+this.greutateMaterial);
		if(this.isEsteFragil()){
			System.out.println("Material fragil");
		}
		System.out.println("Pret: "+this.pretMaterial);
		System.out.println("Cantitate: "+this.cantitate);
		System.out.println("Nume magazin: "+this.numeMagazin);
		if(this.isEsteMagazinOnline()){
			System.out.println("Este magazin online");
		}
		if(this.acceptaPlataCard){
			System.out.println("Accepta plata cu cardul");
		}
		System.out.println("Timp livrare: "+this.timpLivrare);
		System.out.println("Data comenzii: "+this.dataComanda);
		
	}
	
	

}
