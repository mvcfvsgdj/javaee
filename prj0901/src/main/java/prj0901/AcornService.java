package prj0901;

import java.util.ArrayList;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	public ArrayList<String> getMemberList(){
		
		ArrayList<String> list = new ArrayList<>();
	
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		return list ;
	}
	public ArrayList<String> getMemberRealList(){
		ArrayList<String>	list = dao.selectAll();
		return list;
	}
	public void registerMember(Customer c) {
		dao.insertMember3(c);
	}
	public Customer getMember(String id) {
		Customer c = dao.selectOne(id);
		return c;
	}
	public void deleteMember(String id) {
		dao.deleteOne(id);
	}
	public void modifyMember(Customer c) {
		dao.updateMember(c);
	}
}
