/*
Name: Ifaz Alam
Date: February 15, 2020
Description: Guessing Game

--- NOTES ---
nextInt(max) generates a number in the interval [0,max)
To make the range 1-10, add 1 to the random variable so that [0,10) becomes [1, 11)
*/

// imports the random and scanner classes
import java.util.Random;
import java.util.Scanner;

class GuessingGame {
  // method for evaluating guess
  static void evaluate(int guess, int num) {
    // notifies user if their guess is correct
    if (guess == num) {
      System.out.println("\nYou are correct! Good job!");
    }

    // allows user to guess again if they are incorrect, and re-evaluate's their guess
    else {
      Scanner input = new Scanner(System.in);
      System.out.print("\nTry again?\n>> ");
      int additionalGuess = input.nextInt();
      retry(additionalGuess, num);
    }
  }

  public static void main(String[] args) {
    // Random and Scanner objects
    Random randint = new Random();
    Scanner input = new Scanner(System.in);

    // asks user to guess
    float num = 1 + randint.nextInt(10);
    System.out.print("I am thinking of a number from 1 - 10, can you guess it?\n>> ");
    int guess = input.nextInt();

    //calls the evaluate function
    //since num is a float, it is passed as an integer via casting
    evaluate(guess, (int)num);
  }
}