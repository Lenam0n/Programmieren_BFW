package Übungsaufgaben.A5;

public class Zug extends Verkehrsmittel {

    public Zug(String b, int k,double p){
        super(b, k, p);
    }

    @Override
    public boolean bucheSitze(int anzahl) {
        try{ 
            if(this.kapazitaet > 0){
                this.kapazitaet -= 1;
                System.out.println("Neue Verfügbarkeit: " + this.kapazitaet); 
                return true; }
            else{ throw new Exception("Zu wenig Sitzplätze!");} 
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
}
