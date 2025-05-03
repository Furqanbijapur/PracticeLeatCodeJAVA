

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
          int c=0;
        int maxdif=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                if(a[i]<=a[j])
                {
                    c=j-i;
                    maxdif=Math.max(c,maxdif);
                    break;
                }
            }
        }
        return maxdif;
        
    }
}
