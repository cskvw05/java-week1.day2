package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Sum of 3 numbers is " + obj.add(1,2,3));
		System.out.println("Subtraction of 2 numbers is " + obj.sub(10, 20));
		System.out.println("Product of 2 numbers is " + obj.mul(25.0, 15.0));
		System.out.println("Division of 2 numbers is " + obj.divide(26788, 3));

	}

}
