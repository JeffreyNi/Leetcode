// please use toCharArray() to redo this problem, actually, no hashMap needed

/*
  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

import java.util.Stack;
import java.util.HashMap;

public class ValidParentheses {

    /*    
    public static boolean isValid(String s) {
	int len = s.length();
	if (len % 2 == 1) {return false;}

	int small = 0;
	int mid = 0;
	int large = 0;

	for (int i = 0; i < len; i++) {
	    if (s.charAt(i) == '(') {
		if (i < len - 1 && (s.charAt(i + 1) == ']' || s.charAt(i + 1) == '}')) {return false;}
		small++;
	    }
	    if (s.charAt(i) == '[') {
		if (i < len - 1 && (s.charAt(i + 1) == ')' || s.charAt(i + 1) == '}')) {return false;}
		mid++;
	    }
	    if (s.charAt(i) == '{') {
		if (i < len - 1 && (s.charAt(i + 1) == ')' || s.charAt(i + 1) == ']')) {return false;}
		large++;
	    }
	    if (s.charAt(i) == ')') {small--;}
	    if (s.charAt(i) == ']') {mid--;}
	    if (s.charAt(i) == '}') {large--;}

	    if (small < 0 || mid < 0 || large < 0) {return false;}
	}
	
	if (small != 0 || mid != 0 || large != 0) {return false;}

	return true;	
    }
    */

    public static boolean isValid(String s) {
	int len = s.length();
	if (len % 2 == 1) {return false;}
	
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');

	Stack<Character> stack = new Stack<Character>();
	
	for (int i = 0; i < len; i++) {
	    if (map.containsKey(s.charAt(i))) { stack.push(s.charAt(i)); }
	    else {
		if (!stack.empty() && map.get(stack.peek()) == s.charAt(i)) {stack.pop();}
		else return false;
	    }
	}

	return stack.empty();
	
    }
    
    public static void main(String args[]) {
	System.out.println(isValid(args[0]));
    }

}