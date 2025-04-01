package LA_;

import java.util.Scanner;
import java.util.function.Function;

public class EnergiesparRechner2 {
    private byte geraeteAnzahl;
    private short minutenProTag;
    private int wattProGeraet;
    private float kostenProKWh;
    private char effizienzklasse;
    private boolean austauschGeplant;
    private int gesamtVerbrauchTaeglichWh;
    private long jahresverbrauchWh;
    private double jahresverbrauchKWh;
    private double kostenProJahr;
    private Scanner scanner = new Scanner(System.in);

    public EnergiesparRechner2() {
        this.geraeteAnzahl = input("Wie viele Geräte möchten Sie erfassen? (byte) ", Byte::parseByte);
        this.minutenProTag = input("Wie viele Minuten pro Tag läuft ein Gerät durchschnittlich? (short) ", Short::parseShort);
        this.wattProGeraet = input("Wie hoch ist der Verbrauch pro Gerät in Watt? (int) ", Integer::parseInt);
        this.kostenProKWh = input("Wie viel kostet 1 kWh in Euro? (float) ", Float::parseFloat);
        this.effizienzklasse = input("Energieeffizienzklasse des Geräts (A-G)? (char) ", s -> s.charAt(0));
        this.austauschGeplant = input("Planen Sie den Austausch gegen ein effizienteres Gerät? (true/false) ", Boolean::parseBoolean);
        scanner.close();
        this.gesamtVerbrauchTaeglichWh = (wattProGeraet * minutenProTag) / 60;
        this.jahresverbrauchWh = (long) gesamtVerbrauchTaeglichWh * 365 * geraeteAnzahl;
        this.jahresverbrauchKWh = jahresverbrauchWh / 1000.0;
        this.kostenProJahr = jahresverbrauchKWh * kostenProKWh;
    }
    private <T> T input(String prompt, Function<String, T> converter) {
        System.out.print(prompt);
        String inputLine = scanner.nextLine();
        return converter.apply(inputLine);
    }
    public void printResults() {
        System.out.println("\n--- Energieverbrauchs-Auswertung ---");
        System.out.println("Anzahl der Geräte: " + geraeteAnzahl);
        System.out.println("Täglicher Verbrauch pro Gerät: " + gesamtVerbrauchTaeglichWh + " Wh");
        System.out.println("Gesamter Jahresverbrauch: " + jahresverbrauchKWh + " kWh");
        System.out.printf("Jährliche Energiekosten: %.2f Euro\n", kostenProJahr);
        System.out.println("Energieeffizienzklasse: " + effizienzklasse);
        System.out.println("Geplanter Austausch: " + (austauschGeplant ? "Ja" : "Nein"));
    }
    public static void main(String[] args) {
        EnergiesparRechner2 rechner = new EnergiesparRechner2();
        rechner.printResults();
    }
}
