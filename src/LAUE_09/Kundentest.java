package LAUE_09;

import java.util.ArrayList;
import java.util.List;

public class Kundentest {

	public static void main(String[] args) {
		List<Kunde> kundenListe = new ArrayList<>();


		kundenListe.add(new Kunde("Heinz", "Müller"));
		kundenListe.add(new Kunde("Sabine", "Weber"));
		kundenListe.add(new Kunde("Anna", "Schmidt"));
		kundenListe.add(new Kunde("Lars", "Meier"));
		kundenListe.add(new Kunde("Tom", "Becker"));

		Kunde manu = new Kunde("Manuela", "Fischer");
		manu.setRabatt(7.5);
		manu.setEinstufung(2);
		kundenListe.add(manu);
		Kunde ulrich = new Kunde("Ulrich", "König");
		kundenListe.add(ulrich);

		for (Kunde k : kundenListe) {
			k.showKundenInfo();
			System.out.println("–––––––––––––––––––––");
		}
	}
}
