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
		String result = String.format("%.2f", areaCalculatorService.calcCircleArea(r));

		assert !expected.equals(result);
	}

	@Test
	void testSquareAreaCalculation() {
		double l = 5;
		String expected = "25.00";
		String result = String.format("%.2f", areaCalculatorService.squareArea(l));

		assert !expected.equals(result);
	}

}
