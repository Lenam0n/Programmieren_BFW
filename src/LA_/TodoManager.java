package LA_;

public class TodoManager {
	static String[] aufgaben = {"Java lernen","Projekt planen","Dokumentation schreiben","Unit-Tests durchführen"};
	public static void main(String[] args) {
		begruessung();
		aufgabenHinzufuegen(aufgaben);
		int anzahl = anzahlAufgaben();
		System.out.println("Insgesamt " + anzahl + " Aufgaben vorhanden.");
		boolean vorhanden = enthaeltSuchwort(aufgaben, "Test");
		if (vorhanden) System.out.println("Eine Aufgabe enthält das Wort 'Test'.");
		else System.out.println("Keine Aufgabe enthält das Wort 'Test'.");
	}
		
	// TODO: Methode begruessung() → keine Übergabe, kein Rückgabewert
	private static void begruessung() {System.out.println("Hallo :)");}
	
	// TODO: Methode aufgabenHinzufuegen(String[] liste) → Übergabe, kein Rückgabewert
	private static void aufgabenHinzufuegen(String[] a ) {
		/*Scanner sc = new Scanner(System.in);
		String[] arr = new String[a.length + 1];
		for(int i = 0; i < a.length; i++) arr[i] = a[i];
		for(int i = a.length; i < arr.length; i++) arr[i] = ;*/
		
		for(int i = 0 ; i< a.length;i++) System.out.println("Aufgabe " + i + ": " + a[i]);
	}
	// TODO: Methode anzahlAufgaben() → kein Übergabeparameter, Rückgabewert
	private static int anzahlAufgaben() {return aufgaben.length;}
	
	// TODO: Methode enthaeltSuchwort(String[] liste, String suchwort) → Übergabe & Rückgabe
	private static boolean enthaeltSuchwort(String[] arr , String a ) {
		if(arr.length > 0) for(String e : arr) if(e.equals(a)) return true ;
		return false;
	}
	
}
