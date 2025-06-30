package Übungsaufgaben.A2;

public class Rechteck {
    private double breite;
    private double höhe;

    public Rechteck(double b, double h){
        this.breite = b;
        this.höhe = h;
    }
    public double getBreite(){
        return this.breite;
    }
    public double geHöhet(){
        return this.höhe;
    }
    public double calcUmfang(){
        return 2 * (this.höhe + this.breite);
    }
    public double calcFläche(){
        return this.höhe * this.breite;
    }
}
