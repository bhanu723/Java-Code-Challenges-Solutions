package javaimportantconcepts;

import java.util.Scanner;

/*
 * This program explains how to create custom exceptions or user defined exceptions
 * @Author: BhanuSurendra Deepala
 */
public class CreateUserDefinedException {

	public static void main(String[] args) {

		// Read age from the console
		String email;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = Integer.parseInt(scan.nextLine());

		try {
			if (checkAge(age)) {
				System.out.println("Sign Up Successful!! Welcome!!!");
				try {
					System.out.println("Enter your Email ID now!!");
					email = scan.nextLine();
					if (checkEmail(email))
						System.out.println("Successfully submitted Email");
					
				} catch (EmptyEmailException e) {
					System.err.println(e.getMessage());
				}
			}
		} catch (AgeLimitException e) {

			System.err.println(e.getMessage());
		}

	}

	private static boolean checkEmail(String email) throws EmptyEmailException {
		if (email.isEmpty() || email == null)
			throw new EmptyEmailException("Exception Occured!! \nSorry, you must enter valid email, it can't be empty or null");

		return true;
	}

	private static boolean checkAge(int age) throws AgeLimitException {

		if (age < 18)
			throw new AgeLimitException("Exception Occured!! \nSorry!! You must be atleast 18 years to signup");
		return true;
	}

}
