package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test 
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testOneNumber(){
		int number = 1;
		assertEquals(number, Calculator.add("1"));
		number = 2;
		assertEquals(number, Calculator.add("2"));
		
	}
	
	@Test
	public void testTwoNumber(){
		int sum = 3;
		assertEquals(sum, Calculator.add("1,2"));
		sum = 4;
		assertEquals(sum, Calculator.add("2,2"));
	}
}