/************************************************************
 * 
 * Given an array of integers, find two numbers such that
 * they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers 
 * such that they add up to the target, where index1 must be
 * less than index2. Please note that your returned answer 
 * (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Example:
 * Input: numbers = {2, 7, 11, 15}, target = 9
 * Output: index1 = 1, index2 = 2
 *
 * @author: Jiafeng Ni
 *
 ************************************************************/

import java.util.*;

public class TwoSum {

    /**
     * HashMap, O(n) time, O(n) space.
     * key -> element in nums array, value -> index of the element
     *
     * Go through the array, if its pair number already exists, put
     * their indexes in the result and return. Otherwise put the new
     * number into the map and go to the next element in the array.
     *
     * Returns the 1 based indexes of two elements in an array which sum 
     * up to the target number.
     * @param nums the array to be searched
     * @param target the target number
     * @return an array containing indexes of the two elments 
     */
    public int[] twoSum (int[] nums, int target) {
	Map<Integer, Integer> numIndex = new HashMap<Integer, Integer>();
	int[] res = new int[2];
	
	for (int i = 0; i < nums.length; i++) {

	    int pair = target - nums[i];

	    if (numIndex.containsKey(pair)) {
		res[0] = numIndex.get(pair) + 1;
		res[1] = i + 1;
		return res;
	    }

	    numIndex.put(nums[i], i);
	}

	return null;
    }

}