class Solution {
    public int matrixScore(int[][] grid) {
       int m = grid.length;
        int n = grid[0].length;
       for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                tRow(grid, i);
            }
        }
  for (int j = 1; j < n; j++) {
            int countOnes = 0;
            for (int i = 0; i < m; i++) {
                countOnes += grid[i][j];
            }
            if (countOnes < m - countOnes) {
                tCol(grid, j);
            }
        }
        
        // Calculate the score
        int score = 0;
        for (int i = 0; i < m; i++) {
            int rowScore = 0;
            for (int j = 0; j < n; j++) {
                rowScore = (rowScore << 1) + grid[i][j];
            }
            score += rowScore;
        }
        return score;
    }

    private void tRow(int[][] grid, int row) {
        for (int j = 0; j < grid[row].length; j++) {
            grid[row][j] = 1 - grid[row][j];
        }
    }
    
    private void tCol(int[][] grid, int col) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][col] = 1 - grid[i][col];
        }

    }
}