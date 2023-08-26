package wissen.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOrOdd {
	public String oddEven(int number) {
		if(number%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	
	
	
	@Test
	public void testOddEven() {
		System.out.println("executing oddEven test cases ");
		EvenOrOdd oddEvenObj=new EvenOrOdd();
		String result=oddEvenObj.oddEven(9);
		assertEquals("odd",result);
	}
}
