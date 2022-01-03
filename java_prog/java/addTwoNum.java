// demo for Scanner //

import java.util.*;

public class addTwoNum {

	public static void main(String args[]){

		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
	
		a = sc.nextInt();
		b = sc.nextInt();
		
		sum = a+b; 
		System.out.println("The sum is: " + sum);		
	}


}
