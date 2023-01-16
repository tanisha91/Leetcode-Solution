class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
//         if(n%2==1){
//       for(int i=0;i<mat.length;i++){
          
//           for(int j=0;j<mat[i].length;j++){
//               if((i+j)%2==0)
//               sum +=mat[i][j];
//           }     
// }  
//     }
//         else{
            for(int i=0;i<mat.length;i++){
          
          for(int j=0;j<mat[i].length;j++){
              if((i+j)==n-1||i==j)
              sum +=mat[i][j];
          }     
}  
//}
        return sum;
}
}