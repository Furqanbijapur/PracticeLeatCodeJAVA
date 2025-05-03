*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.

         int ans = maxRect(M[0], m);;
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                if(M[i][j]==0) continue;
                M[i][j] = M[i-1][j]+1;
                
            }
            ans = Math.max(ans, maxRect(M[i], m));
            
        }
        return ans;
    }
    
    public int maxRect(int a[], int n){
        
        Stack<Integer> st = new Stack<Integer>();
        int left[] = new int[n];
        int right[] = new int[n];
        
        for(int i=0; i<n; i++){
            
            while(!st.isEmpty() && a[st.peek()]>=a[i]) st.pop();
            
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        
        for(int i=n-1; i>=0; i--){
            
            while(!st.isEmpty() && a[st.peek()]>=a[i]) st.pop();
            
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, a[i]*(right[i]-left[i]-1));
        }
        return maxi;
    }
}
    