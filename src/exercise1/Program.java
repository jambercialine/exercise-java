package exercise1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
 
   /* Exercise number 1: Write a program to read an integer, also say whether
this number is negative or not.*/
	
	Scanner sc = new Scanner (System.in);
	

	int x = sc.nextInt();
	
	if (x>0) {
		System.out.println("positive");
	}
	else {
		System.out.println("negative");
	}
	 
	sc.close();
	
	
	}
}
