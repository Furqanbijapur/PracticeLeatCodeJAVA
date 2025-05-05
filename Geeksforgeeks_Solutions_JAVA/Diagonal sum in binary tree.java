

/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
      static int min;
    
    public static void preorder(Node root,int i,HashMap<Integer,Integer> mp){
        
        if(root==null){
            return;
        }
        
        preorder(root.left,i-1,mp);
        if(mp.containsKey(i)){
            mp.put(i,root.data+mp.get(i));
        }
        else{
            min=Math.min(min,i);
            mp.put(i,root.data);
        }
        preorder(root.right,i,mp);
        
    }
    
    public static ArrayList <Integer> diagonalSum(Node root){
        
        min=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        preorder(root,0,mp);
        
        ArrayList<Integer> arr=new ArrayList<>();
        int n=0;
        while(n>=min){
            arr.add(mp.get(n));
            n--;
        }
        
        return arr;
        
    }
    
}