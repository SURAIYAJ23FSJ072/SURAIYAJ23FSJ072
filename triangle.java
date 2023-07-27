package gtjune;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args)
	{
		Scanner ton = new Scanner(System.in);
		System.out.println("ENTER THE WIDTH OF THE TRIANGLE:");
		double base = ton.nextDouble();
		System.out.println("ENTER THE height OF THE TRIANGLE:");
		double height = ton.nextDouble();
		// area = width*height/2
double area = (base*height)/2;
System.out.println("AREA OF TRIANGLE IS:" +area);



	}
}
