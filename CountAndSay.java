// The description of this problem is kind of vague. REDO it!

/*
  The count-and-say sequence is the sequence of integers beginning as follows:
  1, 11, 21, 1211, 111221, ...

  1 is read off as "one 1" or 11.
  11 is read off as "two 1s" or 21.
  21 is read off as "one 2, then one 1" or 1211.
  Given an integer n, generate the nth sequence.

  Note: The sequence of integers will be represented as a string.
*/

import java.lang.Integer;

public class CountAndSay {

    public static String countAndSay(int n) {
	if (n < 1) {return null;}

	String result = "1";
	while (n > 1) {
	    result = countString(result);
	    n--;
	}

	return result;
    }

    public static String countString(String s) {
	int len = s.length();
	if (len == 0) {return s;}
	
	String result = "";
	int count = 0;
	int pos = 0;
	char cur = s.charAt(pos);

	while (pos < len) {
	    while (pos < len && s.charAt(pos) == cur) { pos++; count++; }
	    result += count + "" + cur;
	    if (pos < len) {count = 0; cur = s.charAt(pos);}
	}
	
	return result;
    }

    public static void main(String args[]) {
	System.out.println(countAndSay(Integer.parseInt(args[0])));
    }
}