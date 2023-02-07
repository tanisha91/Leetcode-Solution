class Solution {
    public int totalFruit(int[] fruits) {
        int max1=0;
        int n = fruits.length;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while(j<n){
            map.put(fruits[j], map.getOrDefault(fruits[j],0) + 1);
            while(map.size()>2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0) map.remove(fruits[i]);
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
  
        
    }
}