package DAA;
public class KnapsackDp {
	

   public static int knapsack(int[] weight,int value[],int W) {
		int n = weight.length;
		return knapsackdphelper(weight,value,W,n);
	}
	
	public static int knapsackdphelper(int weight[], int value[],int W,  int n) 
    { 
        int i, j; 
        int K[][] = new int[n+1][W+1]; 
       
     for (i = 0; i <= n; i++) 
     { 
         for (j = 0; j <= W; j++) 
         { 
             if (i==0 || j==0) 
                  K[i][j] = 0; 
             else if (weight[i-1] <= j) {
                   K[i][j] = Math.max(value[i-1] + K[i-1][j-weight[i-1]],  K[i-1][j]); 
             }
             else
                   K[i][j] = K[i-1][j]; 
         } 
      } 
       
      return K[n][W]; 
    }
	public static void main(String[] args) {
		
		{ 
	      int wt[] = new int[]{10, 3, 2, 5, 20}; 
	        int val[] = new int[]{5, 7, 1, 0, 8}; 
	        
	      int  W = 16; 
	     int n = 5; 
	     int ans = knapsack(wt, val, W);
	    System.out.println("Ans is : "+ans); 
	    } 
	}
}

		