package LA06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LA06_02 {
	private List<String> Termine;
	private HashSet<String> Ereignisse;
	private HashMap<String,String> TandD;
	private Scanner sc;
	
	public LA06_02() {
		this.sc = new Scanner(System.in);
		this.Termine = new ArrayList<>();
		this.Ereignisse = new HashSet<>();
		this.TandD = new HashMap<>();
	}
    private void ausgabeCollection(Collection<String> collection, String leerMessage) {
        if (collection != null && !collection.isEmpty()) collection.forEach(System.out::println);
        else System.out.println(leerMessage);
    }
    private LA06_02 addToCollection(Collection<String> collection, String Message) {
    	System.out.print(Message);
        collection.add(sc.nextLine());
        return this;
    }
    //--------------------------------------------------------------------------------------------
    // Termine
    public LA06_02 addTermine() { 
    	return addToCollection(this.Termine, "Füge einen Termin hinzu: "); 
    	}
    
    public void ausgabeTermine() {
        ausgabeCollection(this.Termine, "Du hast keine Termine gesetzt!");
    }
    
    //--------------------------------------------------------------------------------------------
    // Ereignisse
    
    public LA06_02 addEreignisse() { 
    	return addToCollection(this.Ereignisse, "Füge ein Ereigniss hinzu: "); 
    	}
    
    public void ausgabeEreignisse() {
        ausgabeCollection(this.Ereignisse, "Du hast keine Ereignisse gesetzt!");
    }
    
    //--------------------------------------------------------------------------------------------
    // Termine und Datum
    
	public void ausgabeTermineUndDatum() {
	    if (this.TandD != null) this.TandD.forEach((k, v) -> System.out.println(k + ": " + v));
	    else System.out.println("Du hast keine Termine mit Datum gesetzt!");
	}
	public LA06_02 addTermineUndDatum() {
		System.out.print("Gebe das Datum deines Termins ein: ");
		String key = sc.nextLine();
		System.out.print("Gebe deinen Termin ein: ");
		String value = sc.nextLine();
		this.TandD.put(key, value);
		return this;
	}
		

}
