// this program prints 10 integers //

import java.util.*;

public class printIntegers {

	public static void main(String args[]){

	Scanner input = new Scanner(System.in);

	System.out.println("Input Integer: "); 

	int x = input.nextInt();

	for (int i=0; i<=x; i++){

		System.out.println("This is number: " + i);
		}

	}

}
