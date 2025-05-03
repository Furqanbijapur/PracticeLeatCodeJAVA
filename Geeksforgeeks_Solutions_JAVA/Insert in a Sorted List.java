

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
     Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        Node currNode = head1;
            if(currNode.data >= key){
                newNode.next = currNode;
                currNode = newNode;
                return currNode;
            }
            currNode = head1;
            while(currNode.next != null && key >= currNode.next.data){
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
            
            return head1;
    }
}