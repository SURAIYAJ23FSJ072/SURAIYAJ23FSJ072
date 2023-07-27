package gtjune;

import java.util.Scanner;

public class Square {
	public static void main(String[] args)

	{
		System.out.println("enter side of SQUARE:");
		//Capture the user's input
		Scanner dot = new Scanner(System.in);
		// storing the captured value in a variable
		double side = dot.nextDouble();
		double area = side*side;
		System.out.println("AREA OF SQUARE IS:" +area);

	}
}
