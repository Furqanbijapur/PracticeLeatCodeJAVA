

/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newNode = new Node(x);

        // If the list is empty, return the new node
        // as the head
        if (head == null) {
            return newNode;
        }
        
         if (x <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        
         Node curr = head;
        while (curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }

        // Insert the new node in the correct position
        newNode.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = newNode;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return head;

    }
}