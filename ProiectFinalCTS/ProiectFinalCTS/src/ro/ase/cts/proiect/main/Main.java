package ro.ase.cts.proiect.main;

import ro.ase.cts.proiect.template.ConstructiiFirmaConstructSRL;
import ro.ase.cts.proiect.template.TemplateAplicatieFirmaConstructii;

public class Main {

	public static void main(String[] args) {
		// utilizare template
		TemplateAplicatieFirmaConstructii aplicatie = new ConstructiiFirmaConstructSRL();
		try {
			aplicatie.initializare();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
