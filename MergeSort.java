package DAA;

import java.util.Scanner;

public class MergeSort {
	    
	    public static int[] merge(int input[],int arr1[], int arr2[]){
			
	        int m = arr1.length;
	        int n = arr2.length;
	        int i = 0;
	        int j = 0;
	        int k = 0;
	            while(i<m && j<n){
	                if(arr1[i]<arr2[j]){
	                    input[k]=arr1[i];
	                    i++;
	                     k++;  
	                }  
	                else{    
	                    input[k]=arr2[j];
	                    j++;
	                    k++;
	                }  
	                }
	                while(i<m){
	                    input[k]=arr1[i];
	                    i++;
	                    k++;
	                }  
	                while(j<n){
	                    input[k]=arr2[j];
	                    j++;
	                    k++;
	                }
	        return input;
	    }  
		public static void mergeSort(int[] input){ 
	        if(input.length<=1){
	           return;
	        }
	        int[] arrLeft=new int[input.length/2];
	        int[] arrRight=new int[input.length-(input.length/2)];
	        
	        for(int i=0;i<arrLeft.length;i++){
	            arrLeft[i]=input[i];
	        }
	        for(int j=0;j<arrRight.length;j++){
	            arrRight[j]=input[(input.length/2)+j]; 
	        }
	        
	        mergeSort(arrLeft);
	        mergeSort(arrRight);
	        
	        merge(input,arrLeft,arrRight);
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
		 mergeSort(arr);
		 for(int i =0; i<n;i++) {
			 System.out.print(arr[i]+ " ");
		 }	 
	}
}
