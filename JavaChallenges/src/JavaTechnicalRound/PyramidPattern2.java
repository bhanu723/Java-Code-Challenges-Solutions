package JavaTechnicalRound;

public class PyramidPattern2 {

	public static void main(String[] args) {

		printPyramid(10);

	}

	private static void printPyramid(int n) {
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			k+=2;
			System.out.println();
		}
	}

}
