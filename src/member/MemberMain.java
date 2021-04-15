package member;

public class MemberMain {

	public static void main(String[] args) {
		// Member 클래스 객체 선언
		// 기본생성자를 이용한 객체
		Member m1 = new Member();
		m1.id = "아이디";
		m1.password = "비밀번호";
		m1.name = "이름";
		m1.age = 99;
		// 호출하는 메소드의 리턴이 있는지 없는지를 구분하여
		// 호출을 잘하자.
		m1.info();
		System.out.println("----Member construtor----");
		m1.update("변경이름");
		m1.info();
		System.out.println("----Member construtor----");
		m1.myName(); // 리턴이 있는 메소드는 호출할때
		// 호출만하고 끝내면 안됨.
		System.out.println(m1.myName());

		// 매개변수가 있는 생성자를 이용한 객체
		Member m2 = new Member("안녕", "반가워", "귀차니즘", 100);
		m2.info();

	}

}
