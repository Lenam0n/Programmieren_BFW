package LA03;

import java.util.Random;
import java.util.Scanner;

public class LA03_02 {
	private int rdm;
	private int guess;
	private int max;
	private int min;
	private int atp;
	private Scanner sc = new Scanner(System.in);
	
    public static LA03_02 withRange(int min, int max) { return new LA03_02(min, max);}
    
    public static LA03_02 withRange(int max) { return new LA03_02(max); }
    
    public static LA03_02 create() { return new LA03_02(); }
	
    private LA03_02(int min, int max) {
    	this.max = max;
    	this.min = min;
    }

    private LA03_02(int max) {
    	this.max = max;
    	this.min = 1;
    }

    private LA03_02() {
    	this.max = 100;
    	this.min = 1;
    }
    
    private void printResult() { System.out.println("Du hast " + this.atp + 
    							" Versuche gebraucht um die Richtige Zahl zu erraten.");
    							System.out.println("Richtige Zahl war {" + this.rdm + "}"); }
    
    public void guessNum() {
    	this.rdm = new Random().nextInt(this.max - this.min) + this.min;
    	this.atp = 0;
    	
    	do {
    		if(this.atp > 0) System.out.println(
							    				this.guess > this.rdm ? 
							    						"Dein Tipp ist zu hoch!" : 
														"Dein Tipp ist zu niedrig!"); 
    	   	System.out.print("Gebe eine zahl zwischen " + this.min + " & " + this.max + " ein: ");
        	this.guess = sc.nextInt();
        	this.atp++;
    	}while(this.rdm != this.guess);
    	
    	this.printResult();
    }
    
    // public int getRdm() { return this.rdm; }
    
}
