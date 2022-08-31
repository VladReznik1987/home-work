package CalculatorPro;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	private Map<Character, Operator1> operatorCacheMap = new HashMap<>();

	public Calculator() {
		operatorCacheMap.put('+', new OperatorPlus());
		operatorCacheMap.put('-', new OperatorMinus());
		operatorCacheMap.put('*', new OperatorMultiplier());
		operatorCacheMap.put('/', new OperatorDivide());
		operatorCacheMap.put('^', new OperatorExponentiation());
	}

	public int calculate(char ch, int a, int b) {
		return operatorCacheMap.get(ch).calculate(a, b);

	}

	public double calculate(char ch, double a, double b) {
		return operatorCacheMap.get(ch).calculate(a, b);
	}

}
