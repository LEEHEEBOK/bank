package boardclass;

public class BoardClass {
	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;

	BoardClass() {

	}

	void boardWrite(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber =bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}

	void boardview() {
		System.out.println("----Construtor----");
		System.out.println(bNumber);
		System.out.println(bTitle);
		System.out.println(bWriter);
		System.out.println(bContents);
	}

	void boardUpdate(String bTitle, String bContents) {
		this.bContents = bContents;
		this.bTitle = bTitle;
	}

}
