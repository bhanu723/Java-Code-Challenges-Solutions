package geeksforgeeks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/*
 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
 */
public class FindMissingNRepeat {

	public static void main(String[] args) {

		int n = 2;
		int arr[] = { 2, 2 };
		int result[] = new int[2];
		result = findTwoElement(arr, n);
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

	private static int[] findTwoElement(int arr[], int n) {
		// code here

		/*
		 * int sum = (n * (n + 1)) / 2; 
		 * return sum-Arrays.stream(array).reduce(0, (a, b)-> a + b);
		 * 
		 */

		int[] result = new int[2];
		Arrays.sort(arr);
		int sum = 0, j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				result[0] = arr[i];// repeated number found
				arr[i + 1] = 0;
				break;
			}

		}
		for (int i = 0; i < n; i++) {
			sum ^= i ^ arr[i]; // A XOR B XOR A = B
		}

		result[1] = sum ^ n;

		return result;
	}

}
