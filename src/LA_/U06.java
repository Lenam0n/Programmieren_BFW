package LA_;

public class U06 {

	public U06() {
		// TODO Auto-generated constructor stub
	}
	
	public static String rueckwerts(String wort) {
		String s = "";
		for(int i = wort.length()-1; i >= 0; i--) s += wort.charAt(i);
		return s;
	}
	public static boolean isPalendrome(String wort) {
		return wort.equals(rueckwerts(wort)) ;
	}
	
	public static boolean isPalendrome2(String wort) {
		String s = rueckwerts(wort);
		for(int i =0; i < wort.length();i++)
			if(wort.charAt(i) != s.charAt(i)) return false;
		return true;
	}

	public static int[] verdoppleWerte(int[] zahlen) {
		int[] arr = new int[zahlen.length];
		for(int i = 0; i < zahlen.length;i++) 
			arr[i] = (zahlen[i]*2);
		return arr;
	}
}
