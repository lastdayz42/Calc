import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

	@Test
	public void testAdd(){
		SimpleCal calc = new SimpleCal();
		calc.add(10,20);
		assertEquals(30,calc,getResult());
		
	}
	@Test
	public void testsub(){
		SimpleCal calc = new SimpleCal();
		calc.sub(10,20);
		assertEquals(-10,calc,getResult());
	}
}
