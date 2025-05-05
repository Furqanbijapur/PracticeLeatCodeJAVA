

// User function Template for Java

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int x1=0,y1=0;
        for (int i = 0; i <n; i++) {
            
            if(arr[i]==x){
                x1++;
            }
            if (arr[i]==y){
                y1++;
            }
        }
        if(x1>y1)
            return x;
        else if(x1<y1)
            return y;
        else
            return Math.min(x,y);
    }
}