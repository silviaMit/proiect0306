package ro.ase.cts.proiect.builder;

import javax.annotation.Generated;

import ro.ase.cts.proiect.prototype.PrototipAchizitieMaterialRomConstruct;

public class BuilderAchizitieMaterialRomConstruct {
	
	private PrototipAchizitieMaterialRomConstruct achizitie = null;
	
	public BuilderAchizitieMaterialRomConstruct(String numeMaterial, String numeMagazin){
		this.achizitie = 
				new PrototipAchizitieMaterialRomConstruct(numeMaterial, 0, true, 0, 0, numeMagazin,
				                                             false, false, 0, "01.01.2016");
	}
	
	public PrototipAchizitieMaterialRomConstruct build(){
		return this.achizitie;
	}
	
	public BuilderAchizitieMaterialRomConstruct setGreutateMaterial(double greutate) throws Exception{
		this.achizitie.setGreutateMaterial(greutate);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct esteFragil(){
		this.achizitie.setEsteFragil(true);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct setPretMaterial(double pret){
		this.achizitie.setPretMaterial(pret);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct setCantitate(int cantitate) throws Exception{
		this.achizitie.setCantitate(cantitate);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct esteMagazinOnline(){
		this.achizitie.setEsteMagazinOnline(true);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct acceptaPlataCard(){
		this.achizitie.setAcceptaPlataCard(true);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct setTimpLivrare(int timpLivrare) throws Exception{
		this.achizitie.setTimpLivrare(timpLivrare);
		return this;
	}
	
	public BuilderAchizitieMaterialRomConstruct setDataComanda(String data){
		this.achizitie.setDataComanda(data);
		return this;
	}

}
