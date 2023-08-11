package gtjune;

public class closereversearrayelement {
	   public static void main(String args[])
	   {

	     int arr[] = {10, 20, 30, 40, 50};
	     System.out.println("Original array: ");  
	        for (int j = 0; j < arr.length; j++) {  
	            System.out.print(arr[j] + " ");  
	        }  
		     System.out.println("\n reversed array: ");  

	     int n=arr.length;
	     for(int i=n-1; i>=0; i--)
	       System.out.print(arr[i]+" "); 
	    }	   
}
