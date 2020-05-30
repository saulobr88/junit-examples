package tests;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import water.WaterApp;

public class WaterTest {

	@Test
	public void testWaterApp() {
		WaterApp app = new WaterApp();

		System.out.println("Casos de teste WaterApp");
		
		// assertEquals(expected, actual, delta, message);
		assertEquals(2.0, app.giveMeWaterAmount(50), 0.09, "Caso 1");
		assertEquals(2.4, app.giveMeWaterAmount(60), 0.09, "Caso 2");
		assertEquals(2.8, app.giveMeWaterAmount(70), 0.09, "Caso 3");
		assertEquals(3.2, app.giveMeWaterAmount(80), 0.09, "Caso 4");
		assertEquals(3.6, app.giveMeWaterAmount(90), 0.09, "Caso 5");
		assertEquals(4.0, app.giveMeWaterAmount(100), 0.09, "Caso 6");
		
		assertTrue(app.giveMeWaterAmount(100)==4.0, "Caso 8 - Water AssertTrue");
		assertFalse(app.giveMeWaterAmount(100)==5.0, "Caso 9 - Water AssertFalse");
	}

}
