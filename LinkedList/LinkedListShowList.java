class LinkedListShowList{
	Node head;

	void showList(){
		Node node = head;
		System.out.println("Show elements in a List");
		while (node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args){
		LinkedListShowList list = new LinkedListShowList();
		list.head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);

		list.head.next = node1;
		node1.next = node2;

		list.showList();

	}
}