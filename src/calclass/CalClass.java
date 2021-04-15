package calclass;

import java.util.Scanner;

public class CalClass {
	Scanner sc = new Scanner(System.in);
	int num1 = 0;
	int num2 = 0;

//	CalClass(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}

	void addtion(int num1, int num2) {
		System.out.println("더한값 : " + (num1 + num2));
	}

	void subtraction(int num1, int num2) {
		System.out.println("뺄쌤한 값 : " + (num1 - num2));
	}

	int division(int num1, int num2) {
		int sum = num1 * num2;
		return sum;

	}

	int multiplication() {
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int main = (num1 / num2);
		return main;
	}
}
