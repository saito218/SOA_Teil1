package bean;

import java.io.Serializable;

public class Preisbean implements Serializable{

	private double netto;
	private String steuerklasse;
	private double brutto;
	
	
	public Preisbean() {
	}

	public Preisbean(double netto, String steuerklasse) {
		this.netto = netto;
		this.steuerklasse = steuerklasse;
	}

	public double getNetto() {
		return netto;
	}

	public void setNetto(double netto) {
		this.netto = netto;
	}

	public String getSteuerklasse() {
		return steuerklasse;
	}

	public void setSteuerklasse(String steuerklasse) {
		this.steuerklasse = steuerklasse;
	}

	public double getBrutto() {
		if(steuerklasse.equals("V")) {
			brutto=netto*1.19;
		}else if(steuerklasse.equals("H")) {
			brutto=netto*1.07;
		}else if(steuerklasse.equals("R")) {
			brutto=netto*1.05;
		}
		
		
		return brutto;
	}

	public void setBrutto(double brutto) {
		this.brutto = brutto;
	}
	
	
	
}
