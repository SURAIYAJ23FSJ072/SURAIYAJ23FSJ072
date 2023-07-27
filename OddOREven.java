package gtjune;

import java.util.Scanner;

public class OddOREven {
	
		public static void main(String[] args)
		{
			int num;
			System.out.println("ENTER AN INTEGER NUMBER: ");
			//the number provided by use is stored in num
			Scanner input=new Scanner(System.in);
			num =input.nextInt();
			/*if number is divisible by 2 it is even number
			 * else odd number
			*/
			if (num % 2 == 0)
				System.out.println("ENTERED NUMBER IS EVEN ");
			else
			System.out.println("ENTERED NUMBER IS ODD ");
				
				
	}


}
