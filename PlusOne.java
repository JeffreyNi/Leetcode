/*
  Given a non-negative number represented as an array of digits, plus one to the number.

  The digits are stored such that the most significant digit is at the head of the list.
*/

public class PlusOne {
    
    public static int[] plusone(int[] digits) {
	int len = digits.length;
	int[] result = new int[len];
	boolean move = false;
	boolean plus = true;
	for (int i = len - 1; i >= 0; i--) {
	    if (plus) {
		move = (digits[i] == 9);
		if (move) {result[i] = 0;}
		else {
		    result[i] = digits[i] + 1;
		    plus = false;
		}
	    }
	    else { result[i] = digits[i]; }
	}
	
	if (plus && move) {
	    int[] result_2 = new int[len + 1];
	    result_2[0] = 1;
	    return result_2;
	} 

	return result;
    }
    
    public static void main(String args[]) {

    }
}