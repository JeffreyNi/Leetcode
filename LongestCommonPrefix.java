/*
  Write a function to find the longest common prefix string amongst an array of strings.
*/

public class LongestCommonPrefix {
    
    /*    public static String longestCommonPrefix(String[] strs) {
	int len = strs.length;
	if (len == 0) {return "";}
	if (len == 1) {return strs[0];}
	
	int small_num = 0;
	int small_len = strs[0].length();
	// find the smallest string in the array
	for (int i = 1; i < len; i++) {
	    if (small_len > strs[i].length()) {
		small_num = i; 
		small_len = strs[i].length();
	    }	    
	}

	int pos = 0;
	boolean equal = true;
	while (pos < small_len && equal) {
	    int i = 0;
	    char curChar = strs[small_num].charAt(pos);
	    while (i < len && equal) {
		if (curChar != strs[i].charAt(pos)) {equal = false;}
		else i++;
	    }
	    pos++;
	}
	
	if (equal) {return strs[small_num];}
	else return strs[small_num].substring(0, pos - 1);

	}
*/

    public static String longestCommonPrefix(String[] strs) {
	int len = strs.length;
	if (len == 0) {return "";}
	if (len == 1) {return strs[0];}
	
	int prefix_len;
	for (prefix_len = 0; prefix_len < strs[0].length(); prefix_len ++) {
	    char currChar = strs[0].charAt(prefix_len);
	    for (int i = 1; i < len; i++) {
		if (strs[i].length() <= prefix_len || strs[i].charAt(prefix_len) != currChar) {return strs[i].substring(0, prefix_len);}
	    }
	}

	return strs[0].substring(0, prefix_len);
    }

    public static void main(String args[]) {
	String[] strs = {"124", "123"};
	System.out.println(longestCommonPrefix(strs));
    }
}