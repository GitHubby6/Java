/*
Name: Ifaz Alam
Date: February 6, 2020
Description: Determines the average of 5 grades
*/

//imports Scanner class to read user input
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello!");
    int sum = 0; //sum of 5 grades
    for (int i = 1; i < 6; ++i) {
      Scanner scan = new Scanner(System.in); //creates scanner object named scan
      System.out.printf("Enter grade for class %d: ", i);
      int grade = scan.nextInt(); //reads user input
      sum += grade; 
    }
    float average = sum / 5; //average
    System.out.printf("\nYour calculated average is: %.2f", average);
  }
}