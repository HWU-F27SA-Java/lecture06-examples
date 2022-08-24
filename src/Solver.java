/*
 * This program solve any equation of the form ax2 + bx + c =0
 * The user provides the coefficients a, b, c
 * The program uses global variables x1, x2, numberOfRoots to store results
 * It also uses a separate method for solving the equation
 */

import java.util.Scanner;

public class Solver {
	
	
	/*
	 * The main method proceeds in three steps:
	 * 1. reads the data from the user,
	 * 2. calls the solve equation to calculate the roots
	 * 3. prints the result
	 */
	public static void main(String[] args) {
		// create a scanner to read form keyboard
		Scanner keyboard = new Scanner(System.in);

		// user enters a, b, c
		System.out.println("Enter Values for a, b and c ");
		System.out.print("Enter coefficient a? ");
		double coef1 = keyboard.nextDouble(); // read a double and store it into the variable a
		System.out.print("Enter coefficient b? ");
		double coef2 = keyboard.nextDouble(); // read a double and store it into the variable b
		System.out.print("Enter coefficient c? ");
		double coef3 = keyboard.nextDouble(); // read a double and store it into the variable c

		//build an equation
		Equation eq = new Equation();
		eq.a = coef1;
		eq.b = coef2;
		eq.c = coef3;
		
		//solve the equation by calling its solve method
		Root solution = eq.solve(); 

		// writes result
		System.out.println("------------------------");
		switch (solution.numberOfRoots) {
		case 0: // no roots
			System.out.println("The solution has no real roots");
			break;
		case 1:
			System.out.println("Equation has one root");
			System.out.println("x1 = x2 = " + solution.x1);
			break;
		case 2:
			System.out.println("Equation has two roots");
			System.out.println("x1 = " + solution.x1 + "x2 = " + solution.x2);
			break;
		default:
			System.out.println("All real numbers are roots!");

		}

		keyboard.close();
	}


}
