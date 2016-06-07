package ro.ase.cts.proiect.template;

import ro.ase.cts.proiect.builder.BuilderAchizitieMaterialRomConstruct;
import ro.ase.cts.proiect.command.ManagerComenzi;
import ro.ase.cts.proiect.composite.Constructor;
import ro.ase.cts.proiect.composite.CoordonatorEchipa;
import ro.ase.cts.proiect.exceptii.ExceptieStareAngajatIncorecta;
import ro.ase.cts.proiect.flyweight.FlyweightConstructie;
import ro.ase.cts.proiect.flyweight.FlyweightFactory;
import ro.ase.cts.proiect.flyweight.StadiuConstructie;
import ro.ase.cts.proiect.flyweight.TipConstructie;
import ro.ase.cts.proiect.prototype.PrototipAchizitieMaterialRomConstruct;
import ro.ase.cts.proiect.state.StareAngajatOreComplete;
import ro.ase.cts.proiect.state.StareAngajatRestantOre;

public class ConstructiiFirmaConstructSRL extends TemplateAplicatieFirmaConstructii{

	public static Constructor angajatCurent;
	
	@Override
	public void monitorizareConstructii() {
		//utilizare flyweight
		
		FlyweightFactory factory = new FlyweightFactory();
		FlyweightConstructie cladirePipera = new FlyweightConstructie(factory.getScheletConstructie(TipConstructie.BIROURI));
		FlyweightConstructie cladirePiataVictoriei = new FlyweightConstructie(factory.getScheletConstructie(TipConstructie.BIROURI));
		FlyweightConstructie shoppingCenterCrangasi = new FlyweightConstructie(factory.getScheletConstructie(TipConstructie.MALL));
		cladirePipera.afisareProgres(new StadiuConstructie(70, "02 Martie 2016"));
		cladirePiataVictoriei.afisareProgres(new StadiuConstructie(30, "14 Mai 2016"));
		shoppingCenterCrangasi.afisareProgres(new StadiuConstructie(50, "19 Mai 2016"));
		cladirePiataVictoriei.afisareProgres(new StadiuConstructie(40, "30 Mai 2016"));
	}

	@Override
	public void gestionarePersonal() throws Exception {
		//utilizare composite
		
		Constructor constructorSchela = new Constructor("Matei Ion", "constructor schela", 163);
		Constructor constructorSantier = new Constructor("Mircea Andrei", "constructor santier", 162);
		Constructor constructorEscavator = new Constructor("Popescu Adrian", "constructor escavator", 168);
		
		Constructor grafician = new Constructor("Petrea Eliza","grafician", 167);
		
		CoordonatorEchipa coordonatorEchipaTeren = new CoordonatorEchipa("Alexe Lucian", "echipa teren", false);
		
		CoordonatorEchipa coordonatorEchipaProiectare = new CoordonatorEchipa("Popa Alexandru", "echipa proiectare", true);
		CoordonatorEchipa coordonatorEchipaDesign = new CoordonatorEchipa("Manea Ana", "echipa design", true);
		
		CoordonatorEchipa arhitect = new CoordonatorEchipa("Ciobanu Andreea", "echipa constructii firma ConstructSRL", true);
		
		coordonatorEchipaTeren.adaugaSubordonat(constructorSchela);
		coordonatorEchipaTeren.adaugaSubordonat(constructorSantier);
		coordonatorEchipaTeren.adaugaSubordonat(constructorEscavator);
		
		coordonatorEchipaDesign.adaugaSubordonat(grafician);
		coordonatorEchipaProiectare.adaugaSubordonat(coordonatorEchipaDesign);
		
		arhitect.adaugaSubordonat(coordonatorEchipaTeren);
		arhitect.adaugaSubordonat(coordonatorEchipaProiectare);
		
		System.out.println("\nActivitate angajati: \n"+arhitect.getInformatii());
		
		//utilizare singleton, state, command
		
		ManagerComenzi managerComenzi = ManagerComenzi.getManagerComenzi();
		verificaAngajat(constructorSchela);
		verificaAngajat(constructorSantier);
		verificaAngajat(constructorEscavator);
		verificaAngajat(grafician);
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		verificaAngajat(grafician);
		managerComenzi.executaComanda();
	}
	
	public void verificaAngajat(Constructor angajat){
		int oreMuncaLunaCurenta = 168;
		angajatCurent = angajat;
		try {
			if(angajatCurent.getOreLucrate()!=oreMuncaLunaCurenta){
				angajatCurent.setStare(new StareAngajatRestantOre());
				angajatCurent.asignareResponsabilitati();
			}else{
				angajatCurent.setStare(new StareAngajatOreComplete());
				angajatCurent.asignareResponsabilitati();
			}
		} catch (ExceptieStareAngajatIncorecta e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void achizitionareMaterialeConstructii() throws Exception {
		// utilizare builder, prototyple
		
		PrototipAchizitieMaterialRomConstruct achizitieBeton =
				new BuilderAchizitieMaterialRomConstruct("Beton", "RomConstruct")
				.setGreutateMaterial(2000)
				.esteFragil()
				.setPretMaterial(500)
				.setCantitate(20)
				.esteMagazinOnline()
				.acceptaPlataCard()
				.setTimpLivrare(7)
				.setDataComanda("01.06.2016")
				.build();
		
		achizitieBeton.trimiteComanda();
		System.out.println("Comanda esuata. Trimiteti din nou.");
		
		try {
			PrototipAchizitieMaterialRomConstruct achizitieBeton2 = 
					(PrototipAchizitieMaterialRomConstruct) achizitieBeton.clone();
			achizitieBeton2.trimiteComanda();
			System.out.println("Comanda a fost trimisa cu succes.");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
