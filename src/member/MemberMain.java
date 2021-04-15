package member;

public class MemberMain {

	public static void main(String[] args) {
		//Member 클래스 객체 선언
		// 기본생성자를 이용한 객체
		Member m1 = new Member(); 
		
		
		//매개변수가 있는 생성자를 이용한 객체
		Member m2 = new Member("안녕", "반가워", "귀차니즘", 100);
		m2.update("하이");
		
		System.out.println("----Member construtor----");
		System.out.println(m2.myname());
		
		
	
	
	}

}
