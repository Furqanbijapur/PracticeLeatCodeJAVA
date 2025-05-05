

//User function Template for Java

class Solution{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int arr[], int N){
        
        // Your code here
        int one=0;
        
        for(int i=0; i<N;i++){
            
            if(arr[i]==1)
                one++;
        }
        return one;
    }
    
}