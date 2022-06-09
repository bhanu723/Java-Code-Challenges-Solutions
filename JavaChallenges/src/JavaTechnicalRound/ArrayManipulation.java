package JavaTechnicalRound;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayManipulation {

	public static void main(String[] args) {

		String[] arr = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		String[] output = shortWeekDay(arr);
		
		for (String day : output) {
			System.out.println(day);
		}
		
	}

	private static String[] shortWeekDay(String[] arr) {
		
		String[] output = new String[arr.length];
		for (int i=0;i<arr.length;i++) {
			output[i]=arr[i].substring(0, 3);
		}
		
		return output;
				
	}

}
