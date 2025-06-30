package LA04;
import java.util.Scanner;

public class LA04_1 {
	private String vorname;
	private String nachname;
	private static Scanner sc = new Scanner(System.in);
	
	private LA04_1(String vor, String nach) {
		this.vorname = vor;
		this.nachname = nach;
	}
	private static String input(String prompt) {
		
		System.out.print(prompt);
		String in = sc.nextLine();
		return in;
	}
	public static LA04_1 einlesen() {
		String vor = input("Gebe deinen Vornamen ein: ") ; 
		String nach = input("Gebe deinen Nachnamen ein: ") ; 
		return new LA04_1(vor,nach);
	}
	public String getNameFormated(boolean sm) { return (sm  
													  ?	(this.vorname.toLowerCase() + " " + this.nachname.toLowerCase()) 
													  : (this.vorname.toUpperCase() + " " + this.nachname.toUpperCase())
													  ); }
	public int[] getNameCount() { return new int[]{ this.vorname.length(), this.nachname.length() }; }
	public String getFirstPartOfLastname(int count) { return this.nachname.length() >= 3 ? this.nachname.substring(0,count) : this.nachname; }

}
