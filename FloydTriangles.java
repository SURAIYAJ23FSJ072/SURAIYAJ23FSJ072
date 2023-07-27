package gtjune;

import java.util.Scanner;

public class FloydTriangles {
	public static void main(String[] args)
	{
		int rows, number= 1,counter,j;
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ROWS FOR FLOYD'S TRIANGLES");
	//copying user input into an integer variable named rows
		rows=input.nextInt();
		System.out.println("FLOYD'S TRIANGLE");
		System.out.println("****************");
		for(counter = 1; counter<=rows;counter++)
		{
			for(j=1;j<=counter;j++)
			{
				System.out.println(number+ " ");
				//incrementing the number value
				number++;
			}
			//for new line
			System.out.println();
		}
	}

}
