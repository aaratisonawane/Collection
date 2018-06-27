class LinkedListDeletion{
	Node head;
	void showList(){
		Node node = head;
		System.out.println("Show elements in a List");
		while (node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void removeData(int data){
		Node current = head;
		if(current.data == data) {
			head = current.next;
		} else {
			while(current != null && current.next != null){
				if(current.next.data == data){
					current.next = current.next.next;
				}
				current = current.next;
			}
			
		}
	}

	public static void main(String[] args){
		LinkedListDeletion list = new LinkedListDeletion();
		list.head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		list.head.next = node1;
		node1.next = node2;
		list.showList();
		list.removeData(1);
        System.out.println("After Deletion");
		list.showList();
	}
}