package CalculatorPro;

public class OperatorExponentiation implements Operator1 {
	char ch = '^';

	@Override
	public int calculate(int a, int b) {
		if (b == 1) {
			return a;
		} else {
			return a * calculate(a, b - 1);
		}

	}

}
