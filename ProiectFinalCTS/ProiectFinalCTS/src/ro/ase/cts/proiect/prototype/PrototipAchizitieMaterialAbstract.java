package ro.ase.cts.proiect.prototype;

public abstract class PrototipAchizitieMaterialAbstract implements Cloneable{
	String numeMaterial;
	double greutateMaterial;
	boolean esteFragil;
	double pretMaterial;
	int cantitate;
	String numeMagazin;
	boolean esteMagazinOnline;
	boolean acceptaPlataCard;
	int timpLivrare;
	String dataComanda;
	
	public PrototipAchizitieMaterialAbstract(String numeMaterial,
			double greutateMaterial, boolean esteFragil, double pretMaterial,
			int cantitate, String numeMagazin, boolean esteMagazinOnline,
			boolean acceptaPlataCard, int timpLivrare, String dataComanda) {
		super();
		this.numeMaterial = numeMaterial;
		this.greutateMaterial = greutateMaterial;
		this.esteFragil = esteFragil;
		this.pretMaterial = pretMaterial;
		this.cantitate = cantitate;
		this.numeMagazin = numeMagazin;
		this.esteMagazinOnline = esteMagazinOnline;
		this.acceptaPlataCard = acceptaPlataCard;
		this.timpLivrare = timpLivrare;
		this.dataComanda = dataComanda;
	}

	public abstract void trimiteComanda();
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getNumeMaterial() {
		return numeMaterial;
	}

	public void setNumeMaterial(String numeMaterial) {
		this.numeMaterial = numeMaterial;
	}

	public double getGreutateMaterial() {
		return greutateMaterial;
	}

	public void setGreutateMaterial(double greutateMaterial) throws Exception {
		if(greutateMaterial<=100)
			throw new Exception();
		this.greutateMaterial = greutateMaterial;
	}

	public boolean isEsteFragil() {
		return esteFragil;
	}

	public void setEsteFragil(boolean esteFragil) {
		this.esteFragil = esteFragil;
	}

	public double getPretMaterial() {
		return pretMaterial;
	}

	public void setPretMaterial(double pretMaterial) {
		this.pretMaterial = pretMaterial;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) throws Exception {
		if(cantitate<30)
			throw new Exception();
		this.cantitate = cantitate;
	}

	public String getNumeMagazin() {
		return numeMagazin;
	}

	public void setNumeMagazin(String numeMagazin) {
		this.numeMagazin = numeMagazin;
	}

	public boolean isEsteMagazinOnline() {
		return esteMagazinOnline;
	}

	public void setEsteMagazinOnline(boolean esteMagazinOnline) {
		this.esteMagazinOnline = esteMagazinOnline;
	}

	public boolean isAcceptaPlataCard() {
		return acceptaPlataCard;
	}

	public void setAcceptaPlataCard(boolean acceptaPlataCard) {
		this.acceptaPlataCard = acceptaPlataCard;
	}

	public int getTimpLivrare() {
		return timpLivrare;
	}

	public void setTimpLivrare(int timpLivrare) throws Exception {
		if(timpLivrare>=31)
			throw new Exception();
		this.timpLivrare = timpLivrare;
	}

	public String getDataComanda() {
		return dataComanda;
	}

	public void setDataComanda(String dataComanda) {
		this.dataComanda = dataComanda;
	}
	
	
	

	

}
