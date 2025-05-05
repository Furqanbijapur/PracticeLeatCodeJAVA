


class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        if(n==1) return (long)1;
        long res=n/2;
        return res+1;
    }
}