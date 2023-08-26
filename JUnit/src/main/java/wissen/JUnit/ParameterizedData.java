package wissen.JUnit;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

class addClass{
	public int addNum(int a, int b) {
		return a+b;
	}
}

@RunWith(Parameterized.class)
public class ParameterizedData {
	
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private addClass addClassObj;
	
	public ParameterizedData(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
		this.expectedResult=expectedResult;
	}
	
	@Before
	public void initialize() {
		addClassObj= new addClass();
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{111,222,333}});
	}
	
	@Test
	public void addNumberTest() {
		int result=addClassObj.addNum(firstNumber, secondNumber);
		System.out.println(firstNumber +" + "+secondNumber +" = "+result);
		
		assertEquals(expectedResult,result);
	}
}
