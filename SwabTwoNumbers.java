package gtjune;

public class SwabTwoNumbers {
public static void main(String[] args)
{
	float first = 4.50f, second = 8.50f;
	System.out.println("--Before swab--");
	System.out.println(" first number = " +first);
	System.out.println(" second number = " +second);
	// value is swabbed using a temporary 
	float temporary = first;
	first = second ;
	second = temporary;
	System.out.println("--After swab--");
	System.out.println(" first number = " +first);
	System.out.println(" second number = " +second);
	
}
}
