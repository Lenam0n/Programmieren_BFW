package Übungsaufgaben.A5;


public abstract class Verkehrsmittel implements IBuchbar {
    protected final String bezeichnung;
    protected int kapazitaet;
    protected final double preisProSitz;

    protected Verkehrsmittel(String bezeichnung, int kapazitaet, double preisProSitz) {
        this.bezeichnung  = bezeichnung;
        this.kapazitaet   = kapazitaet;
        this.preisProSitz = preisProSitz;
    }

    @Override
    public boolean bucheSitze(int anzahl) throws BuchungsException {
        if (anzahl <= 0) {  throw new BuchungsException("Ungültige Anzahl Sitze: " + anzahl);  }
        if (kapazitaet < anzahl) {
            throw new BuchungsException("Zu wenig Sitzplätze bei " + bezeichnung 
                                        + " (verfügbar: " + kapazitaet + ", angefragt: " + anzahl + ")");
        }
        kapazitaet -= anzahl;
        System.out.println("Gebucht " + anzahl 
                            + " Sitz(e) bei " + bezeichnung 
                            + ". Verbleibend: " + kapazitaet);
        return true;
    }

    public double calcGesamtPreis() {
        return kapazitaet * preisProSitz;
    }

    public void printInfo() {
        System.out.println("Bezeichnung: " + bezeichnung);
        System.out.println("Kapazität: " + kapazitaet);
        System.out.println("Preis pro Sitz: " + preisProSitz);
    }
}
