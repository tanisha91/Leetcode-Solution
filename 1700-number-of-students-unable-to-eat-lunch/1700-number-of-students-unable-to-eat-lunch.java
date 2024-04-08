class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cnt1=0,cnt0=0;
        int n=students.length;
        for(int i:students){
            if(i==0) cnt0++;
            else cnt1++;
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && cnt0>0) cnt0--;
            else if(sandwiches[i]==1 && cnt1>0) cnt1--;
            else return n-i;
        }
        // if(cnt0>cnt1) return cnt0;
        // else
        return 0;
    }
}