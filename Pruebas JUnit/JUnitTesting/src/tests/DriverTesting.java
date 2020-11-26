package tests;

import static org.junit.Assert.*;
import org.junit.Test;
//import static src.tests.DriverTesting.*;
public class DriverTesting {
	@Test
	public void test_positive() {
		UnitTesting objeto = new UnitTesting();
		String res_positive_numbers = objeto.solve("20","100");
		assertEquals("20",res_positive_numbers);
	}
	@Test
	public void test_negative() {
		UnitTesting objeto = new UnitTesting();
		
		String res_negative_numbers = objeto.solve("50","-240");
		assertEquals("-120",res_negative_numbers);
		
	}
	@Test
	public void test_strings() {
		UnitTesting objeto = new UnitTesting();
		
		String res_strings = objeto.solve("foo","bar");
		assertEquals("NaN",res_strings);
	}
}