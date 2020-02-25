package DAA;
public class Knapsack {
	
 public static int knapsack(int[] weight,int value[],int maxWeight, int n)
 {
         n=weight.length;
	     return knapsackHelper(weight,value,maxWeight,n,0);
	}
 
	private static int knapsackHelper(int[] weight, int[] value, int maxWeight,int n, int i) {
		
        n=weight.length;
		if(i==weight.length||maxWeight==0) {
			return 0;
		}
		
		if(weight[i]>maxWeight) {
			return knapsackHelper(weight,value,maxWeight,n,i+1);
		}else {
			int op1 = value[i]+knapsackHelper(weight,value,maxWeight-weight[i],n,i+1);
			int op2 = knapsackHelper(weight,value,maxWeight,n,i+1);
			return Math.max(op1,op2);
		}
	
}
	public static void main(String args[]) 
	   { 
	        int wt[] = new int[]{10, 3, 2, 5, 20}; 
	        int val[] = new int[]{5, 7, 1, 0, 8}; 
	        
	      int  W = 16; 
	     int n = 5; 
	     int ans = knapsack(wt, val, W, n);
	    System.out.println("Ans is:"+ans); 
	    } 
}
