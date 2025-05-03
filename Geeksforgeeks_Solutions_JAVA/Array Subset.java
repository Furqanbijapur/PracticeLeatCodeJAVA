

//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
           int i=0,j=0,count=0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        while(i<n&&j<m){
            if(a1[i]==a2[j]){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(count == m){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}