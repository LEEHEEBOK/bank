package member;

public class Member {

	String id;
	String password;
	String name;
	int age;

	//생성자 선언
	//기본생성자
	//생성자이름 : 클래스 이름과 동일함
	Member(){
		System.out.println("----Member construtor----");
	}
	
	//모든 필드를 매개변수로 하는 생성자
	Member(String i, String p, String n, int a) {
		//매개변수로 받은 값을 각각 필드에 저장
		System.out.println("----Member construtor----");
	this.id =i;
	this.password =p;
	this.name =n;
	this.age =a;
	}
	//메소드 선언
	// info 메소드 (리턴 없음. 매개변수 없음.)
	// 모든 필드값을 출력하는 내용을 가지고 있는 메소드
	void info() {
		System.out.println("아이디 : " + this.id );
		System.out.println("패스워드 : " + this.password );
		System.out.println("이름 : " + this.name );
		System.out.println("나이 : " + this.age );
	}
	//update 메소드 (리턴 없음, 매개변수 있음)
	//name 필드값을 수정하는 메소드
	void update(String n) {
		this.name = n;
	}
	//myName 메소드(리턴 있음. 매개변수 없음.)
	//name 필드값을 리턴해주는 메소드
	String myName() {
		return this.name;
	}





}
