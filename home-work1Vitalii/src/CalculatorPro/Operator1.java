package CalculatorPro;

public interface Operator1 {
	public int calculate(int a, int b);

	default double calculate(double a, double b) {
		return a / b;
	}
}
