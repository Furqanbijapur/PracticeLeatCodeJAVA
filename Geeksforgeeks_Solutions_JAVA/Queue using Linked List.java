

/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
         QueueNode temp= new QueueNode(a);
        if(front==null){
            front=rear=temp; 
            return;}
       
        rear.next=temp;
        rear=temp;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null)
        return -1;
        QueueNode temp=front;
        front=front.next;
        if(front==null)
            rear=null;
        return temp.data;
	}
	    
}


