
package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class CountPairsArray {

	public static void main(String[] args) {
		
		int[] arr= {1, 1, 1, 1};
		int n=arr.length;
		int k=2;
		System.out.println(getPairsCount(arr,n,k));
	}
	
	 public static int getPairsCount(int[] arr, int n, int k) {
		 
			/*
			 * int counter=0; for(int i=0;i<arr.length;i++) { for(int
			 * j=i+1;j<arr.length;j++) { if(arr[i]+arr[j]==k) counter++; } } return counter;
			 */
		 
		       Map<Integer,Integer> map = new HashMap<Integer,Integer> ();
		       int count = 0;
		       for(int i=0;i<n;++i)
		       {
		           if(map.containsKey(k-arr[i]))
		               count+=map.get(k-arr[i]);
		           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		       }
		       return count;
	    }

}
