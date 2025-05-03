class Solution{
  public:
    vector<int> duplicates(int arr[], int n) {
       vector<int> dup(n);
       vector<int> a;
       for(int i=0;i<n;i++){
           if(dup[arr[i]]==1){
               a.push_back(arr[i]);
           }
           dup[arr[i]]++;
       }
       if(a.size()){
           sort(a.begin(),a.end());
           return a;
       }
       return {-1};
   }
   };