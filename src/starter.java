import java.util.HashMap;
import java.util.Map;

import LA03.LA03_02;
import LA04.LA04_02;
import LA04.LA04_02_2;
import LA04.LA04_03.CityList2;
import LA04.LA04_03.CityList2_2;
import LA05.Buch;
import LA05.Kunde;
import utils.hilfe.*;

public class starter {
	
    public static void main(String[] args) {
    	
    	Adrian_LA04_03 a = Adrian_LA04_03.bier();
    	a.Beep_Boop();
    	a.Esel();
    	//LA03_02.create();
    	//LA03_02.withRange(29);
    	//LA03_02.withRange(10,20)
    			//.guessNum();
    	
        
        //LA04_02 test = new LA04_02(1, 2, 3, 4);
        //test.print(true);
    	
    	//CityList2 cl = new CityList2();
    	//cl.addAll("Köln","Dortmund","Essen");
    	//cl.print(false);
        
    	//LA04_02_2 arr = new LA04_02_2(1,2,3,4);
    	//System.out.print(arr.average());
    	
    	//CityList2_2 cl = new CityList2_2();
    	//cl.add("Dortmund");
    	//cl.addAll("Dortmund","Köln","Essen");
    	//System.out.print(cl.findCity());
    	
    	/*
    	
    	Kunde k1 = new Kunde("Sarah");
    	k1.addBook("hallo", 1.50);
    	k1.print();
    	
    	Kunde kunde = new Kunde("Max Mustermann");
    	kunde.addBook(() -> {
    	    Map<String, Double> books = new HashMap<>();
    	    books.put("Java Grundlagen", 29.99);
    	    books.put("Effektives Programmieren", 39.95);
    	    books.put("Design Patterns", 45.50);
    	    return books;
    	});
    	
    	Kunde kunde3 = new Kunde("Maxime Mustermann");
    	kunde3.addBook(
    	    new Buch("Java Grundlagen", 29.99),
    	    new Buch("Effektives Programmieren", 39.95),
    	    new Buch("Design Patterns", 45.50)
    	);
    	
    	Kunde[] KundenListe = new Kunde[] {new Kunde("Sarah"), new Kunde("Max Mustermann"), new Kunde("Maxime")};
    	
    	KundenListe[0].addBook("hallo", 1.50);
    	KundenListe[1].addBook(() -> {
    	    Map<String, Double> books = new HashMap<>();
    	    books.put("Java Grundlagen", 29.99);
    	    books.put("Effektives Programmieren", 39.95);
    	    books.put("Design Patterns", 45.50);
    	    return books;
    	});
    	KundenListe[2].addBook(
    	    new Buch("Java Grundlagen", 29.99),
    	    new Buch("Effektives Programmieren", 39.95),
    	    new Buch("Design Patterns", 45.50)
    	    );
    	for(Kunde k : KundenListe) k.print();*/
    	
    	

    }
}