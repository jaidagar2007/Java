public class MatrixOperations {
    public static int[] rowSum(int[][] matrix){
        int[] arr = new int[matrix.length];
        for(int i =0;i<matrix.length;i++){
            int sum =0;
            for(int j =0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }
    public static int[] coloumnSum(int[][] matrix){
        int[] colSum = new int[matrix[0].length];
        for(int i =0;i<matrix[0].length;i++){
            int sum =0;
            for(int j =0;j<matrix.length;j++){
                sum+=matrix[j][i];
            }
            colSum[i] = sum;
        }
        return colSum;
    }
    public static int[][] transpose(int[][] matrix){
        int n= matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static int[][] product(int[][] first, int second[][]){
        int n = first.length;
        int m = second[0].length;
        int[][] ans = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                for(int k =0;k<first[0].length;i++){
                    ans[i][j]+=first[i][k]*second[k][j];
                }
            }
        }
        return ans;
    }
}
