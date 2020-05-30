package tests;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import math.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibonacci() {
		Fibonacci f = new Fibonacci();
		
		System.out.println("Casos de teste Fibonacci");
		
		assertEquals(1,f.run(1),"Caso 1");
		assertEquals(1,f.run(2),"Caso 2");
		assertEquals(2,f.run(3),"Caso 3");
		assertEquals(3,f.run(4),"Caso 4");
		assertEquals(5,f.run(5),"Caso 5");
		assertEquals(8,f.run(6),"Caso 6");
		assertEquals(13,f.run(7),"Caso 7");
		assertEquals(-1,f.run(-1),"Caso 8 - Entrada negativa");
		assertEquals(-1,f.run(0),"Caso 9 - Entrada zero");
		
		assertTrue(f.run(2)==1, "Caso 10 - assertTrue");
		assertFalse(f.run(2)==2, "Caso 11 - assertFalse");
	}

}
