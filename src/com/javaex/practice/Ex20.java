package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int C_500won = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int C_100won = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int C_50won = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int C_10won = sc.nextInt();
		
		System.out.println("동전의 총합은 " + ((C_500won*500)+(C_100won*100)+(C_50won*50)+(C_10won*10)) + " 원 입니다.");
		
		sc.close();
		
	}
}
