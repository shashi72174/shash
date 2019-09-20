package test1;

class DoublyLinkedList<E> {
	//private Node header = new Node(null, null, null);
	private Node header = null;
	private int size = 0;

	public DoublyLinkedList() {
		this.header = new Node(null,null,null);
	}

	class Node {
		E e;
		Node next;
		Node previous;

		Node(E e, Node next, Node previous) {
			this.e = e;
			this.next = next;
			this.previous = previous;
		}
	}

	/*public void add(E e) {
		Node temp = new Node(e, header, header.previous);
		temp.previous.next = temp;
		temp.next.previous = temp;
		size++;

	}*/
	
	public void add(E e) {
		Node temp = new Node(e,null,null);
		if(header == null) {
			header.next = temp;
		}else {
			while(header.next!=null) {
				header = header.next;
			}
			
		}
		temp.previous = header;
		header.next = temp;
		header = header.next;
	}

	public void display() {
		Node current = header;
		while(current.previous!=null) {
			current = current.previous;
		}
		current = current.next;
		while (current != null) {
			System.out.println(current.e);
			current = current.next;
		}
	}

	public E get(int pos) {
		int index = 0;
		Node current = header;
		if (pos == index)
			return current.e;
		else {
			while (pos != index) {
				current = current.next;
				index++;
			}
		}
		index = 0;
		return current.e;
	}
}

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.add(10);
		doublyLinkedList.add(20);
		doublyLinkedList.add(30);
		doublyLinkedList.add(40);
		doublyLinkedList.add(50);
		doublyLinkedList.display();
		doublyLinkedList.display();
		//System.out.println(doublyLinkedList.get(1));
	}

}
