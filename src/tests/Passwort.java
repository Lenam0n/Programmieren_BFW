package tests;

public class Passwort{
	private String passwort;
	
	public Passwort (String p){ this.passwort = p; }
	public boolean includes(String criteria) {
        switch (criteria) {
            case "uppercase": return this.passwort.chars().anyMatch(ch -> Character.isUpperCase(ch));
            case "lowercase": return this.passwort.chars().anyMatch(ch -> Character.isLowerCase(ch));
            case "number": return this.passwort.chars().anyMatch(ch -> Character.isDigit(ch));
            case "special": return this.passwort.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch));
            default: return this.passwort.contains(criteria);
        }
    }
   public String getPasswort(){ return this.passwort; }
}