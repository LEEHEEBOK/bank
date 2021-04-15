package arraylist;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_ArrayList {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고
		 * 입력받은 단어를 모두 출력하고 
		 * 마지막에는 가장 긴 단어를 출력하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String word = "";
		
		
		for(int i=0; i<5; i++) {
			System.out.print("단어를 입력하세요 : ");
			word =sc.nextLine();
			list.add(word);
		}
		for(int i=0; i<5; i++) {
			System.out.println(list.get(i));
			if(list.length(i)<list.lenght(i++)) {
				
			}
		}
	}

}
