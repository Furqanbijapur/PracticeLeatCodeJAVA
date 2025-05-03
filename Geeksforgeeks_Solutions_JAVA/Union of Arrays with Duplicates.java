

//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> s= new HashSet<>();
        
        for (int i =0; i<n;i++){
            s.add(a[i]);
        }
         for (int i =0; i<m;i++){
            s.add(b[i]);
        }
        
        return s.size();
    }
}