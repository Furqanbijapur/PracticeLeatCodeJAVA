

//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long>list=new ArrayList<>();
        int i=0;
        int j=0;
        ArrayList<Long>list1=new ArrayList<>();
        while(j<N){
            if (A[j]<0)
                list1.add(A[j]);
            if (j-i+1==K){
                if(list1.size()==0)
                    list.add((long)0);
                else
                    {
                        list.add(list1.get(0));
                        if(A[i]<0)
                            list1.remove(0);
                    }
                    i++;
                    j++;
            }
            else 
                j++;
        } 
         long[] answer=new long[list.size()];
       for(int p=0;p<list.size();p++)
           answer[p]=list.get(p);
       return answer;
         
    }
}