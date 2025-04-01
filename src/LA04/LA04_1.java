package LA04;
import java.util.Scanner;

public class LA04_1 {
	private String vorname;
	private String nachname;
	private Scanner sc = new Scanner(System.in);;
	
	private LA04_1(String vor, String nach) {
		this.vorname = vor;
		this.nachname = nach;
	}
	private String input(String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
	public LA04_1 einlesen() {
		String vor = input("Gebe deinen Vornamen ein: ") ; 
		String nach = input("Gebe deinen Nachnamen ein: ") ; 
		return new LA04_1(vor,nach);
	}
	public String getNameFormated() { return (this.vorname + " " + this.nachname); }
	public int[] getNameCount() { return new int[]{ this.vorname.length(), this.nachname.length() }; }
	public String getFirstPartOfName(int count) { return this.nachname.substring(count); }

}
