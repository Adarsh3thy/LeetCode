package arraysandhashing;

import java.util.HashMap;


import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/valid-sudoku/
 * */

public class sudoku {

	public boolean isValidSudoku(char[][] board) {

		HashSet<String> allHashes=new HashSet<>();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.') {
					if(allHashes.contains("row"+i+board[i][j])
						|| 	allHashes.contains("col"+j+board[i][j])
						|| allHashes.contains("box"+(i/3)+(j/3)+board[i][j])	
							
							) {
						return false;
					}
					allHashes.add("row"+i+board[i][j]);
					allHashes.add("col"+j+board[i][j]);
					allHashes.add("box"+(i/3)+(j/3)+board[i][j]);
				}
			}
		}
		
		return false;
	}

}
