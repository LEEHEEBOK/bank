package bicycle;

public class Secondclass {

	public static void main(String[] args) {
		
		Bicycle myBicycle = new Bicycle( "red", "good", 300);
		myBicycle.info();
		
		myBicycle.color = "yellow";
		myBicycle.info();
		

	}

}
