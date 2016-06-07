package ro.ase.cts.proiect.template;

public abstract class TemplateAplicatieFirmaConstructii {
	
	public final void initializare() throws Exception{
		System.out.println("Se deschide aplicatia...");
		monitorizareConstructii();
		gestionarePersonal();
		achizitionareMaterialeConstructii();
	}
	
	public abstract void monitorizareConstructii();
	public abstract void gestionarePersonal() throws Exception;
	public abstract void achizitionareMaterialeConstructii() throws Exception;

}
