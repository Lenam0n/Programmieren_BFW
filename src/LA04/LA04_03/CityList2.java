package LA04.LA04_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import utils.ArrayUtils;

import java.util.Scanner;

public class CityList2 {
    private String[] cityList;

    public CityList2() { this.cityList = new String[0]; }

    private boolean find(String c) { return Arrays.asList(this.cityList).contains(c); }
    
    private String[] reverse() {
       return Arrays.asList(this.cityList)
    		 		.stream()
    				.sorted( Collections.reverseOrder() )
    				.toArray(String[]::new);
    }
    
    public void add(String c) {
        if (!this.find(c)) {
            this.cityList = Arrays.copyOf(this.cityList, this.cityList.length + 1);
            this.cityList[this.cityList.length - 1] = c;
        }
    }
    
    public void addAll(String... c) {
    	// String[] extended = ArrayUtils.createArray(String[]::new, this.cityList.length + c.length);
    	// System.arraycopy(this.cityList, 0, extended, 0, this.cityList.length);
    	// System.arraycopy(c, 0, extended, this.cityList.length, c.length);
    	// this.cityList = extended;
    	
    	// ---------------------------------------------------------------
    	// this.cityList = ArrayUtils.createArray(String[]::new, this.cityList.length + c.length);
        // for (int i = this.cityList.length; i < (c.length + this.cityList.length; i++) { this.cityList[i] = c[i]; }
    	// ---------------------------------------------------------------
    	
    	
    	this.cityList = Stream.concat(
    								Arrays.stream(this.cityList), 
    								Arrays.stream(c)
    								)
                			  .toArray(String[]::new);


    }
    
    public boolean findCity() { 
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Gebe eine Stadt ein nach der Gesucht werden soll: ");
    	String c = sc.next();  
    	sc.close();
    	return find(c); 
    	}
    
    public void print(boolean asc) {
    	if(this.cityList.length == 0) { System.out.println("Du hast keine Städte bisher hinzugefügt!"); }
    	else { System.out.println("Die Städteliste wird in " 
		    					+ (asc ? "alphabetischer" : "umgekehrter alphabetischer")
		    					+ " Reihenfolge ausgegeben");
	    	if(asc){ Arrays.stream(this.cityList).forEach(System.out::println);}
	    	else{ Arrays.stream(this.reverse()).forEach(System.out::println);}
    	}
    }
}
