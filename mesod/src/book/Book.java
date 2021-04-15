package book;

public class Book {

	public String name;
	public String color;
	public String paper;
	public int price;

	public Book(String n, String c,String m, int p) { 
		System.out.println("Book contructor");
		name =n;
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
		System.out.println("name : " + name);
		System.out.println("color : " + color);
		System.out.println("paper : " + paper);
		System.out.println("price : " + price);
	}
}
