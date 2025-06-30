package Übungsaufgaben;

import Übungsaufgaben.A2.Rechteck;
import Übungsaufgaben.A3.Hund;
import Übungsaufgaben.A3.Katze;
import Übungsaufgaben.A3.Tier;
import Übungsaufgaben.A5.Bus;
import Übungsaufgaben.A5.Verkehrsmittel;
import Übungsaufgaben.A5.Verwaltung;
import Übungsaufgaben.A5.Zug;

public class UA_Starter {
    private static final int aufgabe = 1;
    public static void main(String[] args){
        switch (aufgabe) {
            case 1: break;
            case 2:
                Rechteck r = new Rechteck(1.1, 5.1);
                System.out.println("Umfang: " + r.calcUmfang());
                System.out.println("Fläche: " + r.calcFläche());
                
                break;
            case 3:
                Tier[] tiere = { new Katze(), new Hund() };
                for (Tier t : tiere) t.gibLaut();
                break;
            case 4:
                break;
            case 5:
                Verkehrsmittel v1 = new Bus("Bus E19", 30 , 2.9);
                Verkehrsmittel v2 = new Zug("Zug S8", 130 , 7.9);

                Verwaltung V = new Verwaltung();
                V.addVerkehrsmittel(v1,v2);
                V.buchen(v2);

                
                break;

            default:
                break;
        }
    }
}
