package com.learning;

class Node<V> {
	Node<V> next;
	V val;
	
	public Node(Node<V> next,V val) {
		this.next = next;
		this.val = val;
	}
}
public class SinglyLinkedList<V> {
	
	Node<V> header = null;
	
	public void add(V val) {
		Node<V> node = header;
		if(header == null)
			header = new Node<V>(null,val);
		else {
			while(node.next!=null) {
				node = node.next;
			}
			node.next = new Node<V>(null,val);
		}
	}
	
	public void display() {
		Node<V> node = header;
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	public Node<V> reverse() {
		Node<V> previous = null;
		Node<V> node = header;
		Node<V> next = null;
		while(node!=null) {
			next = node.next;
			node.next = previous;
			previous = node;
			node = next;
		}
		return previous;
		
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		singlyLinkedList.add(5);
		singlyLinkedList.add(10);
		singlyLinkedList.add(15);
		singlyLinkedList.display();
		singlyLinkedList.reverse();
		singlyLinkedList.display();
	}
}
