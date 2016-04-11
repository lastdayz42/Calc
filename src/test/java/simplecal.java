import static org.junit.Assert.*;

public class simplecal {
	
	@Test
	public void testAdd(){
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10,20);
		assertEquals(30,calc,getresult());
		
	}
	

}
