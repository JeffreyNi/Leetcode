/*
  Given an array and a value, remove all instances of that value in place and return the new length.

  The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
	if (nums.length == 0) {return 0;}

	int i = 0;
	int j = 0;
	while (j < nums.length) {
	    if (nums[j] != val) {
		nums[i] = nums[j];
		i++;
	    }
	    j++;
	}
	return i;
    }

    public static void main(String args[]) {

    }
}