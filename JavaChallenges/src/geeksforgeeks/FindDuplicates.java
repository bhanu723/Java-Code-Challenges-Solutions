package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] arr = { 10,5,6,10,2,4,2,6 };

		System.out.println(duplicates(arr, arr.length));
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {

		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		 Set<Integer> set = new HashSet<Integer>();
		 
		 for (Integer num : arr) {
			 if(!set.add(num)) {
				 if(!list.contains(num))
					 list.add(num);
//				 System.out.println(num);
			}
			
		 
		 }
		 
		 if(list.isEmpty())
		 {
			 list.add(-1);
			 return list;
		 }
		 
		 Collections.sort(list);
		 return list;
	    
}
}
