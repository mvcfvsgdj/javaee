package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {

	AcornDAO dao = new AcornDAO();

	@Test
	void testInsert2() {
		int result = dao.insert2(new Customer("zz", "1123", "test134"));
		assertEquals(1, result);
		// fail("Not yet implemented");
	}

}
