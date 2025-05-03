

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        
        res.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=res.get(res.size()-1))
            {
                res.add(arr[i]);
             }
        }
        Collections.reverse(res);
        
        return res;
    }
}