package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14;
		
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		
		System.out.println("구의 부피는 : " + (((double)4/(double)3)*pi*radius*radius*radius));
		
		sc.close();
	}
}
