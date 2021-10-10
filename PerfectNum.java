package com.bridgelabz;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
	
//		taking input from user to check no is perfect or not
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
//		checking conditions for perfect number
//		if sum of diviser of number is eqauls to number then it is perfect number
		int perfectNum = 0;
		for(int i =1;i<=num/2;i++) {
			if(num % i==0) {
			perfectNum +=i;
			System.out.println(perfectNum);
			}		
		}
		
//		checking number perfect or not
		if(perfectNum == num) {
			System.out.println(num + " is perfect Number");			
		}
		else {
			System.out.println(num +" is not perfect number");
		}
		input.close();
	}
}


