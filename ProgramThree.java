package Programs;

import java.util.Scanner;

public class ProgramThree {
	public static void main(String[] args) {

		System.out.println("Enter your age :");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if (age < 18) {
			System.out.println("Your entered age is : " + age);
			System.out.println("InvalidAgeException");
			throw new ArithmeticException("Please Enter age greater than 18");
		} else {
			System.out.println("Your Age is : " + age);
		}

	}
}
