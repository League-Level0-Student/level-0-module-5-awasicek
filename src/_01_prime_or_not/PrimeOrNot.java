/**
 * @fileoverview Goal: Ask the user for a number, then tell them if the number is prime! 
 * A prime number is a number that is only divisible by 1 and itself.
 */
package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		int userNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer."));
		
		if(userNum == 0) {
			JOptionPane.showMessageDialog(null, "By definition, 0 is not a prime number.");
		} else if (userNum == 1) {
			JOptionPane.showMessageDialog(null, "By definition, 1 is not a prime number.");
		} else if (userNum < 0) {
			JOptionPane.showMessageDialog(null, "By definition, negative numbers are not prime.");
		} else {
			boolean isPrime = true;
			
			// 1. Use a for loop, if statement, and modulo to find if the number is divisible by any number between 1 and itself.
			for(int i = 2; i < userNum; i++) { // note that 2 is prime and the program will not enter the loop for that case
				if(userNum % i == 0) {
					// 2. If the number is divisible by any of those numbers, then the number is not prime.
					System.out.println("The number entered (" + userNum + ") is not prime because it is also divisible by " + i + ".");
					isPrime = false;
				}
			}
			
			if (isPrime) {
				JOptionPane.showMessageDialog(null, "The number entered (" + userNum + ") is prime!");
			} else {
				JOptionPane.showMessageDialog(null, "The number entered (" + userNum + ") is not prime.");
			}
		}
	}

}
