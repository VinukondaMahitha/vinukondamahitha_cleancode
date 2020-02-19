package cleancode;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;
public class Calculating_InterestTest {

	@Test
	public void testSimpleinterest() {
		 Calculating_Interest c=new  Calculating_Interest();
		assertEquals(24000.00,c.Simpleinterest(100000.00, 6, 4),0);
	}

	@Test
	public void testCompoundinterest() 
	{
		 Calculating_Interest c=new  Calculating_Interest();
		assertEquals(156000.00,c.Compoundinterest(150000,4,1),0);
		
	}

}
