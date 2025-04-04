package LA04.LA04_03;

import java.util.Scanner;

public class CityList2_2 {
    private String[] cityList;

    public CityList2_2() { this.cityList = new String[0]; }

    private boolean find(String c) {
    	for(String e : this.cityList) if(e == c) return true;
    	return false;
    }
    
    private String[] reverse() {
        String[] buffer = new String[this.cityList.length];
        int b = 0;
        for (int i = this.cityList.length - 1; i >= 0; i--) {
            buffer[b] = this.cityList[i];
            b++;
        }
        return buffer;
    }

    public void add(String c) {
        String[] arr = new String[this.cityList.length + 1];
        for (int i = 0; i < this.cityList.length; i++) arr[i] = this.cityList[i];
        arr[this.cityList.length] = c;
        
        this.cityList = arr;
    }

    
    public void addAll(String... c) {
        String[] arr = new String[this.cityList.length + c.length];
        for (int i = 0; i < this.cityList.length; i++) arr[i] = this.cityList[i];
        for (int i = this.cityList.length; i < (c.length + this.cityList.length); i++) arr[i] = c[i - this.cityList.length];
        
        this.cityList = arr;
    }
    
    public boolean findCity() { 
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Gebe eine Stadt ein nach der Gesucht werden soll: ");
    	String c = sc.next();  
    	sc.close();
    	return find(c); 
    	}
    
    public void print(boolean asc) {
    	if(this.cityList.length == 0) System.out.println("Du hast keine Städte bisher hinzugefügt!");
    	else { 	System.out.println("Die Städteliste wird in " 
		    					+ (asc ? "alphabetischer" : "umgekehrter alphabetischer")
		    					+ " Reihenfolge ausgegeben");
	    	
				String[] liste = (asc ? this.cityList : this.reverse());
				for(String e : liste) System.out.println(e);
    	}
    }
}
