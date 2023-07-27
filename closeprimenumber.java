package gtjune;

import java.util.Scanner;

public class closeprimenumber {
	public static void main(String[] args)
	{
		int temp;
			boolean a= true;
		Scanner scanner = new Scanner(System.in);
System.out.println("enter any number:");
//capture the input in an integer
int num = scanner.nextInt();
scanner.close();
for(int i=2;i<=num/2;i++)
{
	temp= num%i;
	if(temp==0)
	{
		a=false;
		break;
	
	}
}
// if a is true then the number is prime  else not
if(a)
	System.out.println(num+ " is a prime number");
else
	System.out.println(num+ " is not a prime number");
	}



}
