import java.util.LinkedList;
class MyLinkedList{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		// Adding elements to the linked list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("List  : " + list);
		System.out.println("Size of list " + list.size());

		System.out.println("Get element at position 2 : " + list.get(2));
		list.set(2, 90);
		System.out.println("Set element at position 2 -> List : " +list);

		// Removing elements from the linked list
		list.remove(3);
		System.out.println("After Removing element at position 3 -> List  : " + list);
		list.removeFirst();
		System.out.println("After Removing First element -> List  : " + list);
		list.removeLast();
		System.out.println("After Removing Last element -> List  : " + list);
		System.out.println("List contains 10 : " + list.contains(10));
		System.out.println("List  : " + list);

	
	}
}