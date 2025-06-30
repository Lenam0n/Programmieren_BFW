package Übungsaufgaben.A5;

public abstract class Verkehrsmittel {
    protected String bezeichnung;
    protected int kapazitaet;
    protected double preisProSitz;

    public Verkehrsmittel(String b, int k,double p){
        this.bezeichnung = b;
        this.kapazitaet = k;
        this.preisProSitz = p;
    }

    public double calcGesamtPreis(){ return (this.kapazitaet * this.preisProSitz); }

    public void printInfo(){
        System.out.println("Bezeichnung: " + this.bezeichnung);
        System.out.println("Kapazität im Fahrzeug: " + this.kapazitaet);
        System.out.println("Preis pro Sitz: " + this.preisProSitz);
    }
    public void buchPlatz(){
        this.kapazitaet -= 1;
        System.out.println("Neue Verfügbarkeit: " + this.kapazitaet);
    }
}
