package com.naveen;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hello Ram");
	}

}

/*
 * above program 'Test' is a class name
 * 
 * public : to call by JVM from anywhere 
 * static : without existing object also JVM has to call this method 
 * void: main() method won't return anything to JVM
 * main(): this is the name which configured inside JVM 
 * (String[] args): command line argument 
 * The above syntax is very strict and if we perform any change then we will get Run-time exception saying NoSuchMethodError:main
 */