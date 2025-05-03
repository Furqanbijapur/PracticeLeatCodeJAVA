

/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
          if (head == null) 
        head = new Node(data); 
  
        else { 
            // get a new node 
            Node newNode = new Node(data); 
  
            // assign values to the slow  
            // and fast pointers 
            Node slow = head; 
            Node fast = head.next; 
  
            while (fast != null && fast.next  
                                  != null)  
            { 
                // move slow pointer to next node 
                slow = slow.next; 
  
                // move fast pointer two nodes  
                // at a time 
                fast = fast.next.next; 
            } 
  
            // insert the 'newNode' and adjust  
            // the required links 
            newNode.next = slow.next; 
            slow.next = newNode; 
    }
    return head;
}}