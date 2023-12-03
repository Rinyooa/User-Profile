/**Student Name: 

  *Date Completed: 09/04/2022

  *Project No. and Page No. in the book: Chapter 1-4 & 7 PP

  *Extra Credit: Yes DecimalFormat class

  *Project Description: Creating a profile and storing information of the user's inputs in appropriate variables, precise calculations of the user's average miles walked per day within a week, 
  *and usage of the random generator to randomly pick the user's favorite movie to potential reward themselves for the hard work or to encourage to work harder.

        **/

package userprofile;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class UserDetails {

	public static void main(String [] args) {
		//calling for necessary variables and objects to use in program
		Scanner scan = new Scanner(System.in);
		final int DAYS=7, WATCHAMOUNT = 5;
		final double STEPSINMILE = 5280;
		double averageSteps, healthyAverage = 2.00;
		int age, daysOfWeek, userSteps = 0, mondaySteps, tuesdaySteps, wednesdaySteps, thursdaySteps, fridaySteps, saturdaySteps, sundaySteps;
		String firstName, lastName, college;
		String [] movieShows = new String [WATCHAMOUNT];
		Random generator = new Random();
		
		//collecting information on user and storing in variables
		System.out.print("What is your first name? ");
		firstName = scan.nextLine();
		System.out.print("What is your last name? ");
		lastName = scan.nextLine();
		System.out.print("What college are you attending? ");
		college = scan.nextLine();
		System.out.print("What is your age? ");
		age = scan.nextInt();
		
		//usage of for loop to run the switch statement 7 times for every day of the week
		for (daysOfWeek=1; daysOfWeek<= DAYS; daysOfWeek++) {
			
			switch (daysOfWeek)
			{
			case 1:
				System.out.print("How many steps did you walk Monday? ");
				mondaySteps = scan.nextInt();
				userSteps = mondaySteps;
				break;
			case 2:
				System.out.print("How many steps did you walk Tuesday? ");
				tuesdaySteps = scan.nextInt();
				userSteps += tuesdaySteps; //collecting the user's steps input and adding them together with each entry
				break;
			case 3:
				System.out.print("How many steps did you walk Wednesday? ");
				wednesdaySteps = scan.nextInt();
				userSteps += wednesdaySteps;
				break;
			case 4:
				System.out.print("How many steps did you walk Thursday? ");
				thursdaySteps = scan.nextInt();
				userSteps += thursdaySteps;
				break;
			case 5:
				System.out.print("How many steps did you walk Friday? ");
				fridaySteps = scan.nextInt();
				userSteps += fridaySteps;
				break;
			case 6:
				System.out.print("How many steps did you walk Saturday? ");
				saturdaySteps = scan.nextInt();
				userSteps += saturdaySteps;
				break;
			case 7:
				System.out.print("How many steps did you walk Sunday? ");
				sundaySteps = scan.nextInt();
				userSteps += sundaySteps;
				break;
			default: 
				System.out.println("There was an error in your input ");
		
			}
			
		}
		
		averageSteps = (userSteps/STEPSINMILE)/DAYS; //calculations of the average steps per day within a week
		DecimalFormat fmt = new DecimalFormat("0.00"); //creating a DecimalFormat to use in program
		
		//Display of user information
		System.out.println();
		System.out.println("User Information");
		System.out.println();
		System.out.println("Name:\t\t\t" + firstName + " " + lastName);
		System.out.println("College Attended:\t" + college);
		System.out.println("Age:\t\t\t" + age );
		System.out.println("Daily distance walked:\t" + fmt.format(averageSteps) +"miles");
		System.out.println();
		
		//if else statement to display specific message depending on user's average steps
		if (averageSteps > healthyAverage)
			System.out.println("You walked on average more than two miles a day this week! Keep up the good work and healthy lifestyle! ");
		
		else if (averageSteps == healthyAverage)
			System.out.println("You walked on average exactly two miles a day this week! Keep on keeping on! It'll pay off!");
			
		else
			System.out.println("You walked an average of less than two miles a day this week. \nPerhaps try walking more next week to stay nice and healthy! A few steps a day keeps the Doctors away!");
		
		System.out.println();
		System.out.println("Aside from walking to stay healthy, you should have some fun!");
		System.out.println();
		
		//storing user's favorite movies/shows to an array
		System.out.print("What is a movie or show that you like? ");
		scan.nextLine();
		movieShows[0] = scan.nextLine();
		System.out.print("What is a movie or show that you like? ");
		movieShows[1] = scan.nextLine();
		System.out.print("What is a movie or show that you like? ");
		movieShows[2] = scan.nextLine();
		System.out.print("What is a movie or show that you like? ");
		movieShows[3] = scan.nextLine();
		System.out.print("What is a movie or show that you like? ");
		movieShows[4] = scan.nextLine();
		
		//display of user's favorite movies/shows inputs
		System.out.println();
		System.out.println("You have entered five of your favorite movies/shows:\n" +"\n1: " + movieShows[0] + "\n2: " + movieShows[1] + "\n3: " + movieShows[2] + "\n4: " + movieShows[3] + "\n5: " + movieShows[4]);
		System.out.println();
		
		int ran = generator.nextInt(4)+1; // creation of random generator inclusive to 5
		System.out.println("The system has randomly picked this movie for you to watch: " + movieShows[ran]); //random generator in array to choose random movie
		System.out.println("I hope you enjoy the show.");
		
		
		
		
		
	}
}
