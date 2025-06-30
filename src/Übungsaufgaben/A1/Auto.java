package Übungsaufgaben.A1;

public class Auto {
    private String marke;
    private int baujahr;
    private double kmStand;
    public Auto(String m,int b,double s){
        this.marke = m;
        this.baujahr = b;
        this.kmStand = s;  
    }
    public void fahre(double km){
        setKmStand(km);
    }
    private void setKmStand(double kmS){
        this.kmStand += kmS;
    }
    public String getMarke(){
        return this.marke;
    }
    public int getBaujahr(){
        return this.baujahr;
    }
    public double getKmStand(){
        return this.kmStand;
    }
    public void druckeInfo(){
        System.out.println("Marke: " + this.marke);
        System.out.println("Baujahr: " + this.baujahr);
        System.out.println("kmStand: " + this.kmStand);
    }
}
