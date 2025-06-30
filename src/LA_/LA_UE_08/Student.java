package LA_.LA_UE_08;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private List<Integer> grades;
	
	public Student() { this.grades = new ArrayList<Integer>(); }
	
	public double notenDurchschnitt() {
		if(this.grades.size() == 0) return -0;
		int res = 0;
		for(int i = 0; i< this.grades.size(); i++) {
			res += this.grades.get(i);
		}
		return (double)res / this.grades.size();
	}
	
	public void addGrade(Integer... g) {
		for(int e : g) { 
			if (e >= 1 && e <= 6) this.grades.add(e);
			else System.out.println("***************\n" 
									+ "Eingabe" 
									+ " " + "{" + e + "}" + " " 
									+ "ist ungültig und wird übersprungen!" 
									+ "\n***************" );
		}
	}
	
	public int getWorsedGrade() {
		if(this.grades.size() == 0) return -0;
		int res = this.grades.get(0);
		for(int i = 1; i < this.grades.size(); i++) {
			if(this.grades.get(i) >= res) {
				res = this.grades.get(i);
			}
			if(res == 6) return res;
		}
		return res;
	}
	
	public int getBestGrade() {
		if(this.grades.size() == 0) return -0;
		int res = this.grades.get(0);
		for(int i = 1; i < this.grades.size(); i++) {
			if(this.grades.get(i) <= res) {
				res = this.grades.get(i);
			}
			if(res == 1) return res;
		}
		return res;
	}
}
