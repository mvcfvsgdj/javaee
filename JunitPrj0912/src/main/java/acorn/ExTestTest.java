package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExTestTest {

	ExTest t =new ExTest();
	
	@Test
	void test() {
		
		assertEquals(5, t.add(3, 5));
		//fail("Not yet implemented");
	}

}
