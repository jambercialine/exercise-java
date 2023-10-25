package exercise3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* read two integer values. Afterwards, the program should display the message:
		 *  “They are multiples” or “They are not multiples”, indicating whether the values are multiples 
		 *  of each other. Attention: numbers must be able to be entered in ascending or descending order.*/

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0){
			System.out.println("They are multiples.");
		}
		else {
			System.out.println("They are not multiples.");
		}
		sc.close();
	}

}
