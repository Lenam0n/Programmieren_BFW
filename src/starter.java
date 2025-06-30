import java.util.HashMap;
import java.util.Map;

import LA04.LA04_1;
import LA03.LA03_02;
import LA04.LA04_02;
import LA04.LA04_02_2;
import LA04.LA04_03.CityList2;
import LA04.LA04_03.CityList2_2;
import LA05.Buch;
import LA05.Kunde;
import LA06.LA06_02;
import LA_.U06;
//import utils.hilfe;
import utils.hilfe.Adrian_LA04_03;

public class starter {
	
    public static void main(String[] args) {
    	Uebungsaufgaben(1);

    }
    
    private static void Help() {
    	Adrian_LA04_03 a = Adrian_LA04_03.bier();
    	a.Beep_Boop();
    	a.Esel();
    }
    
    private static void Lernauftrag_1 (int a) {
    	/*switch(a) {
    	case 1:
    		break;
    	case 2:
    		break;
    	default:
    		break;*/
    	}
    	
    private static void Lernauftrag_2 (int a) {
    	/*switch(a) {
    	case 1:
    		break;
    	case 2:
    		break;
    		}*/
    	}
    
    private static void Lernauftrag_3 () {
		LA03_02.create();
    	LA03_02.withRange(29);
    	LA03_02.withRange(10,20)
    		   .guessNum();

    	}
    
    private static void Lernauftrag_4 (int a) {
    	switch(a) {
	    	case 1:
	    		LA04_1 name = LA04_1.einlesen();
	    		break;
	    	case 2:
	    		LA04_02_2 arr = new LA04_02_2(1,2,3,4);
	        	System.out.print(arr.average());
	        	LA04_02 test = new LA04_02(1, 2, 3, 4);
	            test.print(true);
	    		break;
	    	case 3:
	        	CityList2_2 cl = new CityList2_2();
	        	cl.add("Dortmund");
	        	cl.addAll("Dortmund","Köln","Essen");
	        	System.out.print(cl.findCity());
	    		break;
	    	case 4:
	        	CityList2 cl1 = new CityList2();
	        	cl1.addAll("Köln","Dortmund","Essen");
	        	cl1.print(false);
	    		break;
	    		}
    	}
    
    private static void Lernauftrag_5 () {
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
    	for(Kunde k : KundenListe) k.print();
    	}
    
    private static void Lernauftrag_6(char e, int a) {
        LA06_02 liste = new LA06_02();
        switch(e) {
            case 'a':
                if(a == 1) liste.ausgabeTermine();
                else liste.addTermine();
                break;
            case 'b':
                if(a == 1) liste.ausgabeEreignisse();
                else liste.addEreignisse();
                break;
            case 'c':
                if(a == 1) liste.ausgabeTermineUndDatum();
                else liste.addTermineUndDatum();
                break;
                
        }
    }

    
    private static void Uebungsaufgaben(int a) {
    	switch(a) {
    	case 1:
    		//System.out.println(U06.rueckwerts("hallo"));
    		//System.out.println(U06.isPalendrome("hallo"));
    		System.out.println(U06.isPalendrome2("Hallah"));
    		//int[] u = U06.verdoppleWerte(new int[] {1,2,3,4,5});
    		//for(int i = 0; i < u.length;i++) System.out.println(u[i]);
    		return;
    		//break;
    	}
    }
    }