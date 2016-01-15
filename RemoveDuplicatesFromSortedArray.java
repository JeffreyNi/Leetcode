/*
  Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

  Do not allocate extra space for another array, you must do this in place with constant memory.

  For example,
  Given input array nums = [1,1,2],

  Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
*/

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
	int len = nums.length;
	if (len < 2) {return len;}
	
	int pos = 0;
	int cur = 1;

	while (cur < len) {
	    if (nums[pos] != nums[cur]) {
		pos++;
		nums[pos] = nums[cur];		
	    }
	    cur++;
	}

	return ++pos;
    }

    public static void main(String args[]) {
	int[] nums = {1,2,2,3,3,3,4};
	int num = removeDuplicates(nums);
	for (int i = 0; i < num; i++) {
	    System.out.println(nums[i]);
	}
    }
}