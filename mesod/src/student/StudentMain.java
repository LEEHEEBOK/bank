package student;

public class StudentMain {

	public static void main(String[] args) {

		Student s = new Student();
		s.name = "학생1";
		s.stuNum = 12345;
		System.out.println(s.name);
		System.out.println(s.stuNum);

		Student stu2 = new Student("학생2", 11111);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);

		s.fieldPrint();

		s.numberMethod();

		System.out.println("String 메소드 호출");
		System.out.println(s.stringMethod());

		String bb = s.stringMethod();
		System.out.println(bb);

		Student s1 = new Student();
		int cc = s1.stringMethod2(10);
		System.out.println(cc);
	}

}
