import java.util.Scanner; 

public class AddInputs {
	public static void main(String[] args) {
	
	int n1, n2, res; 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input fist number: ");
	n1 = sc.nextInt(); 		
	
	System.out.println("Input second number: ");
	n2 = sc.nextInt(); 		
	res = n1 + n2; 
	
	System.out.println("Result is: " + res);
	
	}

}
