class Solution {
    public int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}