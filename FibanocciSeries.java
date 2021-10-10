package com.bridgelabz;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		
//		taking input from user
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
//		fibacinno series is nothin but series of numbers like 0 1 1 2 3 5....initial 2 numbers will be 0 &1 next will be sum of previous two numbers
		
		int a = 0;
		int b = 1;
		int i = 2;
		while(i<=num) {
			int c=a+b;
				a=b;
				b=c;
				System.out.println(c);
				i+=1;
		}
		input.close();
	}
}
