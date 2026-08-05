package LeetcodeProblems;

public class SearchIn2DMatrix {
    public static boolean  SearchMatrix(int[][] matrix,int target){
        int totalRows =  matrix.length;
        int totalCols= matrix[0].length;

        int n=totalRows*totalCols;

        int s=0;
        int e=n-1;


        while(s<=e){
            int mid = s+(e-s)/2;
            int rowIndex=mid/totalCols;
            int colIndex=mid%totalCols;

            if(matrix[rowIndex][colIndex]==target){
                return true;
            } else if (matrix[rowIndex][colIndex]>target) {
                  e=mid-1;
            }
            else
                s=mid+1;

        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr={{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        boolean ans=SearchMatrix(arr,34);
        System.out.println(ans);
    }
}
