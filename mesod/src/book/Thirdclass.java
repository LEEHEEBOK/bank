package book;

public class Thirdclass {

	public static void main(String[] args) {
		
		Book mybook = new Book("하울의 움직이는 성", "blue", "hard", 5000);
		mybook.run();
		mybook.info();
		mybook.stop();
		
		Book mybook2 = new Book("미치겠다", "red", "hard", 10000);
		mybook2.run();
		mybook2.info();
		mybook2.stop();
		
	}
}
