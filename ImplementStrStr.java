/*
  Implement strStr().

  Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

  Update (2014-11-02):
  The signature of the function had been updated to return the index instead of the pointer. 
  If you still see your function signature returns a char * or String, please click the 
  reload button  to reset your code definition.
*/

public class ImplementStrStr {
    
    public static int strStr(String haystack, String needle) {
	int len1 = haystack.length();
	int len2 = needle.length();
	if (len1 < len2) {return -1;}

	int m = 0;
	int i = 0;
	while (m + len2 <= len1) {
	    i = 0;
	    while (i < len2 && haystack.charAt(m + i) == needle.charAt(i)) {i++;}
	    if (i == len2) break;
	    else m++;
	}
	
	if (i == len2) return m;
	return -1;
    }
    
    public static void main(String args[]) {
	
    }
}