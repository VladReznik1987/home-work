package CalculatorPro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		Calculator calc = new Calculator();
		int a = calc.calculate('+', 5, 7);
		assertEquals(12, a);
		int b = calc.calculate('*', 5, 7);
		assertEquals(35, b);
		double c = calc.calculate('/', 10.0, 2.0);
		assertEquals(5.0, c);
		 a = calc.calculate('/', 10, 2);
		assertNotEquals(5, a);
		a= calc.calculate('^', 5,5);
		assertEquals(3125, a);
	}

}
