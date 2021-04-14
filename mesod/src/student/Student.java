package student;

public class Student {

	public String name;
	public int stuNum;
	
	Student(){
		System.out.println("학생");
	}
	
	Student(String name, int stuNum) {
		this.name = name;
		this.stuNum =stuNum;
	}
	void fieldPrint() {
		System.out.println(this.name);
		System.out.println(this.stuNum);
	}	
	
	int numberMethod() {
		int num= 10;
		return num;
		
	}
	
	String stringMethod() {
		String val = "응";
		return val;
		}
	int stringMethod2(int num1) {
		int num2 = 10;
		int sum = num1 + num2;
		return sum;
	
	
	}
	
}