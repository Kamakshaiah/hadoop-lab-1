package statistics; 

import java.util.*;

public class calculate implements arithmetic {

	public void add(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ennter a, b: "); 
	int a = sc.nextInt(); 
	int b = sc.nextInt();  
	int c = a+b; 
	System.out.println(c); 
	// return c; 
	}

	public void subtract(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ennter a, b: "); 
	int a = sc.nextInt(); 
	int b = sc.nextInt(); 
	int c = a-b;
	System.out.println(c); 
// 	return c; 
	}

	public void multi(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ennter a, b: "); 
	int a = sc.nextInt(); 
	int b = sc.nextInt(); 
	int c = a*b;
	System.out.println(c); 
// 	return c; 
	}

	public void divide(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ennter a, b: "); 
	int a = sc.nextInt(); 
	int b = sc.nextInt(); 
	int c = a/b;
	System.out.println(c); 
// 	return c; 
	} 

public static void main(String[] args){

//	int a = 3; int b= 4;
	calculate cal = new calculate();
	cal.add();
	cal.subtract(); 
	cal.multi();
	cal.divide();

	}
}
