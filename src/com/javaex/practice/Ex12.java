package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.print("반지름을 입력하세요 : ");
		double hd = sc.nextDouble();
		
		System.out.println("원의 넓이는 " + (pi * hd * hd));
		
		
		sc.close();
	}
}
