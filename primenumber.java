package gtjune;

public class primenumber {
	public static void main(String[] args)

	{
		int i = 0;
		int num = 0;
		// empty string
		String primeNumbers = "";
		for(i=1;i<=100;i++)
		{
			int counter = 0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter= counter+1;
				}
			}
			if(counter ==2)

		{
				// append prime numbers to the string
				primeNumbers =primeNumbers+ i+ " ";
						}
		}
	System.out.println("PRIME NUMBERS FROM 1 TO 100 ARE:");
	System.out.println(primeNumbers);
	}
}
