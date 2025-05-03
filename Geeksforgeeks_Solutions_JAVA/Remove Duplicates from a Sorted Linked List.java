

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
     Node temp = head, prev = head;
 
        // Traverse list till the last node
        while (temp != null) {
 
            // Compare values of both pointers
            if (temp.data != prev.data) {
                // if the value of prev is not equal to the
                // value of temp that means there are no
                // more occurrences of the prev data. So we
                // can set the next of prev to the temp
                // node.
                prev.next = temp;
                prev = temp;
            }
            // Set the temp to the next node
            temp = temp.next;
        }
        // This is the edge case if there are more than one
        // occurrences of the last element
        if (prev != temp)
            prev.next = null;
            
        return head;
    }
}