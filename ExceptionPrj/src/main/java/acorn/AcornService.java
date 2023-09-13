package acorn;

import java.sql.SQLException;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	public void registerCustomer(Customer c) throws SQLException {
		dao.insert(c);
	}
}
