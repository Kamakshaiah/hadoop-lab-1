// this program return average of input numbers //

import java.util.*;

public class printAvg {


public static void main(String args[]) {

Scanner input = new Scanner(System.in);

System.out.println("Input n: ");

int n = input.nextInt();

double sum = 0; 

for (int i=0; i<=n; i++){

	System.out.println("Input the number: "); 
	int x = input.nextInt(); 
	sum += x; 

	}

double avg = sum/n; 
System.out.println("The average is: " + avg); 
}
}
