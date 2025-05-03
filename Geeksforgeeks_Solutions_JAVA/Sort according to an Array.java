//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        int k = 0;
       
       for(int i=0; i<M; i++){
           for(int j=i; j<N; j++){
               if(A1[j] == A2[i]){
                   int temp = A1[k];
                   A1[k] = A1[j];
                   A1[j] = temp;
                   
                   k++;
               }
           }
       }
       Arrays.sort(A1, k, N);
       return A1;
   }
    }


