package LA05;

import java.util.Map;

public class Kunde {

	private String name;
	private Buch[] orders;
	public Kunde(String n) { 
		this.name = n;
		this.orders = new Buch[0];
		}
	public int ordersCount() { return this.orders.length; }
	public double bookCosts() {
		double cost = 0;
		for(Buch e : orders) cost += e.getCost();
		return cost;
	}
	public String getName() { return this.name; }
	public void setName(String n) { this.name = n; }
	public void addBook(String bookName, double bookCost) {
		Buch[] arr = new Buch[this.orders.length +1];
		if(this.orders.length > 0) for(int i = 0; i <= this.orders.length; i++) arr[i] = this.orders[i];
		arr[this.orders.length > 0 ? this.orders.length +1 : 0] = new Buch(bookName,bookCost);
		this.orders = arr;
	}
	
	public void addBook(Buch... newBooks) {
	    // Neues Array erstellen, das die alten und die neuen Bücher enthält
	    Buch[] combined = new Buch[this.orders.length + newBooks.length];
	    
	    // Bestehende Bücher kopieren
	    for (int i = 0; i < this.orders.length; i++) combined[i] = this.orders[i];
	    
	    // Neue Bücher anfügen
	    for (int i = 0; i < newBooks.length; i++) combined[this.orders.length + i] = newBooks[i];
	    
	    this.orders = combined;
	}
	
	public void addBook(BookData bookData) {
	    Map<String, Double> data = bookData.getBookData();
	    // Neues Array, das die alten und die neuen Bücher enthält
	    Buch[] combined = new Buch[this.orders.length + data.size()];
	    
	    // Bestehende Bücher kopieren
	    for (int i = 0; i < this.orders.length; i++) combined[i] = this.orders[i];
	    
	    // Neue Bücher hinzufügen
	    int index = this.orders.length;
	    for (Map.Entry<String, Double> entry : data.entrySet()) {
	        combined[index] = new Buch(entry.getKey(), entry.getValue());
	        index++;
	    }
	    
	    this.orders = combined;
	}
	 
	public void print() {
		System.out.println("Kunde: " + this.name);
		System.out.println("Kosten der bestellten Bücher: " + this.bookCosts() + "€");
		System.out.println("Anzahl der Bücher: " + this.ordersCount());
		System.out.println("~".repeat(10));
		System.out.println("Bestellte Bücher: ");
		System.out.println("-".repeat(10));
		for(Buch b : this.orders) System.out.println(b.print());

	}

}
