package gtjune;

public class closedescending {
    public static void main(String[] args) {   
        int  arr[] = new int [] {9, 2, 8, 10, 1};     
        int temp = 0;
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
        System.out.println(" \narray length =" +arr.length );
    
            
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
            
        }
        System.out.println();    
          
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    

    	
    }

        }


}
