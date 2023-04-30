package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator act = new Calculator();
		
		int additionValue = act.add(12, 13, 20);
		int multiplicationValue = act.mul(3, 5);
		act.sub();
		
		System.out.println(additionValue);
		System.out.println(multiplicationValue);
		
	}
}
