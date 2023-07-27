package gtjune;

import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		/*we are storing the entered radius in double
		 * so that use can enter radius in decimals
		 */
		double radius = scanner.nextDouble();
		// area = PI*radius*radius
		double area = Math.PI*(radius*radius);
		System.out.println("THE AREA OF CIRCLE IS:" +area);
		// circumference = 2*PI*radius;
		double circumference = Math.PI*2*radius;
		System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS:"+circumference);


		


	}

}
