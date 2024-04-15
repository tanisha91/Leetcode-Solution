class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> hs=new HashSet<>();
        HashMap<Character,Integer> hs=new HashMap<>();
        int l=0,r=0;
        int max=0;
       while(r<s.length()){
          if(hs.containsKey(s.charAt(r)))
              l=Math.max(hs.get(s.charAt(r))+1,l);
            
            hs.put(s.charAt(r),r);
              max=Math.max(max,r-l+1);
          r++;
        }
        return max;
    }
}