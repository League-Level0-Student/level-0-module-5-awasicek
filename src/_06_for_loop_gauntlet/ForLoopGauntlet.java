/**
 * @fileoverview The goal of this assignment is to make you a master of utilizing for loops. 
 * Complete all the for loop challenges on the paper. Please read each challenge carefully 
 * and make sure that your for loops display exactly what is asked. If you finish them all, 
 * try the bonus challenge.
 */
package _06_for_loop_gauntlet;

import java.time.Year;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		/* ----- Single For-Loops ----- */
		System.out.println("SINGLE FOR-LOOPS\n");

		// Write a for loop to do each the following:

		// 1. Display all numbers from 0 to 100
		System.out.println("1.");
		for(int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 2. Display all numbers from 100 to 0
		System.out.println("2.");
		for(int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 3. Display all even numbers from 2 to 100
		System.out.println("3.");
		for(int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 4. Display all odd numbers from 1 to 99
		System.out.println("4.");
		for(int i = 1; i <= 99; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
		//     Eg:	
		//          1 is odd
		//          2 is even
		//          3 is odd
		//          4 is even
		//          5 is odd...etc.
		System.out.println("5.");
		for(int i = 1; i <= 500; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		System.out.println("");

		// 6. Display all multiples of 7 from 0 to 777.
		System.out.println("6.");
		for(int i = 0; i <= 777; i++) {
			if (i % 7 == 0) System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// 7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)
		System.out.println("7.");
		final int CURRENT_YEAR = Year.now().getValue();
		final int BIRTH_YEAR = 1983;
		for(int i = BIRTH_YEAR; i <= CURRENT_YEAR; i++) {
			if (i == CURRENT_YEAR) System.out.println("In " + i + ", I am " + (i - BIRTH_YEAR) + " years old.");
			else if (i == BIRTH_YEAR + 1) System.out.println("In " + i + ", I was " + (i - BIRTH_YEAR) + " year old.");
			else System.out.println("In " + i + ", I was " + (i - BIRTH_YEAR) + " years old.");
		}
		System.out.println("");

		/* ----- Nested For-Loops ----- */
		System.out.println("NESTED FOR-LOOPS\n");
		
		// Write nested for loops (a for loop inside another for loop) to do the following:

		// 1. Display this output:
		//	          0  0
		//	          0  1
		//	          0  2
		//	          1  0
		//	          1  1
		//	          1  2
		//	          2  0
		//	          2  1
		//	          2  2
		System.out.println("1.");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("\t" + i + "\t" + j);
			}
		}
		System.out.println("");
		
		// 2. Display the numbers 1 through 9 in a 3x3 square grid like this:
	    //      1  2  3
	    //      4  5  6
	    //      7  8  9
		System.out.println("2.");
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= 3; j ++) {
				System.out.print("\t" + (j + i*3));
			}
			System.out.println("");
			
		}
		System.out.println("");
		// Teaching note: there are 9 digits to display so if we use two loops and only the inner most loop prints (1 number at a time), 
		// then if we have an outer loop that runs 3 times and an inner loop that runs 3 times then 9 numbers will be printed. Key take away
		// is that total number of loop iterations is calculated by multiplying together the number of times each loop in the hierarchy runs.
		// Alternatively, show that 1 + 0 x 3 = 1; 1 + 1 x 3 = 4; and 1 + 2 x 3 = 7; etc.
		
		// 3. Display the numbers 1 through 100 in a 10x10 square grid.
		System.out.println("3.");
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("\t" + (j + i*10));
			}
			System.out.println("");
		}
		System.out.println("");
		
		// 4. Display the following output:
	    //      *
	    //      *  *
	    //      *  *  *
	    //      *  *  *  *
	    //      *  *  *  *  *
	    //      *  *  *  *  *  *
		System.out.println("4.");
		for(int i = 1; i <= 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*  ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		/* ----- Bonus ----- */
		System.out.println("BONUS\n");
		
		// 1. Write a for loop that counts down from 100 to 0. 
		// However, the for loop must start with for(int i = 0; and you may NOT have any code ABOVE your for loop.
		System.out.println("1.");
		for(int i = 0; i <= 100; i++) {
			System.out.print(100 - i + " ");
		}
		System.out.println("");
	}

}
