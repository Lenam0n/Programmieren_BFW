package LAUE_09;

import java.util.Map;
import java.util.Random;

public class Kunde {

	private static final Map<Integer, String> einstufungen = Map.of(
																		1, "Neukunde", 
																		2, "Bestandskunde", 
																		3, "Sperrvermerk"
																	);
	
	private final int id;
	private final String vorname;
	private final String nachname;
	private double rabatt;
	private int einstufung;


	private Kunde(String vorname, String nachname, double rabatt, int einstufung) {
		this.id = this.createId();
		this.vorname = vorname;
		this.nachname = nachname;
		this.rabatt = rabatt;
		this.einstufung = einstufung;
	}

	public Kunde(String vorname, String nachname) { this(vorname, nachname, 0, 1); }

	private int createId() { 
		Random rnd = new Random();
		return 10000 + rnd.nextInt(90000); }
		//return 23237; }
	
	public int getId() { return this.id; }
	public String getVorname() { return this.vorname; }
	public String getNachname() { return this.nachname; }
	public double getRabatt() {	return this.rabatt;	}
	public int getEinstufung() { return this.einstufung; }

	public void setRabatt(double r) {
		if (r >= 1 && r <= 15) this.rabatt = r;
		else System.err.println("Fehler bei Rabatt-Vergabe: Rabatt muss zwischen 0 und 15 liegen, war:" + " " + r);
	}

	public void setEinstufung(int e) {
		if (e >= 1 && e <= 3) this.einstufung = e;
		else System.err.println("Einstufung ungültig:" + " " + e);
	}

	public void showKundenInfo() {
		System.out.println("KundenNr:" + " " + this.id);
		System.out.println("Vorname:" + " " + this.vorname);
		System.out.println("Nachname: " + " " + this.nachname);
		System.out.println("Kundenrabatt:" + " " + this.rabatt + "%");
		System.out.println(
				"Einstufung" + " " 
				+ einstufungen.get(this.einstufung)
				+ " " + "=" + " " 
				+ this.einstufung );
	}

}
