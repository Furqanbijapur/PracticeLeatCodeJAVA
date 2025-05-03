

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
            
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        
        int p=arr[high];
        int index=low-1;
        int temp=0;
        for(int i=low;i<high;i++){
            if(arr[i]<p){
                ++index;
                temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                
            }
            
        }
        int pivotposition=++index;
         temp=arr[index];
                arr[index]=p;
                arr[high]=temp;
                
                return pivotposition;
    } 
}