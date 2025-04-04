package LA05;

public class Buch {
	private String name;
	private double cost;
	public Buch(String n, double c) {
		this.name = n;
		this.cost = c;
	}
	public Buch(String n) {
		this.name = n;
		this.cost = 12.50;
	}
	public String getName() {
		return this.name;
	}

	public double getCost() { 
		return this.cost;
	}
	public String print() {
		return "Name: " + this.name + "\n"
			 + "Preis: " + this.cost + "€"
			 + "\n" + "-".repeat(10);
	}
}
