

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        
        int low=0, high=arr.length-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(arr[mid]==k)
                return true;
                
            if(arr[mid]<k)
                low=mid+1;
                
            else
                high=mid-1;
            
        }
        
        return false;
        
        
    }
}