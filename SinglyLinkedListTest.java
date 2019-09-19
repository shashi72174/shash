package com.lambajava8examples;


class SinglyLinkedList<E> {
	private Node head = null;
	private int size = 0;
	
	class Node {
		E e;
		Node next;
		
		Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}
		
		Node(Node next) {
			this.next = next;
		}
	}
	
	/*
	 * public void add(E e) { if(head == null) head = new Node(e,null); else { Node
	 * current = head; while(current.next!=null) { current = current.next; }
	 * current.next = new Node(e,null);
	 * 
	 * }
	 * 
	 * }
	 */
	
	public void add(E e) {
		if(head == null)
			head = new Node(e,null);
		else {
			Node temp = new Node(e,null);
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = temp;
			size++;
		}	
		
	}
	
	public void display() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.e);
			current = current.next;
		}
	}
	
	public void reverseDisplay() {
		Node prev = null,next = null;
		Node current = head;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		//copy prev to some other node variable and iterate that new variable to display content
		display();
		
	}
	
	public E get(int pos) {
		Node current = head;
		int index = 0;
		if(pos == index)
			return current.e;
		while(pos!=index) {
			current = current.next;
			index++;
		}
		index = 0;
		return current.e;
		
	}
	
	public void delete(int pos) {
		Node current = head;
		Node prev = null;
		int index = 0;
		if(pos == index)
			head = current.next;
		else {
			while(pos!=index) {
				prev = current;
				current = current.next;
				index++;
			}
			prev.next = current.next;
			index = 0;
		}
			
	}
	
}


public class SinglyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		//linkedList.reverseDisplay();
		System.out.println(linkedList.get(1));
		//linkedList.display();
		//linkedList.display();
		linkedList.delete(1);
		
	}

}
