package book;

public class Thirdclass {

	public static void main(String[] args) {
		
		Book mybook = new Book("blue", "hard", 5000);
		mybook.run();
		mybook.info();
		mybook.stop();
		
		mybook.color = "red";
		mybook.paper = "smooth";
		mybook.price = 10000;
		mybook.run();
		mybook.info();
		mybook.stop();
		
	}
}
