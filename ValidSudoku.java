// use some Arrays function and trick to calculate numbers filled. REDO it!!!


/*
  Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

  The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*/

import java.util.Arrays;

public class ValidSudoku {
    
    public static boolean isValidSudoku (char[][] board) {
	boolean used[] = new boolean[9];
	
	for (int i = 0; i < 9; i++) {   
	    // check rows
	    Arrays.fill(used, false);
	    for (int j = 0; j < 9; j++) {
		if (board[i][j] != '.') {
		    if (used[board[i][j] - '1']) {return false;}
		    else used[board[i][j] - '1'] = true;
		}
	    }
	    
	    // check columns
	    Arrays.fill(used, false);
	    for (int j = 0; j < 9; j++) {
		if (board[j][i] != '.') {
		    if (used[board[j][i] - '1']) {return false;}
		    else used[board[j][i] - '1'] = true;
		}
	    }
	}

	// check small square
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		Arrays.fill(used, false);

		for (int k = 0; k < 9; k++) {
		    int row = 3 * i + k % 3;
		    int col = 3 * j + k / 3;
		    if (board[row][col] != '.') {
			if (used[board[row][col] - '1']) {return false;}
			else used[board[row][col] - '1'] = true;
		    }
		   
		}
	    }
	}

	return true;
    }

    public static void main(String args[]) {

    }
}