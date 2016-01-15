/*
  Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

  If the last word does not exist, return 0.

  Note: A word is defined as a character sequence consists of non-space characters only.

  For example, 
  Given s = "Hello World",
  return 5.
*/

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
	int len = s.length();
	int end = len - 1;
	
	while (end >= 0 && s.charAt(end) == ' ') {end--;}

	if (end < 0) {return 0;}
	
	int start = end - 1;
	while (start >=0 && s.charAt(start) != ' ') {start--;}
	
	return end - start;
    }

    public static void main (String args[]) {
	System.out.println(lengthOfLastWord(args[0]));
    }

}