package grandeur;

public class Mainclass {

	public static void main(String[] args) {
		
	
		Grandeur myCar1 = new Grandeur("red", "auto", 3000);
		myCar1.info();
			
		Grandeur myCar2 = new Grandeur("blue", "manual", 500);
		myCar2.info();
		
		Grandeur mycar3 = new Grandeur("yellow", "auto", 2000);
		mycar3.info();

		Grandeur mycar4 = new Grandeur("purple", "auto", 350);
		mycar4.info();
	
		
	}
}

