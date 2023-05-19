package prac;

import java.util.Scanner;

public class AreaOfCircleAndRectangle {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the radius value of Circle");
	int r = sc.nextInt();
	int formula1 = 22/7 *r^2;
	System.out.println("Area of Circle is :" +formula1);
	
	
	
	System.out.println("Enter the length and breadth value of Recatngle");
	int l = sc.nextInt();
	int w = sc.nextInt();
	int formula2 = l*w;
	System.out.println("Area of Rectangle is :" +formula2);
	
	
	System.out.println("Enter the height and base value of Triangle");
	int h = sc.nextInt();
	int b = sc.nextInt();
	int formula3 = h*b/2;
	System.out.println("Area of Triangle is :" +formula3);
	
	
}
}
