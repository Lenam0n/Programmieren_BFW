package Übungsaufgaben.A5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Verwaltung {
    private List<Verkehrsmittel> v;

    public Verwaltung(){ this.v = new ArrayList<>(); }
    private void setVerkehrsmittel(Verkehrsmittel... v){
        this.v = List.copyOf(Arrays.asList(v));
    }

    public void addVerkehrsmittel(Verkehrsmittel... neue){
        List<Verkehrsmittel> neueListe = new ArrayList<>(this.v);
        neueListe.addAll(Arrays.asList(neue));
        setVerkehrsmittel(neueListe.toArray(new Verkehrsmittel[0])); 
        // Das neue Array, ohne länge, ist nur als Dummy Array für den Type und sonst nichts
    }

    public boolean buchen(Verkehrsmittel o){
        try{ 
            if(v.contains(o)){
                Verkehrsmittel vm = v.get(v.indexOf(o));
                if (vm.kapazitaet > 0) { vm.buchPlatz(); }
                else{ throw new Exception("nicht genug Plätze verfügbar!"); }
            }
            else{ throw new Exception("Verkehrsmittel gibt es nicht!"); }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
