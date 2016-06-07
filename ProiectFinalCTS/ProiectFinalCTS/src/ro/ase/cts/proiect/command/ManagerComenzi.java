package ro.ase.cts.proiect.command;

import java.util.ArrayList;

public class ManagerComenzi {
	
	private static ManagerComenzi singleton = null;
	
	private static ArrayList<Comanda> comenziAngajati = new ArrayList<>();
	
	public static ManagerComenzi getManagerComenzi(){
		if(singleton == null)
			singleton = new ManagerComenzi();
		
		return singleton;
	}
	
	public static void adaugaComanda(Comanda comanda){
		comenziAngajati.add(comanda);
	}
	
	public void executaComanda(){
		if(this.comenziAngajati.size()!=0)
		{
			this.comenziAngajati.get(0).asigneazaSarcina();
			this.comenziAngajati.remove(0);
		}
		
	}
}
