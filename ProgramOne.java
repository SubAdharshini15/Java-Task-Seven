package Programs;

import java.util.Scanner;

public class ProgramOne {
	public static void main(String[] args) {

		try {
			System.out.println("Enter Number1 and Number2 : ");
			Scanner s = new Scanner(System.in);
			int number1 = s.nextInt();
			int number2 = s.nextInt();
			int c = number1 / number2;
			System.out.println(c);

		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("Second number should not be zero");

		}

	}
}
