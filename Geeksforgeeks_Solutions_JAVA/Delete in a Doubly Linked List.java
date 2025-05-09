

//Back-end complete function Template for Java

class Solution
{
	Node deleteNode(Node head,int x)
	{
		//System.out.println(head.data);
		//System.out.println(del.data);
		Node del=head;
		x--;
		while(x-->0){
		    del=del.next;
		}
		if(head == null || del == null)
			return null;
			
		if(head == del)
		{
			head = del.next;
			//head.prev = null;
		}
		
		if(del.next != null)
			del.next.prev = del.prev;
			
		if(del.prev != null)
			del.prev.next = del.next;
		
		return head;
	}
}