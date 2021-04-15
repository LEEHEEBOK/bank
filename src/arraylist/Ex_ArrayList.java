package arraylist;

import java.util.*;

public class Ex_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		/*
		 * Collection FrameWork : List, Set, Map
		 *
		 * ArrayList 선언(저장데이터 타입: String)
		 * <> 타입을 적는 칸
		 * */
		List<String> list = new ArrayList<String>();
		
		//list 에 데이터 저장 : add 메소드 호출
		
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add(1, "네번째");
		list.add(1, "다섯번째");
		// list에 담신 데이터 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//list 크기 확인
		
		System.out.println(list.size());
		
		//list 데이터 삭제
		list.remove(1);
		list.remove(1);
		System.out.println(list.size());
		//for 문은 이용하여 list에 담긴 모든 데이터 출력
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		// String은 클래스 타입
		// list에 정수를 저장할 때 <>  = generic, int = Integer
		// list에서는 int를 쓸수 없어서 Integer로 씀.
		List<Integer> list1 = new ArrayList<Integer>(); //Wrapper Class
		
		
		
		
		
		
		
		
		
		
	}

}
