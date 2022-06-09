package JavaTechnicalRound;

import java.util.stream.IntStream;

public class StreamsSum {

	public static void main(String[] args) {

		System.out.println(IntStream.range(0, 100).reduce(0,(a,b)->a+b));
	}

}
