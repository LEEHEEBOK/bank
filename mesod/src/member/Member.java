package member;

public class Member {

	public String id;
	public String password;
	public String name;
	public int age;

	public Member(String i, String p, String n, int a) {
		this.id =i;
		this.password =p;
		this.name =n;
		this.age=a;
	}

	public void info() {
		System.out.println("아이디 : " + id );
		System.out.println("패스워드 : " + password );
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
	}

	public void update(String i, String p, String n, int a) {
		System.out.println("아이디 : " + id );
		System.out.println("패스워드 : " + password );
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
	}

	String myname() {
		String sum ="";
		System.out.println("아이디 : " + id );
		System.out.println("패스워드 : " + password );
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age );
		return sum;
	}





}
