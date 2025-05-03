/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        if(head1==null&&head2==null){
            return false;
        }
        if(head1.data!=head2.data){
            return false;
        }
        Node list1=head1;
        Node list2=head2;
        
        while(list1.next!=null&&list2.next!=null)
        { 
            if(list1.data!=list2.data)
                return false;
            
            list1=list1.next;
            list2=list2.next;
           
        }
         if(list1.next!=list2.next)
                return false;
            
        return true;
    }
}