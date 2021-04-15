package cal;

public class CalMain {

	public static void main(String[] args) {
		/*
		 * CalMain 클래스에서 Cal 클래스 객체를 만들어서 sum1, sum2 메소드를
		 * 각각 호출하여 10 +20의 결과를 출력
		 * 매소드 호출시 매개값을 넘겨주라는 의미
		 * */
		//Cal 클래스 객체 선언
		Cal cal1 = new Cal();
		// 리턴이 없는 메소드 호출
		cal1.sum1(10, 20);
		// 리턴이 있는 메소드 호출
		int sum = cal1.sum2(10, 20);
		System.out.println(sum);
	
		
	}

}
