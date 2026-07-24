package LeetcodeProblems;

public class TransposeOfMatrix {
    public int[][] transpose(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0][0];
        }
        //original array
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        //new array
        int newtotalrows = totalCols;
        int newtatalCols = totalRows;
        int ans[][] = new int[newtotalrows][newtatalCols];

//        actual logic

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        TransposeOfMatrix obj = new TransposeOfMatrix();
        int[][] ans = obj.transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
