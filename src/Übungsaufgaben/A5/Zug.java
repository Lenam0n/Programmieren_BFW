package Übungsaufgaben.A5;

public class Zug extends Verkehrsmittel {

    public Zug(String b, int k,double p){
        super(b, k, p);
    }

    @Override
    public boolean bucheSitze(int anzahl) throws BuchungsException {
        boolean ok = super.bucheSitze(anzahl);
        if (ok && anzahl >= 10) {
            System.out.println("Gruppenrabatt angewendet! (-10%)");
        }
        return ok;
    }
}
