package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {

    private Scanner scanner;
    private PrintStream printStream;
    private int num;


    public Factorial(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public int isInputNumberValid() {

		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`.
			- Use an instance variable `scanner` to accept the input from the user.

		- If the input value is valid, return the number input by the user (NOT the factorial of the number).

		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1

		- All code should be inside the placeholders below.
		*/

        //YOUR CODE STARTS HERE
        // Check if input is a number
        if (scanner.hasNextInt()) {
            // If it is a number, I scan the integer input from user
            num = scanner.nextInt();
            // If number is smaller than 1, I request a valid input and return -1 for handling the case
            if (num < 1) {
                this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
                return -1;
                // If number is larger than 10, I request a valid input and return -1 for handling the case
            } else if (num > 10) {
                this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
                return -1;
                // If the number is in the requested range from 1 to 10 (inclusive) it will return the number
            } else {
                return num;
            }
            //If it isn't a number, I request a valid input and it returns a -1 for handling the case
        } else {
            printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
            return -1;
        }
        //YOUR CODE ENDS HERE
    }


    private void calculateFactorial(int num) {

		  /*
		  Use this method to calculate the factorial of the number input by the user.

		  - All code should be inside the placeholders below.
		*/

        int result = 1;
        //YOUR CODE STARTS HERE
        //We set the class variable to be equal with the method parameter
        this.num = num;
        //If number is not -1 (Valid input) We proceed with the factorial calculation
        // I am using a for loop to calculate the factorial, by multiplying the numbers (incrementing i)
        if (num != -1) {

            for (int i = 1; i <= num; i++) {
                this.printStream.print(i);
                result = result * i;
            }

        }
        //YOUR CODE ENDS HERE
        this.printStream.print("The Factorial is: " + result);

    }

    public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */

        int input = this.isInputNumberValid();
        if (input != -1) {
            calculateFactorial(input);
        }

    }


    public static void main(String[] args) {
		/*
		 Do not change this method.
		 */
        Factorial fact = new Factorial(System.in, System.out);
        System.out.println("Enter an integer between 1 and 10, inclusive");
        fact.calculateFactorial();
    }


}