package Übungsaufgaben.A5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Verwaltung {
    private List<Verkehrsmittel> v;

    public Verwaltung() { this.v = List.of(); }
    public Verwaltung(Verkehrsmittel... initial) {
        this();
        add(initial);
    }

    private void setVerkehrsmittel(List<Verkehrsmittel> neueListe) {  this.v = List.copyOf(neueListe); }
    public List<Verkehrsmittel> getVerkehrsmittel() { return this.v; }

    public void add(Verkehrsmittel... neue) {
        var copy = new ArrayList<Verkehrsmittel>(v);
        Collections.addAll(copy, neue);
        setVerkehrsmittel(copy);
    }

    public boolean buchen(Verkehrsmittel vm, int anzahl) {
        try {
            if (!this.v.contains(vm)) { throw new BuchungsException("Verkehrsmittel nicht in der Verwaltung: " + vm); }
            return vm.bucheSitze(anzahl);
        } catch (BuchungsException e) {
            System.err.println("Fehler bei der Buchung: " + e.getMessage());
            return false;
        }
    }


}
