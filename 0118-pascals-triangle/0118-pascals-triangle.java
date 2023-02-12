class Solution {
    public List<List<Integer>> generate(int numRows) {
        int [][] pascal=new int[numRows][];
        
        for(int i=0;i<numRows;i++){
            int res[]=new int[i+1];
            res[0]=1;
            res[i]=1;
            for(int j=1;j<i;j++){
                res[j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
            pascal[i]=res;
        }
        return (List)Arrays.asList(pascal);
    }
}
// int[][] pascal = new int[numRows][];
//         for (int i = 0; i < numRows; i++){
//             int[] row = new int[i + 1];
//             row[0] = 1;
//             row[i] = 1;
//             for (int j = 1; j < i; j++){
//                 row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
//             }
//             pascal[i] = row;
//         }
//         return (List)Arrays.asList(pascal);