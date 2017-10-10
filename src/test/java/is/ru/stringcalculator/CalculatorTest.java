package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
	public void testTwoNumbers(){
		int sum = 3;
		assertEquals(sum, Calculator.add("1,2"));
		sum = 4;
		assertEquals(sum, Calculator.add("2,2"));
	}
	
	@Test
	public void testThreeNumbers(){
		int sum = 3;
		assertEquals(sum, Calculator.add("1,1,1"));
		sum = 4;
		assertEquals(sum, Calculator.add("1,1,2"));
	}
	
	@Test
	public void testTwoNumbersWithNewline(){
		int sum = 2;
		assertEquals(sum, Calculator.add("1\n1"));
		sum = 4;
		assertEquals(sum, Calculator.add("2\n2"));
	}
	
	@Test
	public void testThreeNumbersWithNewline(){
		int sum = 3;
		assertEquals(sum, Calculator.add("1\n1,1"));
		sum = 4;
		assertEquals(sum, Calculator.add("1\n1,2"));
	}
	
	@Test
	public void testThrowExceptionForOneNegativeNumber(){
		try{
			Calculator.add("-1,2");
		} catch(RuntimeException e) {
			assertEquals("Negatives not allowed: [-1]", e.getMessage());
		}
	}
	
	@Test
	public void testThrowExceptionForTwoNegativeNumbers(){
		try{
			Calculator.add("1\n-1,-2");
		} catch(RuntimeException e) {
			assertEquals("Negatives not allowed: [-1, -2]", e.getMessage());
		}
	}
}