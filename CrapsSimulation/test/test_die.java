import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_die
{

	@Test
	void test()
	{
		String testStaticString = "Die.testStatic()";
		
		Die testDie = new Die();
		
		assertEquals(testDie.testStatic(), testStaticString);
	}

}
