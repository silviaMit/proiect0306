package ro.ase.cts.proiect.flyweight;

public class StadiuConstructie {
	int progres;
	String dataCurenta;

	public String getData() {
		return dataCurenta;
	}

	public void setData(String dataCurenta) {
		this.dataCurenta = dataCurenta;
	}

	public int getProgres() {
		return progres;
	}

	public void setProgres(int progres) throws Exception {
		if(progres<0)
			throw new Exception();
		this.progres = progres;
	}

	public StadiuConstructie(int progres, String dataCurenta) {
		super();
		this.progres = progres;
		this.dataCurenta = dataCurenta;
	}
	

}
