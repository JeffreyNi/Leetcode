public class RegMatch {
    public static boolean isMatch(String s, String p) {
        return isMatchHelper(s, 0, p, 0);
    }
    
    private static boolean isMatchHelper(String s, int pos1, String p, int pos2) {
	System.out.println(s + " pos1: " + pos1);
	System.out.println(p + " pos2: " + pos2);
        if (pos2 >= p.length()) {return pos1 == s.length();}
        
        if (pos2 == p.length() - 1 || p.charAt(pos2 + 1) != '*') {
            if (pos1 >= s.length()) {return false;}
            else {
                return (p.charAt(pos2) == '.' || p.charAt(pos2) == s.charAt(pos1)) && isMatchHelper(s, pos1 + 1, p, pos2 + 1);
            }
        }
        
        // here next char is '*'
        while (pos1 == s.length() || ( pos1 < s.length() && (p.charAt(pos2) == '.' || p.charAt(pos2) == s.charAt(pos1)))) {
            if (isMatchHelper(s, pos1, p, pos2 + 2)) {return true;}
            pos1++;
	    System.out.println("in the loop");
        }
        
        return isMatchHelper(s, pos1, p, pos2 + 2);
    }

    public static void main (String args[]) {
	isMatch("ab", ".*c");
    }

}