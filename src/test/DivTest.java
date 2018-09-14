package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funkcjaKwadratowa.FunKw;

class DivTest {

	@Test
	public void multiplicationTest() {
	
		 int result = FunKw.division(4,2);
	        int expectedResult = 3;
	        assertEquals(result, expectedResult);
	        
	}

}
