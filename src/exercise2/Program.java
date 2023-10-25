package exercise2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
  /* Exercise number 2: Write a program to read a integer, also say whether this number
    is even or odd*/

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		sc.close();
	}
}
