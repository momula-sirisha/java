package prac;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=a+b;
		int d=a*b;
		int e=a/b;
		int f=a%b;
		int g=a-b;
		
		
		System.out.println("Addition of two numbers:" +c);
		System.out.println("Subtraction of two numbers:" +g);
		System.out.println("Multiplication of two numbers:" +d);
		System.out.println("Division of two numbers:" +e);
		System.out.println(" Module Divison  of two numbers:" +f);
	
		
	}

}
