package DAA;

import java.util.Arrays; 
import java.util.Comparator;
import java.util.Scanner; 

public class FractionalKnapsack 
{ 
	
	public static void main(String[] args) 
	{ 
		Scanner s = new Scanner(System.in);
		
		int wt[] = null;
		int val[] = null;
	    double ans[] = null;
	
		int t = s.nextInt();
		int n = s.nextInt();
		ans = new double[t];
		for(int j = 0;j<t;j++) {
			
		 wt = new int[n];
		 val = new int[n];
		
		for(int i = 0;i<n;i++) {
			wt[i] = s.nextInt();
		}

		for(int i = 0;i<n;i++) {
		val[i] = s.nextInt();
		}
		int capacity = s.nextInt();
		
		ans[j]= getMaxValue(wt,val,capacity);
		}
		for(int k =0;k<t;k++) {
		
		System.out.println("Maximum value obtained = "+ans[k]);
		}
	}

	static double getMaxValue(int[] wt, int[] val, int capacity) 
	{ 
		ItemValue[] iVal = new ItemValue[wt.length]; 

		for(int i = 0; i < wt.length; i++) 
		{ 
			iVal[i] = new ItemValue(wt[i], val[i], i); 
		} 

		Arrays.sort(iVal, new Comparator<ItemValue>() 
		{ 
			@Override
			public int compare(ItemValue o1, ItemValue o2) 
			{ 
				return o2.cost.compareTo(o1.cost) ; 
			} 
		}); 


		double totalValue = 0d; 

		for(ItemValue i: iVal) 
		{ 

			int curWt = (int) i.wt; 
			int curVal = (int) i.val; 

			if (capacity - curWt >= 0) 
			{ 
				capacity = capacity-curWt; 
				totalValue += curVal; 

			} 
			else
			{ 
				
				double fraction = ((double)capacity/(double)curWt); 
				totalValue += (curVal*fraction); 
				capacity = (int)(capacity - (curWt*fraction)); 
				break; 
			} 


		} 

		return totalValue; 
	} 

	static class ItemValue 
	{ 
		Double cost; 
		double wt, val, ind; 
		
		public ItemValue(int wt, int val, int ind) 
		{ 
			this.wt = wt; 
			this.val = val; 
			this.ind = ind; 
			cost = (double) (val/wt ); 
		} 
	} 
} 
