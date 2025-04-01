package LA_;
import java.util.Scanner;

public class EnergiesparRechner {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Wie viele Geräte möchten Sie erfassen? (byte) ");
		byte geraeteAnzahl = scanner.nextByte();
		System.out.print ("Wie viele Minuten pro Tag läuft ein Gerät durchschnittlich? (short) ");
		short minutenProTag = scanner.nextShort();
		System.out.print("Wie hoch ist der Verbrauch pro Gerät in Watt? (int) ");
		int wattProGeraet = scanner.nextInt();
		System.out.print("Wie viel kostet 1 kWh in Euro? (float) ");
		float kostenProKWh = scanner.nextFloat();
		System.out.print ("Energieeffizienzklasse des Geräts (A-G)? (char) ");
		char effizienzklasse = scanner.next().charAt(0);
		System.out.print("Planen Sie den Austausch gegen ein effizienteres Gerät? (true/false) ");
		boolean austauschGeplant = scanner.nextBoolean();
		
		scanner.close();
		
		int gesamtVerbrauchTäglichWh = (wattProGeraet * minutenProTag) / 60;
		long jahresverbrauchwh = (long) gesamtVerbrauchTäglichWh * 365 * geraeteAnzahl;
		double jahresverbrauchkWh = jahresverbrauchwh / 1000.0;
		double kostenProJahr = jahresverbrauchkWh * kostenProKWh;
		
		
		System.out.println("\n--- Energieverbrauchs-Auswertung ---");
		System.out.println("Anzahl der Geräte: " + geraeteAnzahl);
		System.out.println("Täglicher Verbrauch pro Gerät: " + gesamtVerbrauchTäglichWh + " wh");
		System.out.println("Gesamter Jahresverbrauch: " + jahresverbrauchkWh + " wh");
		System.out.printf("Jährliche Energiekosten: %.2f Euro\n", kostenProJahr);
		System.out.println("Energieeffizienzklasse: " + effizienzklasse);
		System.out.println("Geplanter Austausch: " + (austauschGeplant ? "Ja" : "Nein"));
	}}