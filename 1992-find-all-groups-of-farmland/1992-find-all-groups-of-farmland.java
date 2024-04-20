class Solution {
    public int[][] findFarmland(int[][] land) {
        boolean vis[][]=new boolean[land.length][land[0].length];
        List<int []> ans=new ArrayList<>();
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(!vis[i][j] && land[i][j]==1){
                    int it=i;
                    int jt=j;
                    while(it<land.length && land[it][j]==1){
                        ++it;
                    }
                    while(jt<land[0].length && land[i][jt]==1){
                        ++jt;
                    }
                    for(int v1=i;v1<it;v1++){
                        for(int v2=j;v2<jt;v2++){
                            vis[v1][v2]=true;
                        }
                    }
                
                ans.add(new int[]{i,j,it-1,jt-1});
                }
            }
            
        }
        return ans.toArray(new int[ans.size()][]);
        
        }
}