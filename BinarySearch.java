package DAA;
public class BinarySearch {

	static int Binary(int arr[],int val) {
		int l =0;
		int r = arr.length-1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(val==arr[mid]) {
				return mid;
			}
			if(val<arr[mid]) {
				r = mid -1;
			}
			else{
				l = mid+1;
			}
		}
		return -1;
	}
   public static void main (String[] args) {
	   int arr[] = {2,3,4,78,93,56};
	   System.out.println(Binary(arr,4));
	}
}
