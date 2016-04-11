package SimpleCTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import SimpleC.Simplecal;

public class SimpleCalculatorTest {

	@Test
	public void testAdd(){
		Simplecal calc = new Simplecal();
		calc.add(10,20);
		assertEquals(30,calc.getResult());
		
	}

	@Test
	public void testsub(){
		Simplecal calc = new Simplecal();
		calc.sub(10,20);
		assertEquals(-10,calc.getResult());
	}
	@Test
	public void testmulti(){
		Simplecal calc = new Simplecal();
		calc.mult(10,20);
		assertEquals(200,calc.getResult());
		
	}
	@Test
	public void testdiv(){
		Simplecal calc = new Simplecal();
		calc.div(100,20);
		assertEquals(5,calc.getResult());
		
	}
	@Test
	public void testinc(){
		Simplecal calc = new Simplecal();
		calc.inc(100);
		assertEquals(100,calc.getResult());
		calc.inc(200);
		assertEquals(300,calc.getResult());
		
	}
}
