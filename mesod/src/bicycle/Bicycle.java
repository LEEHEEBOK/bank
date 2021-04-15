package bicycle;

public class Bicycle {
	
	public String color;
	public String handle;
	public int price;
	
	public Bicycle(String c,String h, int p) {
		System.out.println("Bicycle constructor");
	color =c;
	handle =h;
	price =p;
	}
		public void info() {
			System.out.println("--info()--");	
			System.out.println("color : " + color);
			System.out.println("handle : " + handle);
			System.out.println("price : " + price);
		}
}
