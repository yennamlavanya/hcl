package ques4;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st :");
		int number1=sc.nextInt();
		System.out.println("enter 2nd");
		int number2=sc.nextInt();
	 number1=number1+number2;
	number2=number1-number2;
	number1=number1-number2;
	System.out.println("Swapping of two numbers");
	System.out.println("first number is :"+number1);
	System.out.println("second number is :"+number2);
	}
}
