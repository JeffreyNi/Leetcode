/*
  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows 
  like this: (you may want to display this pattern in a fixed font for better legibility)

  P   A   H   N
  A P L S I I G
  Y   I   R
  And then read line by line: "PAHNAPLSIIGYIR"
  Write the code that will take a string and make this conversion given a number of rows:

  string convert(string text, int nRows);
  convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
	String result = "";
	if (numRows == 1) {result = s;}
	else {
	    int len = s.length();
	    int num = 2 * numRows  - 2;
	    int iter_num = len / num + 1;
	    int left_num = len % num;
	    int pos;
	    for (int j = 0; j < numRows; j++) {
		for (int i = 0; i < iter_num; i++) {
		    pos = i * num + j;
		    if (pos < len) {result += s.charAt(pos);}
		    if (j > 0 && j < numRows - 1) {
			pos = (i + 1) * num - j;
			if (pos < len) {result += s.charAt(pos);}
 		    }
		}
	    }
	}
	return result;
    }

    public static void main(String args[]) {
	String s = "PAYPALISHIRING";
	System.out.println(convert(s, 3));
    }
}