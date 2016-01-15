import java.util.*;
import java.util.regex.Pattern;

public class CompareVersions {

    public static int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split(Pattern.quote("."));
        String[] arr2 = version2.split(Pattern.quote("."));

	System.out.println("arr1:" + Arrays.toString(arr1));
	System.out.println("arr2:" + Arrays.toString(arr2));
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = Math.min(len1, len2);
        
        for (int i = 0; i < len; i++) {
            String str1 = arr1[i];
            String str2 = arr2[i];
	    System.out.println("str1:" + str1);
	    System.out.println("str2:" + str2);
            int pos1 = 0;
            int pos2 = 0;
            while (pos1 < str1.length() && str1.charAt(pos1) == '0') {pos1++;}
            while (pos2 < str2.length() && str2.charAt(pos2) == '0') {pos2++;}
            int diff = str1.substring(pos1).compareTo(str2.substring(pos2));
            if (diff < 0) {return -1;}
            else if (diff > 0) {return 1;}
        }
        
        boolean allZero;
        if (len1 > len2) {
            allZero = checkZero(arr1, len, len1);
            if (!allZero) {return 1;}
        }
        if (len1 < len2) {
            allZero = checkZero(arr2, len, len2);
            if (!allZero) {return -1;}
        }
        
        return 0;
    }
    
    private static boolean checkZero(String[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            String str = arr[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '0') {return false;}
            }
        }
        return true;
    }

    public static void main (String args[]) {
	System.out.println(compareVersion("3.3", "2.2"));
	String str1 = "2";
	String str2 = "10";
	System.out.println(str1.compareTo(str2));

    }


}