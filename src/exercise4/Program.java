package exercise4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
  /* Read the start time and end time of a game.
   * Next, calculate the duration of the game,
   * knowing that it can start on one day and end on another, 
   * lasting a minimum of 1 hour and a maximum of 24 hours. */

		Scanner sc = new Scanner(System.in);
		
		int startTime = sc.nextInt();
		int endTime = sc.nextInt();
		
		int duration;
		if (startTime < endTime) {
			duration = endTime - startTime;
		}
		else {
			duration = 24 - startTime + endTime;
		}
		
		System.out.println(" The game lasted " + duration + " hours.");
	
		sc.close();
	}
}
