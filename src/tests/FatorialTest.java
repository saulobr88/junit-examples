package tests;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import math.Fatorial;

public class FatorialTest {

	@Test
	public void testFatorial() {
		Fatorial f = new Fatorial();
		
		System.out.println("Casos de teste Fatorial");
		
		assertEquals(1, f.run(1), "Caso 1");
		assertEquals(2, f.run(2), "Caso 2");
		assertEquals(6, f.run(3), "Caso 3");
		assertEquals(24, f.run(4), "Caso 4");
		
		assertTrue(f.run(4)==24, "Caso 5");
		assertFalse(f.run(4)==25, "Caso 6");
		
		assertEquals(1, f.run(-1), "Caso 8 - Fatorial negativo");
		assertEquals(1, f.run(0), "Caso 8 - Fatorial zero");
	}

}
