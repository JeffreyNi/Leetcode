/*
  Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

  For example,
  Given the following matrix:

  [
  [ 1, 2, 3 ],
  [ 4, 5, 6 ],
  [ 7, 8, 9 ]
  ]
 */

import java.util.*;
import java.lang.*;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
	List<Integer> res = new LinkedList<Integer>();
        int row = matrix.length;
        if (row == 0) return res;
        int col = matrix[0].length;

	//	System.out.println("rows: " + row);
	//	System.out.println("cols: " + col);
        
        for (int i = 0; i <= row / 2; i++) {
            
            if (i == row - i - 1) {
                for (int j = i; j <= col - 1 -i; j++) {
                    res.add(matrix[i][j]);
                }
            }
            else if (col - 1 - i == i) {
                int currCol = i;
                while (i <= row - currCol - 1) {
                    res.add(matrix[i][currCol]);
                    i++;
                }
            } else {
            
                // add top row
                for (int j = i; j < col - 1 - i; j++) {
                    res.add(matrix[i][j]);                
                }
                // add right col
                for (int k = i; k < row - i - 1; k++) {
                    res.add(matrix[k][col - 1 - i]);
                }
                // add bottom row
                for (int k = col - i - 1; k > i; k--) {
                    res.add(matrix[row - i - 1][k]);
                }
                // add left col
                for (int k = row - i - 1; k > i; k--) {
                    res.add(matrix[k][i]);
                }
                
                if (col - 1 - 2 * i <= 1) {
                    i = row/2;
                }
            }
        }
        
        return res;
    }


    public static void main(String args[]) {
	
	int[][] matrix = {{1, 2}};
	spiralOrder(matrix);
    }


}