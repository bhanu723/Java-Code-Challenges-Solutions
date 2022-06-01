package interviewcodechallenges;

import java.util.Map;
import java.util.stream.Collectors;

/*
 * @Author: BhanuSurendra Deepala
 */
public class FindingStateCapital {

	public static void main(String[] args) {

		Map<String, String> stateMap = Map.of("Telangana", "Hyderabad", "Karnataka", "Bangalore", "Tamilnadu",
				"Chennai");
		String state = "TAMILnadu";
		System.out.println(findCapital(stateMap, state));
	}

	// Function to find the capital city of given state
	private static String findCapital(Map<String, String> stateMap, String state) {
		
		if(!(state==null) && !state.trim().isEmpty()) //condition to handle blank, empty spaces or null inputs
			return stateMap.entrySet().stream().filter(e -> e.getKey().equalsIgnoreCase(state)).map(e -> e.getValue()).collect(Collectors.toList()).get(0);
	return "Given String is either Null or Empty";
	}
}
