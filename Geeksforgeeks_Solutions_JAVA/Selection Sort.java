

class Solution {
    void selectionSort(int[] arr) {
        // code here
        int mid,temp;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            mid=i;
            
            for(int j=i+1;j<n;j++){
                
                if(arr[j]<arr[mid]){
                    
                    temp=arr[j];
                    arr[j]=arr[mid];
                    arr[mid]=temp;
                }
            }
        }
    }
}