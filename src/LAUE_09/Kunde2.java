package LAUE_09;

import utils.Result;
import utils.ValidationUtils;

import java.util.Map;
import java.util.Random;

public class Kunde2 {

    private static final Map<Integer, String> EINSTUFUNGEN =
        Map.of(1, "Neukunde", 2, "Bestandskunde", 3, "Sperrvermerk");

    private final int id;
    private final String vorname;
    private final String nachname;
    private double rabatt;
    private int einstufung;

    // Haupt-Konstruktor (private, chaining)
    private Kunde2(String vorname, String nachname, double rabatt, int einstufung) {
        this.id = createId();
        this.vorname = vorname;
        this.nachname = nachname;
        setRabatt(rabatt);
        setEinstufung(einstufung);
    }

    public Kunde2(String vorname, String nachname) {
        this(vorname, nachname, 0.0, 1);
    }

    private int createId() {
        Random rnd = new Random();
        return 10000 + rnd.nextInt(90000);
    }

    public int getId()           { return id; }
    public String getVorname()   { return vorname; }
    public String getNachname()  { return nachname; }
    public double getRabatt()    { return rabatt; }
    public int getEinstufung()   { return einstufung; }

    /**
     * Setzt den Rabatt nur, wenn er zwischen 0 und 15 liegt.
     * @return ein Result mit new rabatt oder Fehlermeldung
     */
    public Result<Double, String> setRabatt(double r) {
        Result<Double, String> result = ValidationUtils.validate(
            r,
            v -> v >= 0.0 && v <= 15.0,
            "Rabatt muss zwischen 0 und 15 liegen, war: " + r
        );
        if (result.isSuccess()) {
            this.rabatt = result.getValue();
        }
        return result;
    }

    /**
     * Setzt die Einstufung nur, wenn sie 1,2 oder 3 ist.
     * @return ein Result mit new einstufung oder Fehlermeldung
     */
    public Result<Integer, String> setEinstufung(int e) {
        Result<Integer, String> result = ValidationUtils.validate(
            e,
            v -> EINSTUFUNGEN.containsKey(v),
            "Einstufung ungültig: " + e
        );
        if (result.isSuccess()) this.einstufung = result.getValue();
        return result;
    }

    public void showKundenInfo() {
        System.out.println("KundenNr:    " + id);
        System.out.println("Vorname:     " + vorname);
        System.out.println("Nachname:    " + nachname);
        System.out.println("Rabatt:      " + rabatt + "%");
        System.out.println("Einstufung:  " + einstufung + " = " +
                           EINSTUFUNGEN.get(einstufung));
    }
}
