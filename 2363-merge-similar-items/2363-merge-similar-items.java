class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        List<List<Integer>> list=new ArrayList<>();
        int[]arr= new int[1001];
        for(int i=0;i<items1.length;i++){
            arr[items1[i][0]] += items1[i][1];
        }
        for(int i=0;i<items2.length;i++){
            arr[items2[i][0]] += items2[i][1];
        }
        
        for(int i=0;i<1001;i++){
           // List<Integer> a=new ArrayList();
            if(arr[i]!=0){
                 List<Integer> a = new ArrayList();
            a.add(i);
            a.add(arr[i]);
            
            list.add(a);
        }
           
        }
        return list;
    }
}