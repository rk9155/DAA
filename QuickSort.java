package DAA;

import java.util.Scanner;

public class QuickSort {
	 public static int partition(int arr[], int start, int end) 
	    { 
	        int pivot = arr[end];  
	        int i = (start-1); 
	        for (int j=start; j<end; j++) 
	        { 
	            
	            if (arr[j] <= pivot) 
	            { 
	                i++; 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[end]; 
	        arr[end] = temp; 
	  
	        return i+1; 
	    } 
	  
	  
	    
	    public static void sort(int arr[], int start, int end) 
	    { 
	        if (start < end) 
	        { 
	        
	            int pi = partition(arr, start, end); 
	  
	            
	            sort(arr, start, pi-1); 
	            sort(arr, pi+1, end); 
	        } 
	    } 
		
		public static void quickSort(int[] input) {
			
			sort(input,0,(input.length-1));
		}
		

  public static void main(String[] args) {
	 
	      Scanner sc = new Scanner(System.in) ;
		 System.out.println("enter the size of array");
		 int n = sc.nextInt();
		 System.out.println("enter the array->");
		 int arr[] = new int[n];
		 for(int i =0; i<n;i++) {
			 arr[i]=sc.nextInt();
		 }

	  quickSort(arr);
	  for(int i =0; i<arr.length;i++) {
		  System.out.print(arr[i]+ " ");
	  }
  }
}
