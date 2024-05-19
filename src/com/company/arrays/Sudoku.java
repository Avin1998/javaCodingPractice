package com.company.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Sudoku {
    public static boolean isValidSudoku(String[][] board) {
        HashMap<Integer, HashSet<Integer>> rowHash = new HashMap<Integer, HashSet<Integer>>();
        HashMap<Integer, HashSet<Integer>> colHash = new HashMap<Integer, HashSet<Integer>>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if (board[i][j] == ".") continue;
                Integer currentElement = Integer.parseInt(board[i][j]);
                if(rowHash.containsKey(currentElement)) {
                    if (rowHash.get(currentElement).contains(i)) return false ;
                    rowHash.get(currentElement).add(i);
                } else {
                    HashSet<Integer> rowVal = new HashSet<Integer>();
                    rowVal.add(i);
                    rowHash.put(currentElement, rowVal);
                }
                if(colHash.containsKey(currentElement)) {
                    if (colHash.get(currentElement).contains(j)) return false ;
                    colHash.get(currentElement).add(j);
                } else {
                    HashSet<Integer> colVal = new HashSet<Integer>();
                    colVal.add(j);
                    colHash.put(currentElement, colVal);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"8","3",".",".","7",".",".",".","."}
,{"6",".",".","1","9","5",".",".","."}
,{".","9","8",".",".",".",".","6","."}
,{"8",".",".",".","6",".",".",".","3"}
,{"4",".",".","8",".","3",".",".","1"}
,{"7",".",".",".","2",".",".",".","6"}
,{".","6",".",".",".",".","2","8","."}
,{".",".",".","4","1","9",".",".","5"}
,{".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(arr));
    }
}
