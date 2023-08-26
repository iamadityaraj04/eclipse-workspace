package wissen.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

class InvalidVotingException extends Exception{
	InvalidVotingException(String str){
		super(str);
	}
}
public class JunitTesting {
	public String login(String UserId, String Password) {
		if(UserId.equals("aditya") && Password.equals("1234")) {
			return "Valid User";
		}
		else {
			return "Invalid User";
		}
	}
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	public String ageValidation(int age) throws InvalidVotingException{
		if(age>=18) {
			return "eligible to vote";
		}
		else {
			throw new InvalidVotingException("not eligible to votes");
		}
	}
	
	
	//----------------------------------------------------------------
	/*
	 * 
	 * 
	 * 
	 *            Unit test cases
	 * 
	 * 
	 * 
	 */
	//-----------------------------------------------------------------
	@BeforeClass
	public static void beforeFirstTest() {
		System.out.println("executing before first test case\n");
	}
	@AfterClass
	public static void afterAllTest() {
		System.out.println("executing all test cases\n");
	}
	
	@Before
	public void runBeforeTest() {
		System.out.println("executing before test cases");
	}
	
	@After
	public void runAfterTest() {
		System.out.println("executing after test cases \n");
	}
	
	@Test
	public void testLogin() {
		System.out.println("executing login test cases");
		JunitTesting loginObj=new JunitTesting();
		String result=loginObj.login("aditya","1234");
		assertEquals("Valid User",result);
	}
	
	@Test
	@Ignore
	public void testSum() {
		System.out.println("executing sum test cases");
		JunitTesting sumObj=new JunitTesting();
		int resultSum=sumObj.sum(10, 20);
		
		assertEquals(30,resultSum);
	}
	
	
	
	@Test (expected=InvalidVotingException.class)
	public void testAgeValidation() throws InvalidVotingException {
		System.out.println("executing exception test cases");
		JunitTesting ageValidationObj=new JunitTesting();
		ageValidationObj.ageValidation(10);
	}
}