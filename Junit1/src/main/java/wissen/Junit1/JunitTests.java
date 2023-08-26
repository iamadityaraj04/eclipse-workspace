package wissen.Junit1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import wissen.JUnit.JunitTesting;

public class JunitTests {
	public String authenticate(String usrname, String pswd) {
		if(usrname.equals("admin") && pswd.equals("admin@123")) {
			return "valid user :)";
		}
		else {
			return "invalid user :(";
		}
		
	}
	
	/* 
	 * ---------------------------
	 * 
	 * Unit test
	 * 
	 * --------------------------- 
	 */
	
	
	@Test
	public void authenticateTest() {
		JunitTests authObj1=new JunitTests();
		assertEquals("valid user :)",authObj1.authenticate("admin","admin@123"));
	}
}
