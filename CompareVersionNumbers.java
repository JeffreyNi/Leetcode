// many cases to consider. Redo It!!!

/*
  Compare two version numbers version1 and version2.
  If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

  You may assume that the version strings are non-empty and contain only digits and the . character.
  The . character does not represent a decimal point and is used to separate number sequences.
  For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

  Here is an example of version numbers ordering:

  0.1 < 1.1 < 1.2 < 13.37
*/

public class CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {
	int pos1 = 0;
        int pos2 = 0;
        int len1 = version1.length();
        int len2 = version2.length();
        int next1 = 0;
        int next2 = 0;
        
        while (pos1 < len1 && pos2 < len2) {
            while ( pos1 < len1 && version1.charAt(pos1) == '0') pos1++;
            while ( pos2 < len2 && version2.charAt(pos2) == '0') pos2++;
            next1 = pos1;
            next2 = pos2;
            while (next1 < len1 && version1.charAt(next1) != '.') next1++;
            while (next2 < len2 && version2.charAt(next2) != '.') next2++;
            if (next1 - pos1 > next2 - pos2) return 1;
            else if (next1 - pos1 < next2 - pos2) return -1;
            else if (pos1 < len1 && pos2 < len2) {
                if (version1.charAt(pos1) == '.' && version2.charAt(pos2) == '.') {
                    pos1++;
                    pos2++;
                } 
                else if (version1.charAt(pos1) == '.') return -1;
                else if (version2.charAt(pos2) == '.') return 1;
                else {
                    while (pos1 < len1 && pos2< len2 && version1.charAt(pos1) != '.' && version2.charAt(pos2) != '.' && version1.charAt(pos1) == version2.charAt(pos2) ) {pos1++; pos2++;}
                    if (pos1 < len1 && pos2 < len2) {
                        if (version1.charAt(pos1) == '.' || version2.charAt(pos2) == '.') {
                            if (version1.charAt(pos1) == '.' && version2.charAt(pos2) == '.') {pos1++; pos2++;}
                            else if (version1.charAt(pos1) == '.') return -1;
                            else return 1;
                        } else {
                            if (version1.charAt(pos1) < version2.charAt(pos2)) return -1;
                            else return 1;
                        }
                    
                    }
                }
            }
        }
        
        if (pos1 == len1) {
            if (pos2 < len2 && version2.charAt(pos2) != '.') return -1;
            while (pos2 < len2) {
                if (version2.charAt(pos2) == '0' || version2.charAt(pos2) == '.') pos2++;
                else return -1;
	    }
        } else {
            if (version1.charAt(pos1) != '.') return 1;
            while (pos1 < len1) {
                if (version1.charAt(pos1) == '0' || version1.charAt(pos1) == '.') pos1++;
                else return 1;
            }
        }
        
        return 0;
    }

    public static void main(String args[]) {
	
	System.out.println(compareVersion(args[0], args[1]));

    }

}