package leetcode;

/*
 * @Author: BhanuSurendra Deepala
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		System.out.println(missingNumber(num));
		System.out.println(missingNoGfG(num, num.length));
	}

	private static int missingNumber(int[] num) {

		int x = IntStream.range(0, num.length + 1).reduce(0, (a, b) -> a ^ b);
		return Arrays.stream(num).reduce(x, (a, b) -> a ^ b);

	}

	private static int missingNoGfG(int[] array, int n) {
		int sum = (n * (n + 1)) / 2;
		return sum-Arrays.stream(array).reduce(0, (a, b) -> a + b);

	}

}
