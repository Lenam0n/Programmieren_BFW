package Übungsaufgaben.A4;

import java.util.concurrent.Callable;

public class Konto{
    private final int kontonummer;
    private final String inhaber;
    private double kontostand;

    public Konto(int kn,String i, double ks){
        this.kontonummer = kn;
        this.inhaber = i;
        this.kontostand = ks;
    }
    public int getKontoNummer(){ return this.kontonummer; }
    public String getInhaber(){ return this.inhaber; }
    public double getKontoStand(){ return this.kontostand; }

    private void setKontostand(double money){ this.kontostand = money; }
    private double addKontostand(double money){ return (this.kontostand + money); }
    private double removeKontostand(double money){ return (this.kontostand - money); }

    private boolean exec(Callable<Double> action) {
        try {
            double newBalance = action.call();
            setKontostand(newBalance);
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean einzahlen(double money){
/*      try{ setKontostand(addKontostand(money)); }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true; */

        return exec(() -> addKontostand(money));
    }

    public boolean abheben(double money){
/*         try{ setKontostand(removeKontostand(money)); }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true; */
        return exec(() -> removeKontostand(money));
    }
    

    public boolean ausgeben(double money){
/*         try{  setKontostand(removeKontostand(money)); }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true; */

        return exec(() -> removeKontostand(money));
    }
}