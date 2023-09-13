package acorn;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c = new Calculator();
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(8, c.add(3, 5));
	}

	@Test
	void testSub() {
		//fail("Not yet implemented");
		assertEquals(-2, c.sub(3, 5));
	}

	@Test
	void testMul() {
		//fail("Not yet implemented");
		assertEquals(15, c.mul(3, 5));
	}

	@Test
	void testDiv() {
		//fail("Not yet implemented");
		assertEquals(5, c.div(15, 3));
	}
	@Test
	void testDivisor() {
	   
		   int[] result = c.divisor(6);
		   int[] result2 = {1,2,3,6,};
		   assertArrayEquals(result2,result);
		/*int[] test1 = {1, 2, 3, 6};
	    int[] test2 = c.divisor(6);
	    
	    // 각 값에 대해 별도의 assertEquals 호출
	    for (int i = 0; i < test1.length; i++) {
	        assertEquals(test1[i], test2[i]);*/
	    }
	}

