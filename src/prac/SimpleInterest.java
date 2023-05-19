package prac;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principal amount");
	float pa=sc.nextFloat();
	System.out.println("Enter rate of interest");
	float r= sc.nextFloat();
	System.out.println("Enter Number of Years");
	float t =sc.nextFloat();
	
	float totalAmount = pa*r/100*t;
	System.out.println("The simple interest is :" +totalAmount);
	
}
}
