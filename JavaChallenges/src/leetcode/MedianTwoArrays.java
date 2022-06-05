package leetcode;

import java.util.Arrays;

/*
 * @Author: BhanuSurendra Deepala
 */
public class MedianTwoArrays {

	public static void main(String[] args) {
		int[] nums1= {};
		int[] nums2= {};
		
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}

public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	
	if(nums1.length==0 && nums2.length==0)
		return 0.0; // if the both arrays are empty
	
	int l = nums1.length+nums2.length;// need merged array length
	int[] mergedArr= new int[l]; // define size of merged array
	
	//merge both arrays using arraycopy method
	System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
	System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);
	
	Arrays.sort(mergedArr); // Again sort the array to get median
	
	int middle = mergedArr.length/2;//find the middle index of merged array
	
	if(mergedArr.length%2==1) 
		return mergedArr[middle]; //If there are odd number of elements then the middle number is the median
	
	return (mergedArr[middle]+mergedArr[middle-1])/2.0; // If there are even number of elements then avg of middle 2 elemnts is the median
        
    }
}
