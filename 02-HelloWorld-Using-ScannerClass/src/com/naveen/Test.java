package com.naveen;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String sc = scan.nextLine();
		
		System.out.println("Hi " + sc + ", Good Morning..!");

	}

}

/*
 * output: 
 * Enter the name: Naveen Kumar 
 * Hi Naveen Kumar, Good Morning..!
*/

//In above program we are using Scanner Class
