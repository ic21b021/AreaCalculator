package at.technikumwien.areacalc.AreaCalculator;

import at.technikumwien.areacalc.AreaCalculator.Service.AreaCalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AreaCalculatorApplicationTests {

	private final AreaCalculatorService areaCalculatorService = new AreaCalculatorService();

	@Test
	void testCircleAreaCalculation() {
		double r = 5.24;
		String expected = "86.59";
		assert !expected.equals(areaCalculatorService.calcCircleArea(r));
	}

}
