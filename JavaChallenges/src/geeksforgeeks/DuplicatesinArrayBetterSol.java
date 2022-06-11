package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesinArrayBetterSol {

	public static void main(String[] args) {

		int[] arr = { 10, 3, 4, 10, 5, 3, 0, 0,10 };
		List<Integer> output = findDups(arr);
		for (Integer num : output) {
			System.out.println(num);
		}
	}

	private static List<Integer> findDups(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();

		ArrayList<Integer> resultList = new ArrayList<Integer>();

		Arrays.sort(arr); // solution require sorted list of elements
		int duplicateFlag =-1; // if there are repeated elements then duplicates need not be stored in output list
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i]) && duplicateFlag !=arr[i]) {
					resultList.add(arr[i]);
					duplicateFlag=arr[i];
			}
		}
		if(resultList.size()==0)
			resultList.add(-1);

		return resultList;
	}

}
