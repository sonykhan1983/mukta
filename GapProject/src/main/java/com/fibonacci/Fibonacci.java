package com.fibonacci;

import java.util.Scanner;
//Fibonacci method
public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,c=1;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the value");
		int input = sc.nextInt();
		System.out.println("1");
		while (a<=input) {
			a=b+c;
			if(a>=input)
			break;
			System.out.println(a);
			b=c;
			c=a;
			
		}
	}
}
