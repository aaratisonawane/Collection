class LinkedListInsertion{
	Node head;

	//Add node at the end of the list
	public void addAtLast(int data){
		Node node = new Node(data);

		if(head == null){
			head = node;
		} else {
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = node;
		}
	}

	// Add node in between two nodes
	public void addAfterNode(int newData, int givenData){
		Node node = new Node(newData);

		Node current = head;
		while(current.data != givenData){
			current = current.next;
		}
		node.next = current.next;
		current.next = node;
	}	
	// Add node at the start of the list
	public void addAtStart(int data){
		Node node = new Node(data);

		if(head == null){
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

    // Print elements in the list
	void showList(){
		Node node = head;

		while (node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	
	public static void main(String[] args){
		LinkedListInsertion list = new LinkedListInsertion();
		list.addAtLast(1);
		list.addAtLast(3);
		list.addAtStart(0);
		list.addAfterNode(2,1);
		list.showList();

	}
}