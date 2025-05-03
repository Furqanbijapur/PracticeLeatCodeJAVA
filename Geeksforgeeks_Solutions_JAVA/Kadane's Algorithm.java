

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
         long max=Integer.MIN_VALUE;
    long sum=0;
    for (int i:arr){
        sum+=i;
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
    }
    return max;
        // Your code here
        
    }
    
}