/*
  Given a roman numeral, convert it to an integer.

  Input is guaranteed to be within the range from 1 to 3999.
*/

public class RomanToInteger {

    public static int romanToInt(String s) {
	int result = 0;
	int len = s.length();
	int i = 1;

	while (i <= len) {
	    char curChar = s.charAt(len - i);
	    if (curChar == 'I') {
		if (i > 1 && (s.charAt(len + 1 - i) == 'V' || s.charAt(len + 1 - i) == 'X')) { result--;}
		else {result++;}
	    }

	    if (curChar == 'V') {result += 5;}

	    if (curChar == 'X') {
		if (i > 1 && (s.charAt(len + 1 - i) == 'L' || s.charAt(len + 1 - i) == 'C')) { result -= 10; }
		else result += 10;
	    }

	    if (curChar == 'L') {result += 50;}

	    if (curChar == 'C') {
		if (i > 1 && (s.charAt(len + 1 - i) == 'D' || s.charAt(len + 1 - i) == 'M')) { result -= 100; }
		else result += 100;
	    }

	    if (curChar == 'D') {result += 500;}
	    if (curChar == 'M') {result += 1000;}

	    i++;
	}

	return result;
    }

    public static void main (String args[]) {
	System.out.println(romanToInt("X"));
    }

}