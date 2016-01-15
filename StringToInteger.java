// too many cases to consider, and the description too vague

/*
  Implement atoi to convert a string to an integer.

  Hint: Carefully consider all possible input cases. If you want a challenge, 
  please do not see below and ask yourself what are the possible input cases.

  Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
  You are responsible to gather all the input requirements up front.

  Update (2015-02-10):
  The signature of the C++ function had been updated. If you still see your function 
  signature accepts a const char * argument, please click the reload button  to reset
  your code definition.
*/

public class StringToInteger {
    public static int myAtoi(String str) {
	str = str.trim();

	int MAX = 2147483647;
	int MIN = -2147483648;
	
	int len = str.length();
	if (len == 0) {return 0;}

	long result = 0;
	boolean belowZero = false;
	boolean hasPlus = false;

	int i = 0;
	if (str.charAt(i) == '-') {belowZero = true; i++;}
	else if (str.charAt(i) == '+') {hasPlus = true; i++;}
	int begin = i;
	if (begin == len) {return 0;}

	while (i < len) {
	    if (result > MAX && !belowZero) {return MAX;}
	    if (result > (long) (MAX) + 1 && belowZero) {return MIN;}

	    char curChar = str.charAt(i);
	    if (curChar == '0') { result = result * 10 ;}
	    else if (curChar == '1') { result = result * 10 + 1 ;}
	    else if (curChar == '2') { result = result * 10 + 2 ;}
	    else if (curChar == '3') { result = result * 10 + 3 ;}
	    else if (curChar == '4') { result = result * 10 + 4 ;}
	    else if (curChar == '5') { result = result * 10 + 5 ;}
	    else if (curChar == '6') { result = result * 10 + 6 ;}
	    else if (curChar == '7') { result = result * 10 + 7 ;}
	    else if (curChar == '8') { result = result * 10 + 8 ;}
	    else if (curChar == '9') { result = result * 10 + 9 ;}
	    else if (i == begin) {return 0;} // first must be a number
	    else {break;}
	    /*	    else if (curChar == '.'){
		    i++;
		    while (i < len) {
			if (str.charAt(i) != '0') {return 0;}
			i++;
		    }
		    }
	    */
	    
	    i++;
	}
	    
	if (belowZero && -result < MIN) {result = 0;}
	else if (belowZero) {result = -result;}
	if (!belowZero && result > MAX) {result = 0;}
	
	return (int) result;
    }

    public static void main(String args[]) {
	System.out.println(myAtoi("-12"));
    }
}