package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * @Author : BhanuSurendra Deepala
 */
public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int result[]=twoSum(nums, target);
		for(int i: result)
			System.out.println(i);
	}

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		int[] result= new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i]))
			{ 
				result[0]=i;
				result[1]=map.get(target-nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		
		
		return result;

	}

}
