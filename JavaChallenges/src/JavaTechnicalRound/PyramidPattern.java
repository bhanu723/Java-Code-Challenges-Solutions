package JavaTechnicalRound;

/*
 * @Author: BhanuSurendra Deepala
 */
public class PyramidPattern {

	public static void main(String[] args) {

		printPyramid(10);

	}

	private static void printPyramid(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
