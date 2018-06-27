class QueueUsingLinkedList{
	QueueNode head;
	

	public void enQueue(int data){
		QueueNode qNode = new QueueNode(data);

		if(head == null){
			head = qNode;
		} else {
			QueueNode tail = head;
			while(tail.next != null){
				tail = tail.next;
			}
			tail.next = qNode;
		}
	}


	public void deQueue(){
		System.out.println("\nAfter deleting head");
		QueueNode qNode = head;
		head = qNode.next;
	}

	public void showQueue(){
		QueueNode qNode = head;
		while(qNode != null){
			System.out.print(qNode.data + " ");
			qNode = qNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args){
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.showQueue();
		queue.deQueue();
		queue.showQueue();  
		System.out.println("Adding new elements");
		queue.enQueue(7);
		queue.enQueue(6);
		queue.showQueue();
		queue.deQueue();
		queue.showQueue();
	}

}