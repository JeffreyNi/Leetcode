/* Given an array of strings, group anagrams together.

   For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
   Return:

   [
   ["ate", "eat","tea"],
   ["nat","tan"],
   ["bat"]
   ]
*/

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {
	List<List<String>> result = new ArrayList<List<String>>();
        Arrays.sort(strs);
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < strs.length; i++) {
           
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String currSort = Arrays.toString(charArr);
            
            if (!map.containsKey(currSort)) {
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                result.add(list);
                map.put(currSort, result.size());
            } 
            else {
                result.get(map.get(currSort) - 1).add(strs[i]);
            }
        }
        
        return result;  
	
    }

    public void main(String args[]) {
	

    }

}