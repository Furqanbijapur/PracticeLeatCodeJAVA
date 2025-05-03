



class MyQueue {

    int front;
    int rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
    //Function to push an element x in a queue.
	void push(int a)
	{
	    //inserting x in the queue at rear.
		arr[rear++]=a;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    //if front is equal to rear, queue is empty.
		if (front==rear)
			   return -1;
		//else we return the element at front.
		return arr[front++];
	} 
}


