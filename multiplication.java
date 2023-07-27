package gtjune;

import java.util.Scanner;

public class multiplication {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER VALUE FOR i...:");
		int i=scan.nextInt();
		System.out.println("ENTER VALUE FOR j...:");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("THE MULTIPLICATION OF i and j IS...:" +mul);
	}

}
