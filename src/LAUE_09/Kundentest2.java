package LAUE_09;

import utils.Result;

import java.util.ArrayList;
import java.util.List;

public class Kundentest2 {

    public static void main(String[] args) {
        List<Kunde2> kunden = new ArrayList<>();

        // 1) Kundenerzeugung mit Standardwerten
        Kunde2 k1 = new Kunde2("Heinz", "Müller");
        kunden.add(k1);

        // 2) Versuch, ungültigen Rabatt zu setzen
        Result<Double, String> r = k1.setRabatt(20.0);
        if (r.isError()) {
            System.err.println("Fehler bei Rabatt-Vergabe: " + r.getError());
        }

        // 3) Gültige Einstufung nachträglich setzen
        Result<Integer, String> e = k1.setEinstufung(2);
        if (e.isError()) {
            System.err.println("Fehler bei Einstufung: " + e.getError());
        }

        // 4) Zeige alle Infos
        for (Kunde2 k : kunden) {
            k.showKundenInfo();
            System.out.println("–––––––––––––––––––––");
        }
    }
}
