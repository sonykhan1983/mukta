package com.reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input data into the Console");
		int n = sc.nextInt();
		int a[] =new int[n];
		System.out.println("read the element into the array");
		for(int i = 0;i<n;i++) {
			a[i]=sc.nextInt();
		}
System.out.println("printing reverse element from the array");
for(int i = a.length-1;i>=0;i--) {
	System.out.println(a[i]);
}
}
}