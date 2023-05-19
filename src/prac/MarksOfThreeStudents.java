package prac;

import java.util.Scanner;

public class MarksOfThreeStudents {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first subject marks");
	float sub1=sc.nextFloat();
	
	System.out.println("Enter second subject marks");
	float sub2=sc.nextFloat();
	
	System.out.println("Enter third subject marks");
	float sub3=sc.nextFloat();
	
	float total = sub1+sub2+sub3;
	System.out.println("Total marks of three subjects are:" +total);
	
	float percentage = (total/300) *100;
	System.out.println("The total percentage is calculated as :" +percentage);
	
}
}
