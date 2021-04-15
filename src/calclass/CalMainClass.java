package calclass;

import java.util.Scanner;

public class CalMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalClass Cal = new CalClass();
		int num1 = 0, num2 = 0;
		int select;

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			select = sc.nextInt();
			System.out.println("1번값과 2번값을 대입하세요.");

			switch (select) {

			case 1:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				Cal.addtion(num1, num2);
				break;
			case 2:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				Cal.subtraction(num1, num2);
				break;
			case 3:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				int sum = Cal.division(num1, num2);
				System.out.println("곱한 값 : " + sum);
				break;
			case 4:
				int main = Cal.multiplication();
				System.out.println("나눈 값 : " + main);
				break;
			case 5:
				run = false;
				break;

			}
		}
		System.out.println("종료하겠습니다.");
		sc.close();

	}

}
