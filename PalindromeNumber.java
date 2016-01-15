
/*
  Determine whether an integer is a palindrome. Do this without extra space.
*/

import java.lang.Integer;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
	if (x < 0) {return false;}

	int origin = x;
	int num = x;
	int digits = 1;
	int toDivide = 1;
	while (num / 10 != 0) {
	    num /= 10;
	    toDivide *= 10;
	    digits++;
	}
	
	for (int i = 0; i < digits / 2; i++) {
	    if ( (origin / toDivide) % 10 != origin % 10) {return false;}
	    else {
		origin /= 10;
		toDivide /= 100;
	    }
	}

	return true;
	
    }
    

    public static void main (String args[]) {
	System.out.println(isPalindrome(Integer.parseInt(args[0])));
    }
}