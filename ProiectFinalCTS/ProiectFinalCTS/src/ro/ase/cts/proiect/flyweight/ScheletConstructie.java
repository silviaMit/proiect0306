package ro.ase.cts.proiect.flyweight;

import java.util.ArrayList;

public abstract class ScheletConstructie {
	
	String materialUtilizat;
	String durataIncarcare;
	
	public abstract void afisareDateInitialeConstructie();
	
	public String getMaterialUtilizat() {
		return materialUtilizat;
	}
	public void setMaterialUtilizat(String materialUtilizat) {
		this.materialUtilizat = materialUtilizat;
	}
	public String getDurataIncarcare() {
		return durataIncarcare;
	}
	public void setDurataIncarcare(String durataIncarcare) {
		this.durataIncarcare = durataIncarcare;
	}
	
	
	

}
