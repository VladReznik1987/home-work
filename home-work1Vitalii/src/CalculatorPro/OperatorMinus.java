package CalculatorPro;

public class OperatorMinus implements Operator1 {
	char ch = '-';

	@Override
	public int calculate(int a, int b) {

		return a - b;
	}
}
