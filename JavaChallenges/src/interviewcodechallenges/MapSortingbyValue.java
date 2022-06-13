/*
 **
 *@author : BhanuSurendra Deepala 
 *
 */

package interviewcodechallenges;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapSortingbyValue {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Bhanu",10);
		map.put("Surendra",0);
		map.put("Surekha",12);
		map.put("Srikshi",1);
//		System.out.println(map);
		sortMapbyValues(map);
		
	}

	private static void sortMapbyValues(Map<String, Integer> map) {
		
		map.entrySet().stream().sorted((o1,o2)->o1.getValue()-o2.getValue()).collect(Collectors.toMap(null, null));
		
	}

}
