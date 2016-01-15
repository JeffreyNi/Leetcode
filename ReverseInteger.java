import java.lang.Integer;

/*
  Reverse digits of an integer.

  Example1: x = 123, return 321
  Example2: x = -123, return -321
*/

public class ReverseInteger {
    public static int reverse(int x) {
	int tmp = x > 0 ? x : -x;
	long result = 0;
	while (tmp > 0) {
	    result = 10 * result + (tmp % 10);
	    tmp /= 10;
	}
	if (result > 2147483647) { result = 0; }
	result = x > 0 ? result : -result;
	return (int) result;
    }

    public static void main(String args[]) {
	System.out.println(reverse(123456));
    }

}