package grandeur;

public class Mainclass {

	public static void main(String[] args) {
		
		
		Grandeur myCar1 = new Grandeur("red", "auto", 3000);
		myCar1.run();
		myCar1.info();
		myCar1.stop();
		Grandeur myCar2 = new Grandeur("blue", "manual", 500);
		myCar2.run();
		myCar2.info();
		myCar2.stop();
		Grandeur myCar3 = new Grandeur("yellow", "auto", 2000);
		myCar3.run();
		myCar3.info();
		myCar3.stop();
		Grandeur myCar4 = new Grandeur("purple", "auto", 350);
		myCar4.run();
		myCar4.info();
		myCar4.stop();
		
	}
}

