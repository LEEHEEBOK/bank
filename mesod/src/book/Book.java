package book;

public class Book {

	public String color;
	public String paper;
	public int price;

	public Book( String c,String m, int p) { 
		System.out.println("Book contructor");
		color =c;
		paper = m;
		price = p;
	}

	public void run() {
		System.out.println("------run------");
	}

	public void stop() {
		System.out.println("------stop------");
	}
	public void info() {
		System.out.println("------info------");
		System.out.println("color : " + color);
		System.out.println("paper : " + paper);
		System.out.println("price : " + price);
	}
}
