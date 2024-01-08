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

/*
* Using java library class Scanner, we can read input like integers, characters, strings, double values from the user.
* Different methods to read different values such as nextInt(), next(), nextDouble()…
* We need to specify the Keyboard(System.in) while creating Scanner class object.
* Scanner scan = new Scanner(System.in);
* We access all the methods using object reference name
*/
