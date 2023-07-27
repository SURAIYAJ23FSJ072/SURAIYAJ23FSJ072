package gtjune;

import java.util.Scanner;

public class printaninteger {
public static void main(String[] args)
{
	Scanner reader= new Scanner(System.in);
	System.out.println("enter a number");
	// nextInt() reads the next integer from the keyboard
	int number = reader.nextInt();
	System.out.println("YOU ENTERED:" +number);
}
}
