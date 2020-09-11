package ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter 1st number:");
		int number1=sc.nextInt();
		System.out.println("enter 2nd number:");
		int number2=sc.nextInt();
		System.out.println("enter 3rd number:");
		int number3=sc.nextInt();
		
Average avg=new Average();
		System.out.println(avg.average(number1,number2,number3));
	}

}
