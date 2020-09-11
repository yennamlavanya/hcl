package ques5;

public class PrimeFunction {
void prime(int number) {
	 for(int i=1;i<number+1;i++) {
		 int count=0;
		 for(int j=1;j<number+1;j++) {
			 if(i%j==0) {
				 count++;
			 }
		System.out.println(i); 
		 }
	 }
//	return 0;
	 
 }
}
