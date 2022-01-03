// demo for computing average through array //

import java.util.*;

public class avgThroughArr {

	public static void main(String args[]){

	int n, i, sum=0, am; 
	
	
	Scanner sc = new Scanner(System.in);

	System.out.println("How many numbers you want to Enter: ");
	
	n = sc.nextInt(); 

	int arr[] = new int[n];
	
	System.out.println("Enter" + n + "Numbers");	

	for (i=0; i<n; i++){
		arr[i] = sc.nextInt();
		sum += arr[i];
		}
	am = sum/n;
	
	System.out.println("Arithmetic Mean: " + am);
	System.out.println("The input vector: "); 

	for (i=0; i<n; i++){

	System.out.println(arr[i]);
	}	
	}


}
