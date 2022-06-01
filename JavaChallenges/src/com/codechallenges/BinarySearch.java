package com.codechallenges;

public class BinarySearch {

	public static void main(String[] args) {

		int[] numbers = { 4, 5, 7, 8, 10, 11, 13, 16 }; // Prerequisite : Array must be in sorted order
		int target = 13;
		System.out.println(binarySearchRecursive(numbers, target));
		System.out.println(binarySearchNonRecursive(numbers, target));

	}

	private static int binarySearchNonRecursive(int[] numbers, int target) {

		return binarySearchNonRecursive(numbers, target, 0, numbers.length - 1);
	}

	private static int binarySearchNonRecursive(int[] numbers, int target, int start, int end) {

		while (start <= end) {
			int middle = (start + end) / 2;

			if (target == numbers[middle])
				return middle;

			if (target > numbers[middle])
				start = middle + 1;
			else
				end = middle - 1;
		}

		return -1;
	}

	private static int binarySearchRecursive(int[] numbers, int target) {

		return binarySearchRecursive(numbers, target, 0, numbers.length - 1);

	}

	private static int binarySearchRecursive(int[] numbers, int target, int start, int end) {

		int middle = (start + end) / 2;

		if (start > end)
			return -1;

		if (numbers[middle] == target) {
			return middle;
		}

		if (target > numbers[middle]) {
			return binarySearchRecursive(numbers, target, middle + 1, end);
		}

		return binarySearchRecursive(numbers, target, start, middle - 1);

	}

}
