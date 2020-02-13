/*
Name: Ifaz Alam
Date: February 12, 2020
Description: 'More User Input of Data' assignment from https://programmingbydoing.com/

----Things I learned----
scan.next only reads the first section of an input (stops reading when a space is detected)
scan.nextLine will read the entire line as a string
scan.next(DataTypeName) to read different data types
 */

//Imports the Scanner class from the java.util package
import java.util.Scanner;

public class MoreUserInputofData {
	public static void main(String[] args) {
		//Creates a new object from the Scanner class named 'input'
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		//First Name
		System.out.print("First Name: ");	
		String firstName = input.nextLine();
		
		//Last Name
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
		
		//Grade
		System.out.print("Grade (9 - 12): ");
		int grade = input.nextInt();

		//Student ID
		System.out.print("Student ID: ");
		int studentID = input.nextInt();
		
		//Login
		System.out.print("Login: ");
		String login = input.next();
		
		//Login
		System.out.print("GPA (0.0 - 4.0): ");
		float gpa = input.nextFloat();
		
		//Prints summary of given information
		System.out.printf("Your Information:\n\tLogin: %s\n\tID:    %d\n\tName:  %s, %s\n\tGPA:   %.2f\n\tGrade: %d", login, studentID, lastName, firstName , gpa, grade);
		
	}

}
