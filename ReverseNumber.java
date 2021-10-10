package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	
//    	taking user input
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the number:  ");
    	
    	int num = input.nextInt();
        
    	int ans = 0;

//    	getting remainder with module 
        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
        input.close();
    }
}