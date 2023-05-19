package prac;

import java.util.Scanner;

public class SalaryAndPercentageOfEmployee {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the salary amount");
	float salary=sc.nextFloat();
	
	float tax = (salary*12)/100;
	System.out.println("12% Tax on Employee Salary is :" +tax);
	
}
}
