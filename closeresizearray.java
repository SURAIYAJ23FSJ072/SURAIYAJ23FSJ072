package gtjune;

public class closeresizearray {
	public static void main(String[] args) 
	{
	int[] numberArray = { 5, 5, 6, 45,8 };
	System.out.println("Array before ReSize: ");
	for (int i = 0; i < numberArray.length; i++) {
	System.out.println(numberArray[i]);
	}
	int[] temp = new int[10];
	int length = numberArray.length;
	for (int j = 0; j < length; j++) {
	temp[j] = numberArray[j];
	}
	numberArray = temp;
	System.out.println("Array after ReSize: ");
	for (int i = 0; i < numberArray.length; i++) {
	System.out.println(numberArray[i]);
	}
	}


}
