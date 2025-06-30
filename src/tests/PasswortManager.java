package tests;

public class PasswortManager{
	private Passwort passwort;
	
	public PasswortManager(){ this.passwort = this.createPasswort(); }
	public PasswortManager(String pw){ this.passwort = this.createPasswort(pw); }
	public PasswortManager(Passwort pw){ this.passwort = pw; }
	
	public boolean methodeIstSicheresPasswort() {
	    if(
	       !(      
    		   this.passwort.getPasswort().length() > 8 
    		   || this.passwort.includes("uppercase") 
    		   || this.passwort.includes("lowercase") 
    		   || this.passwort.includes("number") 
    		   || this.passwort.includes("special")
	         )
	       ) { return false; }
	    
	    return true;
	}

	private Passwort createPasswort(){ return new Passwort("passwort");	}
	private Passwort createPasswort(String pw){ return new Passwort(pw);	}
}