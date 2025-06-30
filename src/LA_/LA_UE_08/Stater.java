package LA_.LA_UE_08;

public class Stater {

	public static void main(String[] args) {
		Student s = new Student();
		s.addGrade(1,2,3,4,7);
		System.out.println("Noten Durchschnitt:" + " " + s.notenDurchschnitt());
		System.out.println("---------------");
		System.out.println("Beste Note:" + " " + s.getBestGrade());
		System.out.println("Schlechteste Note:" + " " + s.getWorsedGrade());
	}

}


/*
 * 
 * Scanner scanner = new Scanner(System.in);
 * for (int i = O; i < noten.length; i++) {
 * System.out.print("Note für Schüler" + (i +1) + "eingeben")
 *  noten[i] = scanner.nextlnt();
 *  }
 * scanner. close() 
 * 
 * */