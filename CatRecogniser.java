/**
 * 
 * Software Development 1, Coursework 2.

 * 
 * Make sure you read the specification document on
 * Canvas in full before starting this assessment.
 * 
 */
import java.util.Scanner;

public class CatRecogniser {

	public static void main(String[] args) {
		//Declare variable
		int numberOfCats;
		boolean tryAgain;
		Scanner scan = new Scanner(System.in); //Instantiate a new scanner to get information from the users

		System.out.println("Welcome to the Cat Recogniser!");
		System.out.println();

		System.out.println("How many cats do you have?"); // finds out how many cats there are
		numberOfCats = scan.nextInt();

		//Initializing an array
		String[] catName = new String[numberOfCats]; // the length of the array = numberOfCats
		String[] longOrShortHair = new String[numberOfCats];
		double[] catAge = new double[numberOfCats];

		for (int i = 0; i < numberOfCats; i++) {
			System.out.println("Please enter the name of cat#" + (i + 1) + ":");
			catName[i] = scan.next();

			System.out.println("Does " + (catName[i]) + " have 'long' or 'short' hair?");
			longOrShortHair[i] = scan.next();

			System.out.println("How old is " + (catName[i]) + "?");
			catAge[i] = scan.nextDouble();
		}
		do {
			tryAgain = false;

			System.out.println("Do you wish to identify a cat (yes/no)?"); //Identifying part
			String respond = scan.next();

			if (respond.equalsIgnoreCase("yes")) {
				tryAgain = true;
				System.out.println("Does it have 'long' or 'short' hair?");
				String longOrShortHair2 = scan.next();

				System.out.println("Is it 'old' or 'young'?");
				String catAge2 = scan.next();
			
				System.out.println("The following cats meet this criteria:");
				for (int i = 0; i < numberOfCats; i++) {
					if (longOrShortHair2.equalsIgnoreCase(longOrShortHair[i]) && catAge2.equalsIgnoreCase("old") && catAge[i] >= 11) { // greater than or = 11 is old
						System.out.println("-" + (catName[i]) + ", who is " + (catAge[i]));

					} else if (longOrShortHair2.equalsIgnoreCase(longOrShortHair[i]) && catAge2.equalsIgnoreCase("young") && catAge[i] < 11) { // less than 11 is young
						System.out.println("-" + (catName[i]) + ", who is " + (catAge[i]));
					  }

				}

			} else if (respond.equalsIgnoreCase("no")) {
				tryAgain = false;
				System.out.println("Thanks for using Cat Recogniser! Goodbye.");
				break; //The Java break statement halts the execution of a loop. The interpreter moves onto the next statement in a program after the loop. The break statement is useful if you want your loop to stop running if a certain condition is met in a loop.
			}
		} while (tryAgain);

	}

}
