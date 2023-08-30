package prj.parctice;

import java.io.PrintWriter;
import java.util.ArrayList;

public class MyUtils {

	public String getDivisor(int num) {

		int num_h = num / 2;
		System.out.println(num);
		System.out.println(num_h);
		
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i=1 ; i<num_h; i++) {
			if(num %i ==0) {
				nums.add(i);
			}
		}
		
		nums.add(num);
		String divisors = nums.toString();
		return divisors;
		
	}
	
	
	public static void main(String[] args) {
		MyUtils a = new MyUtils();
		
		String b = a.getDivisor(20);
		System.out.println(b);
		
		
	}
	
		
}
