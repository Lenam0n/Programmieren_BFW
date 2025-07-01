package Übungsaufgaben.A5;

public class Flugzeug extends Verkehrsmittel{

    public Flugzeug(String b, int k,double p){
        super(b, k, p);
    }

    @Override
    public boolean bucheSitze(int anzahl) throws BuchungsException {
        if (anzahl > 5)  System.out.println("Hinweis: Bitte Kundenservice bei Buchung ab 6 Sitzen kontaktieren.");
        
        boolean ok = super.bucheSitze(anzahl);
        double gesamtPreis = anzahl * preisProSitz;
        System.out.printf("Gesamtpreis: %.2f €%n", gesamtPreis);
        return ok;
    }
}
