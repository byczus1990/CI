package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import funkcjaKwadratowa.FunKw;

class FunKwTest {

	@Test
	public void multiplicationTest() {
	
		 int result = FunKw.multiple(2,4);
	        int expectedResult = 8;
	        assertEquals(result, expectedResult);
		
		
	}

}
