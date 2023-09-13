package prj0831;

import java.util.ArrayList;


public class ServiceMVC5 {

	
	public ArrayList<Member> getlist(){		
		ArrayList<Member> list = new ArrayList<>();		
		list.add(new Member("dy","4482","곽단야"));
		list.add(new Member("mg","1234","김민규"));
		list.add(new Member("mj","0242","김민지"));
		return list;
		
	}
	
	
	
	public static void main( String[] args) {
		ServiceMVC5  s = new ServiceMVC5();
		ArrayList<Member> list = s.getlist();
		
		
		System.out.println( list);
		
	}
	
}
