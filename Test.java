import java.util.*;

public class Test {
    public static List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> dp[] = new ArrayList[s.length() + 1];
        dp[0] = new ArrayList<String>();
        
        for (int i = 0; i < s.length(); i++) {
            if (dp[i] == null) {continue;}
            
            for (String str : wordDict) {
                int len = str.length();
                int end = i + len;
                if (end > s.length()) {continue;}
                if (s.substring(i, end).equals(str)) {
                    if (dp[end] == null) {
                        dp[end] = new ArrayList<String>();
                    }
                    dp[end].add(str);
                }
            }
        }
        
        List<String> result = new ArrayList<String>();
        if (dp[s.length()] == null) {return result;}
	
	int i = 0;
	for (List<String> list : dp) {
	    System.out.print(i + ": ");
	    if (list == null) {continue;}
	    i++;
	    for (String str : list) {
		System.out.print(str);
	    }
	    System.out.println("");
	}
        
        List<String> tmp = new ArrayList<String>();
        dfsBuildList(dp, result, tmp, s.length());
        
        return result;
    }
    
    private static void dfsBuildList(List<String> dp[], List<String> result, List<String> tmp, int pos) {
        if (pos <= 0) {
            String str = tmp.get(tmp.size() - 1);
            for (int i = tmp.size() - 2; i >= 0; i--) {
                str += " " + tmp.get(i);
            }
            result.add(str);
            return;
        }   
        
        for (String str : dp[pos]) {
            tmp.add(str);            
            dfsBuildList(dp, result, tmp, pos - str.length());
            tmp.remove(tmp.size() - 1);
        }
    }

    public static int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while (i < 32) {
            if (m == n) {return m << i;}
            m >>= 1;
            n >>= 1;
            i++;
        }
        
        return 0;
    }

    public static void main(String args[]) {
	Set<String> set = new HashSet<String>();
	set.add("cat");
	set.add("cats");
	set.add("and");
	set.add("sand");
	set.add("dog");

	List<String> result = wordBreak("catsanddog", set);

	System.out.println("result" + result);

	System.out.println(7 & (1 << 2 ) - 1);

	System.out.println(rangeBitwiseAnd(Integer.MAX_VALUE, Integer.MAX_VALUE));
	System.out.println(rangeBitwiseAnd(5, 7));
    }

}