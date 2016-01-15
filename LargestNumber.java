import java.util.*;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
	binarySort(nums, 0, nums.length - 1);
        
        String res = "";
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        
        return res;
    }

    private static void binarySort(int[] nums, int start, int end) {
        if (start == end) {return;}
        
        int mid = (start + end) / 2;

	System.out.print("before:");

	for (int i = start; i <= end; i++) {
	    System.out.print(nums[i]);
	}

	System.out.println("");
	
        binarySort(nums, start, mid);
        binarySort(nums, mid + 1, end);
        
        merge(nums, start, mid, mid + 1, end);

	System.out.print("after:");

	for (int i = start; i <= end; i++) {
	    System.out.print(nums[i]);
	}

	System.out.println("");
    }
    
    private static void merge(int[] nums, int ls, int le, int rs, int re) {
	List<Integer> tmp = new ArrayList<Integer>();

	System.out.print("merge before:");		
	for (int i = ls; i <= re; i++) {
	    System.out.print(nums[i]);
	}
	System.out.println("");

	System.out.println("1indexes: ls: " + ls + " le: " + le + " rs: " + rs + " re: " + re);

        while (ls <= le && rs <= re) {
            String s1 = nums[ls] + "" + nums[rs];
            String s2 = nums[rs] + "" + nums[ls];
            if (s1.compareTo(s2) > 0) {		
                tmp.add(nums[ls]);
                ls++;
            } else {
                tmp.add(nums[rs]);
                rs++;
            }
        }

	System.out.println("2indexes: ls: " + ls + " le: " + le + " rs: " + rs + " re: " + re);	
        
        if (rs > re) {
	    while (ls <= le) {
                tmp.add(nums[ls]);
		ls++;
            }
        }

	System.out.println("3indexes: ls: " + ls + " le: " + le + " rs: " + rs + " re: " + re);

        if (ls > le) {
	    while (rs <= le) {
                tmp.add(nums[rs]);
		rs++;
            }
        }

	System.out.println("4indexes: ls: " + ls + " le: " + le + " rs: " + rs + " re: " + re);
        
        for (int i = ls; i <= re; i++) {
            nums[i] = tmp.get(i - ls);
        }

	System.out.print("merge after:");	
	for (int i = ls; i <= re; i++) {
	    System.out.print(nums[i]);
	}
	System.out.println("");
    }


    public static void main(String args[]) {
	int[] nums = {1,2,3,1};
	String res = largestNumber(nums);

	for (int i = 0; i < nums.length; i++) {
	    System.out.print(nums[i] + "");
	}
	System.out.println(" ");

	System.out.println(res);
    }
}