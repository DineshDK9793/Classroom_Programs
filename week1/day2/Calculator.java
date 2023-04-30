package week1.day2;

public class Calculator {

	public int add(int firstValue, int secondValue, int thirdValue) {
		int sum = firstValue+secondValue+thirdValue;
		return sum;	
	}
	
	public int mul(int mulValue1, int mulValue2) {
		int result = mulValue1*mulValue2;
		return result;
	}
	
	public void sub() {
		System.out.println("No Calculation is applicable in this method ..... ");
	}
}
