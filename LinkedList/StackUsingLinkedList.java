class StackUsingLinkedList{
	StackNode top;
	StackNode bottom;

	

	public void push(int data){
		StackNode sNode = new StackNode(data);
		if(bottom == null){
			bottom = top =sNode;
		} else {
			top.next = sNode;
			top = top.next;
		}
	}

	public void pop(){
		if(bottom == null){
			System.out.println("No element in a Stack");
		} else {
			StackNode current = bottom;
			while(current.next.next != null) {
				current = current.next;
			}
			top = current;
		}
	}

	public void showStack(){
		if(bottom == null){
			System.out.println("No element in a Stack");
		} else {
			StackNode current = bottom;
			while(current != top.next){
				System.out.println(current.data);
				current = current.next;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.showStack();

		stack.push(20);
		stack.showStack();

		stack.push(30);
		stack.showStack();

		stack.pop();
		stack.showStack();

		stack.push(40);
		stack.showStack();
		
		
		

	}
	
}