// can use class StringBuilder, which have function append(). 
// Also, use getBit to simplify the calculation

/*
  Given two binary strings, return their sum (also a binary string).

  For example,
  a = "11"
  b = "1"
  Return "100".
*/

public class AddBinary {

    public static String addBinary(String a, String b) {
	int lena = a.length();
	int lenb = b.length();
	String result = "";
	boolean flag = false;
	int i = 1;
	char ca, cb;	

	while (i <= lena || i <= lenb) {

	    if (i > lena) {ca = '0';}
	    else {ca = a.charAt(lena - i);}
	    if (i > lenb) {cb = '0';}
	    else {cb = b.charAt(lenb - i);}

	    if (!flag) {
		if (ca == cb) {
		    result = 0 + result;
		    if (ca == '1') {flag = true;}
		}
		else result = 1 + result;
	    }
	    else {
		if (ca == cb ) {
		    result = 1 + result;
		    if (ca == '0') {flag = false;}
		}
		else { result = 0 + result;}
	    }
	    i++;
	}

	if (flag) result = 1 + result;

	return result;
    }

    public static void main (String args[]) {
	System.out.println(addBinary(args[0], args[1]));
    }
}