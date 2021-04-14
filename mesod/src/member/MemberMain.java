package member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m1 = new Member("red", "good", "hi", 254); 
		m1.info();
		
		m1.update("안녕", "반가워", "귀차니즘", 100);
		
		System.out.println(m1.myname());
		
		
	
	
	}

}
