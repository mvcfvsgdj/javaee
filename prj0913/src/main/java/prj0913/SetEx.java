package prj0913;

import java.util.HashSet;

public class SetEx {
	public static void main(String[] args) {
		
		//순서없음
		//중복을 허용하지 않음
		HashSet<String> test = new HashSet<>();
		
		test.add("테스트1");
		test.add("테스트1");
		test.add("테스트3");
		test.add("테스트2");
		
		for(String t : test) {
			System.out.println(t);
		}
		
		
	}
}
