class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      int max=0;
        String max2="";
        int n=heights.length;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-2-i;j++){
            if(heights[j]<heights[j+1]){
                max=heights[j];
                heights[j]=heights[j+1];
              heights[j+1]=max ;
                
                max2=names[j];
                names[j]=names[j+1];
                names[j+1]=max2;
            }
        }
        }
        return names;
    }
}