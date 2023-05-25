import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// codes executed before all test methods
	}

	@Before
	public void setUp() throws Exception {
		// codes executed before each test method
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 3087 ;
		assertEquals(expected, actual);
		
	}

	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 5332114 ;
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		int a = 27;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 9;
		assertEquals(expected, actual);
		
	}
	
	@After
	public void tearDown() throws Exception {
		// codes executed after each test methods
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// codes executed after each test methods
	}

}
