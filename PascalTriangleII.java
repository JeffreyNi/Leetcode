// previous 2 solution time-out, but are kind of space saving

/*
  Given an index k, return the kth row of the Pascal's triangle.

  For example, given k = 3,
  Return [1,3,3,1].
*/

import java.lang.*;

public class PascalTriangleII {

    // public int getNum(int row, int col) {
    //     if (col == 1 || col == row) return 1;
    //     return getNum(row - 1, col -1) + getNum(row - 1, col);
    // }
    
    // public List<Integer> getRow(int rowIndex) {
    //     List<Integer> result = new ArrayList<Integer>();
    //     for (int i = 1; i <= rowIndex + 1; i++) {
    //         result.add(getNum(rowIndex + 1, i));
    //     }
        
    //     return result;
    // }
    
    // public List<Integer> getRow(int rowIndex) {
    //     List<Integer> result = new ArrayList<Integer>();
    //     result.add(1);
    //     if (rowIndex == 1) {result.add(1);}
    //     if (rowIndex > 1) {
    //         result.add(1);
            
    //         for (int i = 2; i <= rowIndex; i++) {
                
    //             for (int j = 1; j < i; j++) {
                   
    //                 int cur = result.get(j) + result.get(j - 1);
    //                 int k = j - 2;
    //                 int z = 0;
                    
    //                 while (z <= k) {
    //                     if (z % 2 == 0) cur -= result.get(k - z);
    //                     else cur += result.get(k - z);
    //                 }
    //                 result.set(j, cur);
    //             }
    //             result.add(1);
    //         }
            
    //     }
        
    //     return result;
    // }

    public static List<Integer> getRow(int rowIndex) {
	List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        if (rowIndex > 0) {
            result.add(1);
            if (rowIndex > 1) {
                List<Integer> preList;
                
                for (int i = 2; i <= rowIndex; i++) {
                    preList = new ArrayList<Integer>(result);
                    for (int j = 1; j < preList.size(); j++) {
                        result.set(j, preList.get(j) + preList.get(j - 1));
                    }
                    result.add(1);
                }
                
            }
        }
        
        return result;	
    }

}