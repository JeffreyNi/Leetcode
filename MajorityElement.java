/*
  Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

  You may assume that the array is non-empty and the majority element always exist in the array.
*/

import java.util.*;
import java.lang.*;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	int len = nums.length;
        
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) { 		
		map.put(nums[i], (Integer) (map.get(nums[i]) + 1));
                if (map.get(nums[i]) > len / 2) return nums[i];
            } else map.put(nums[i], (Integer) 1);
        }
        
        return nums[len - 1];
     
    }

    public static void main(String args[]) {
	int[] nums = {1, 2, 1, 2, 1};
	System.out.println(majorityElement(nums));
    }

}