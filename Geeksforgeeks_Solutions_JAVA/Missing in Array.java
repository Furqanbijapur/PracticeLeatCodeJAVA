

// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int sum=0,sum1=0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        sum1=(n*(n+1))/2;
        return (sum1-sum);
    }
}