

//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
         Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        return String.join("",arr);
    }
}