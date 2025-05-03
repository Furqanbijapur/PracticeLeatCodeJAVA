

/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
 if (head == null) 
            return true; 
	
	 Node slow = head; 
        Node fast = head.next; 
        while (fast != null && fast.next != null) { 
            if (slow == fast) { 
                return true; 
            } 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return false; 
    } }