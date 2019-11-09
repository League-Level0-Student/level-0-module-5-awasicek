package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
      	skills.skill1();
      	skills.skill2();
      	skills.skill3();
      	skills.skill4();
      	skills.skill5();
	}

	private void skill1() {
		System.out.println("Skill 1.");
		
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		int userDimes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dimes you have."));

		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " + userDimes*10 + " cents.");

		// Ask the user how tall they are (inches)
		int userHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter your height (in inches)."));

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (userHeight < 36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties.");
		} else {
			JOptionPane.showMessageDialog(null, "You must have eaten your Wheaties!");
		}
		
	}

	private void skill2() {
		System.out.println("Skill 2.");
		
		// Write a loop to print every third number between 1 and 30 to the console 
		for(int i = 1; i <= 30; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	private void skill3() {
		System.out.println("Skill 3.");
		
		// Get a random number that is less than 20 and print it to the console 
		Random ranGen = new Random();
		int ranNum = ranGen.nextInt(20);
		System.out.println(ranNum);
		
		// Get another random number that is less than 10 and print it to the console 
		int anotherRanNum = ranGen.nextInt(10);
		System.out.println(anotherRanNum);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
		JOptionPane.showMessageDialog(null, "Difference between the two random numbers: " + (ranNum - anotherRanNum));
		
	}

	private void skill4() {
		System.out.println("Skill 4.");
		
		// In a pop-up, ask the user for the city they live in 
		String userCity = JOptionPane.showInputDialog("Enter the name of the city where you live.");


		// If they answered "San Diego", tell them they live in America's Finest City 
		if (userCity.equalsIgnoreCase("san diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
		} else {
			// Otherwise, tell them to move to San Diego 
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
		}

		// Create a variable - cars - and initialize it to the number of cars your family has. 
		int userNumCars = 3;
		final int WHEELS_PER_CAR = 4;
		
		if (userNumCars == 0) {
			// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
			JOptionPane.showMessageDialog(null, "You likely use public transportation.");
		} else if (userNumCars == 1) {
			// If there is 1 car, use a pop-up to display the make/model of the car 
			JOptionPane.showMessageDialog(null, "I have no idea the make/model of your car. But it sure would be cool if I knew it.");
		} else {
			// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
			JOptionPane.showMessageDialog(null, "Your cars have a total of " + userNumCars * WHEELS_PER_CAR + " wheels between them.");
		}
	}

	private void skill5() {
		System.out.println("Skill 5.");
		// In a pop-up, ask the user for the name of their school 
		String userSchool = JOptionPane.showInputDialog("Enter the name of your school");

		// In another pop-up, tell the user, that their school is a fantastic school. 
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, "Your school, " + userSchool + ", is fantastic.");
		
	}

}
