// variance demo //

import java.util.*; 

public class variance {

	public static void main(String args[]){

	double sum=0, sum1=0; 
	double sumSq=0, var, avg; 

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input length: "); 
	int n = sc.nextInt(); 
	
	// initialize the array
	double arr[] = new double[n];


	// mean 

	for (int i=0; i<n; i++){
		arr[i] = sc.nextDouble();
		sum += arr[i];	
		}

	avg = sum/n;
	// variance
	
	double arr1[] = new double[n];

	for (int i=0; i<n; i++) {
		arr1[i] = arr[i]-avg; 
		sum1 += arr1[i]; 
		sumSq = sum1*sum1; 
		}
	var = sumSq/n; 
	

	// get the output 

	System.out.println("Average is: " + avg);
	System.out.println("Variance is: " + var);
	}
	

}
