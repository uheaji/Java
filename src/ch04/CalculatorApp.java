package ch04;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator Cal = new Calculator();
		int result1 = Cal.add(10, 5);
		int result2 = Cal.multi(result1,20);
		int result3 = Cal.divid(result2, 5);
		int result4 = Cal.minus(result3, 100);
		System.out.println(result4);
	}
}
