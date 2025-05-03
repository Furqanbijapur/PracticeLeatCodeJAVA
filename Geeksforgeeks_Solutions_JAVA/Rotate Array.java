

//Back-end complete function Template for Java

class Solution
{
    //Function to reverse any part of the array.
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 

        while (start < end) { 
            //Swapping values at start index and end index.
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;
            //Updating the values of start and end.
            start++; 
            end--; 
        } 
    }
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        d%=n;
        //First reversing d elements from starting index.
        rvereseArray(arr, 0, d-1);
        //Then reversing the last n-d elements.
        rvereseArray(arr, d, n - 1); 
        //Finally, reversing the whole array.
        rvereseArray(arr, 0, n - 1); 
    }
}