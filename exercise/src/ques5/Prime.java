package ques5;

import java.util.Scanner;

// printing prime number from 2 to 20
public class Prime {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the number ");
		int number=input.nextInt();
	//	int count=0;
		for (int i = 2; i < number+1; i++) {
			int count=0;
			for (int j = 1; j < number+1; j++) {
				if(i%j==0)
				{
					count++;
				}
				
			}
		
		if(count==2)
			System.out.println(i+"is prime number");
		//else 
			//System.out.println(i+"is not prime number");
	}}

}
