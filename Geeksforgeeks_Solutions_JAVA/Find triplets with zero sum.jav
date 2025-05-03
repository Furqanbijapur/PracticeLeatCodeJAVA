

/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
        for (int i=0; i<n-2;i++){
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            
            while(l<r){
                
                
                if(x+arr[l]+arr[r]==0)
                return true;
           else if(x + arr[l] + arr[r] < 0)
					l++;
				//Else the sum is more than 0 and we need to decrease the
                //sum so we decrease the right pointer r.
				else
					r--;
			}
		}
		//returning false if no triplet with zero sum is present.
		return false;
	}
}