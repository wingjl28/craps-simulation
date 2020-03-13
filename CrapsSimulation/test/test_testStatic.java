import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_testStatic
{

	@Test
	void test()
	{
		String testStaticString = "CrookedDie1.testStatic()";
		
		CrookedDie1 testDie = new CrookedDie1();
		
		assertEquals(testDie.testStatic(), testStaticString);
	}
	@Test
	void test_inheritance()
	{
		String testStaticString = "Die.testStatic()";
		
		Die testDie = new CrookedDie1();
		
		assertEquals(testDie.testStatic(), testStaticString);
	}
}
