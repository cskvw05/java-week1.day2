package week1.day2;

import java.util.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
		
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int length = data.length;
		
		Arrays.sort(data);
		
		System.out.println("Second largest number is: " + data[length - 2]);

	}

}
