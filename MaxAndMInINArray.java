package DAA;

public class MaxAndMInINArray {
	static class Pair {   
        int min; 
        int max; 
    } 
    static Pair getMinMax(int arr[], int start, int end) { 
        Pair minmax = new Pair(); 
        Pair mml = new Pair(); 
        Pair mmr = new Pair(); 
        int mid; 
  
        if (start == end) { 
            minmax.max = arr[start]; 
            minmax.min = arr[start]; 
            return minmax; 
        } 
  
       
        if (end == start + 1) { 
            if (arr[start] > arr[end]) { 
                minmax.max = arr[start]; 
                minmax.min = arr[end]; 
            } else { 
                minmax.max = arr[end]; 
                minmax.min = arr[start]; 
            } 
            return minmax; 
        } 
  
        mid = (start + end) / 2; 
        mml = getMinMax(arr, start, mid); 
        mmr = getMinMax(arr, mid + 1, end); 
  
        if (mml.min < mmr.min) { 
            minmax.min = mml.min; 
        } else { 
            minmax.min = mmr.min; 
        } 
  
        if (mml.max > mmr.max) { 
            minmax.max = mml.max; 
        } else { 
            minmax.max = mmr.max; 
        } 
  
        return minmax; 
    } 
  
    public static void main(String args[]) { 
        int arr[] = {5,3,2,1,15,11}; 
        int n = 6; 
        Pair minmax = getMinMax(arr, 0, n - 1); 
        System.out.printf("\nMinimum  is %d", minmax.min); 
        System.out.printf("\nMaximum is %d", minmax.max); 
  
    } 
} 

