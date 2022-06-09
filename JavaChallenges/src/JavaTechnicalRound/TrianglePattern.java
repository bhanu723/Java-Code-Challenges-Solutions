package JavaTechnicalRound;

/*
 * @Author: BhanuSurendra Deepala
 */
public class TrianglePattern {
	public static void main(String[] args) {
	
			printTriangle(10);
	
		}
	
		private static void printTriangle(int n) {
	
			int k=n;
			int x=1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= k-1; j++) {
					System.out.print(" ");
				}
				k--;
				for(int l=1;l<=x;l++) {
				System.out.print("*");
				}
				x+=2;
				System.out.println();
			}
		}
}

