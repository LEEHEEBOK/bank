package cal;

public class Cal {
	/*
	 * num1과 num2 필드를 가지고 있음.
	 * sum1 매소드
	 * 정수형 매개변수를 2개 가지고 있음
	 * 리턴은 없으며, 실행내용은 2개 매개변수의 합을 출력.
	 * sum2 매소드
	 * 정수형 매개변수를 2개 가지고 있음.
	 * 정수 값(매개변수 2개의 합)을 리턴.
	 * 
	 * CalMain 클래스에서 Cal 클래스 객체를 만들어서 sum1, sum2 메소드를
	 * 각각 호출하여 10 +20의 결과를 출력
	 * 매소드 호출시 매개값을 넘겨주라는 의미
	 * */
	int num1;
	int num2;
	
	//접근자, 반환형, 메소드이름, 매개변수 순으로..
	//sum 메소드 void=return 파일이나 다름없음
	void sum1(int num1, int num2) {
		System.out.println(num1 +num2);
	}

	//sum2 메소드 return문이 없어서 빨간줄 생긴것입니다.
	int sum2(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}
