package LA_.Umrechner;

public class Umrechner {
	private static final double usd_eur_kurs = 1.1248593925759828;
	
	public static double usd_to_eur(double v) {
		return (double) (Math.round((v/usd_eur_kurs)*100))/100;
		}
}
