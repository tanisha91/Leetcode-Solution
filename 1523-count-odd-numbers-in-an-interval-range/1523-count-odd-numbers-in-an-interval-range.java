class Solution {
    public int countOdds(int low, int high) {
       int odd=(high-low)/2;
        if(low % 2!=0 || high % 2!=0){
            odd++;
        }
        return odd;
    }
}
// class Solution {
//     public int countOdds(int low, int high) {
//         // Initialize odd with the number of even numbers between low and high.
//         int odd = (high - low) / 2;
        
//         // If either low or high is odd, increment odd by 1.
//         if (low % 2 == 1 || high % 2 == 1) {
//             odd++;
//         }
        
//         // Return the number of odd numbers between low and high.
//         return odd;
//     }
// }