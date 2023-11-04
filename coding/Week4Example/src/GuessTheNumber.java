
/**
   Filename: GuessTheNumber.java
     Author: Shelley Lapkowski
       Date: Jan 23, 2023 9:24:02 a.m.
Description: This program will play the "Guess a Number" game.  User will
						 guess a number between 1 and 100.  If the user is wrong, 
						 message is printed letting the user know if their guess was 
						 too high or too low and then let them try again.  User can
						 continue to try to guess the number until they get the right
						 answer or they quit the game by entering -1.
 */

import java.util.Scanner;

public class GuessTheNumber
{

	public static void main(String[] args)
	{
		//Math.random()  generates a number from 0 to 1 as a decimal value - 
		//no 0 and no 1
		//in order to make this useful, we can take that generated number and 
		//adjust it to fit our requirements.
		//example:  Math.random generates .0345;
		//take that number .0345 and multiply that by 100 I end up with 3.45 
		//converted to an int 3.
		//if I generate 0.000000 multiply by 100 and convert to an int I get 0
		//if I generate 0.9999999 multiply by 100 and convert to an int I get 99
		//so if I want a number between 1 and 100 inclusive I multiply by 100 
		//and add 1.
		
		int selectedNumber = (int)(Math.random() * 100 + 1);
		
		System.out.println(selectedNumber);
		
	}

}
