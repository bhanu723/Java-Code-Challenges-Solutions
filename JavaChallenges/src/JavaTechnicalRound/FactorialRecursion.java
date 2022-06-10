package JavaTechnicalRound;

public class FactorialRecursion {
	
	FactorialRecursion(){
		super();
	}

	public static void main(String[] args) {

		System.out.println(fact(5));
		System.out.println(fact(0));
		System.out.println(fact(1));
	}

	private static int fact(int n) {
		
		if(n<=1)
			return n;
		
		return n*fact(n-1);
	}

}
