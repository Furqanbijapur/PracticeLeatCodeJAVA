

//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
    
    Arrays.sort(A);
    
    for(int i=0;i<n-2;i++){
        int l=i+1;
        int r=n-1;
        int ele=A[i];
        
        while(l<r)
        
        if(ele+A[l]+A[r]==X)
        return true;
        
        else if (ele+A[l]+A[r]<X)
            l++;
        else
            r--;
        
    }
    return false;
    }
}