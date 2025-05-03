

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        
        HashSet<Integer> set=new HashSet<>();
        
        int presum=0;
        
        for (int i=0;i<arr.length;i++){
            
            presum+=arr[i];
            
            if(set.contains(presum)){
                return true;
            }
            
            if(presum==0){
                return true;
            }
            
            set.add(presum);
            
            
        }
        return false;
    }
}