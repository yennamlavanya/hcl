package ques5;

import java.util.Scanner;

public class PrimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter he number:");
int number=input.nextInt();
PrimeFunction primefunction=new PrimeFunction();
primefunction.prime( number);
	}

}
