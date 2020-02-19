package cleancode;
import static org.junit.Assert.*;

import org.junit.Test;

import HouseConstructionCost.*;
public class Test1 {


	@Test
	public void testCost() {
		Gentrate t= new Gentrate();
		assertEquals(2400.0,t.cla("StandardMaterial", 2),0);
		Gentrate t2= new Gentrate();
		assertEquals(3600.0,t2.cla("HighStandardMaterial", 2),0);
		Gentrate t3= new Gentrate();
		assertEquals(3000.0,t3.cla("AboveStandardMaterial", 2),0);
		Gentrate t4= new Gentrate();
		assertEquals(5000.0,t4.cla("HighStandardMaterial and FullyAutomated", 2),0);
		
		
		
	}

}