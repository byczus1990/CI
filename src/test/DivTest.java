package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.java.FunKw;

class DivTest {

	@Test
	public void divisionTest() {
	
		 int result = FunKw.division(4,2);
	        int expectedResult = 2;
	        assertEquals(result, expectedResult);
	        
	}

}
