package wissen.JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses ({JunitTesting.class,EvenOrOdd.class})
public class TestSuite {

}
