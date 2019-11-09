/**
 * @fileoverview Goal: Print out the first 12 numbers of the Fibonacci sequence.
 * Specifically, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
 */
package _02_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// 1. Declare and initialize two int variables.
		int primaryNum = 0;
		int secondaryNum = 1;
		
		// 2. Write some code that swaps the values inside of those variables. Hint: this may require creating a third int variable.
		int tertiaryNum;
		
		// 3. Use a for loop and modify the code you wrote above so that it prints out the first 12 digits of the fibonacci sequence. 
		// You will want to preserve the order of the variables (i.e. after each iteration of your loop, one variable will always 
		// contain the lower value and the other will always contain the higher value).
		for(int i = 0; i < 10; i++) {
			tertiaryNum = primaryNum + secondaryNum;
			
			if(i == 0) {
				System.out.print(primaryNum + " " + secondaryNum + " " + tertiaryNum);
			} else {
				System.out.print(" " + (primaryNum + secondaryNum));
			}
			// shift left in the sequence
			primaryNum = secondaryNum;
			secondaryNum = tertiaryNum;
		}
		
	}

}
