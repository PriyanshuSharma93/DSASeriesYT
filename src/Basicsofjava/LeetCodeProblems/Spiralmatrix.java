package Basicsofjava.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix){
        int m=matrix.length;
        int n= matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int startingRow=0;
        int endingRow=m-1;
        int startingCol=0;
        int endingCol=n-1;

        while (startingRow<=endingRow && startingCol<=endingCol){
            // rowwise left ot right
            for(int col=startingCol;col<=endingCol;col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;
            //colwise top to botttom
            for(int row=startingRow;row<=endingRow;row++){
                result.add(matrix[row][endingCol]);
            }
            endingCol--;
            //rowwise right to left
            for(int col=endingCol;col>=startingCol;col--){
                result.add(matrix[endingRow][col]);
            }
            endingRow--;
            //colwise bottom to top
            for(int row=endingRow;row>=startingRow;row--){
                result.add(matrix[row][startingCol]);
            }
            startingCol++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Spiralmatrix obj = new Spiralmatrix();
        List<Integer> ans =obj.spiralOrder(matrix);
        System.out.println(ans);
    }
}
