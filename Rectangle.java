package gtjune;

import java.util.Scanner;

public class Rectangle {
public static void main(String[] args)
{
	Scanner lot = new Scanner(System.in);
	System.out.println("ENTER THE LENGTH OF RECTANGLE:");
	double length = lot.nextDouble();
	System.out.println("ENTER THE WIDTH OF RECTANGLE:");
	double width = lot.nextDouble();
	//Area = length*width;
double area = length*width;
System.out.println("AREA OF RECTANGLE IS : " +area);
	
}
}
