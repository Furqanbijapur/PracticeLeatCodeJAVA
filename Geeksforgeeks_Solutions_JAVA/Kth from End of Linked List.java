

/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node first=head;
    	if(head==null)
    	    return -1;
    	for(int i=0;i<n;i++){
    	    if(first==null)
    	        return -1;
    	   first=first.next;
    	}
    	
    	Node second=head;
    	while(first!=null){
    	    second=second.next;
    	    first=first.next;
    	}
    	return second.data;
    }
}