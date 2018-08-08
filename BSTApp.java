package com.newitem;

class Node<V extends Comparable<V>> {
	V value;
	Node<V> left;
	Node<V> right;

	Node(V value, Node<V> left, Node<V> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int compareTo(V o) {
		// TODO Auto-generated method stub
		return value.compareTo(o);
	}
}

class BST<V extends Comparable<V>> {
	Node<V> parent = null;

	public Node<V> insert(Node<V> root, V value) {
		if (root == null) {
			return createNewNode(root, value);
		}
		if (root.value.compareTo(value) > 0)
			root.left = insert(root.left, value);
		else
			root.right = insert(root.right, value);

		return root;
	}

	private Node<V> createNewNode(Node<V> root, V value) {
		return new Node<V>(value, null, null);
	}

	public Node<V> search(Node<V> root, V searchValue) {
		if (root == null)
			return null;

		if (root.value.compareTo(searchValue) == 0)
			return root;

		if (root.value.compareTo(searchValue) > 0)
			return search(root.left, searchValue);
		else
			return search(root.right, searchValue);

	}

	public Node<V> delete(Node<V> root, V val) {
		// delete as per the rules of BST
		Node<V> child = null;
		if (root == null)
			return null;

		if (root.value.compareTo(val) == 0) {
			// case1 --- Node to be removed has no children then remove node
			if (root.left == null && root.right == null) {
				if (val.compareTo(parent.value) > 0)
					parent.right = null;
				else
					parent.left = null;
				return root;
			}
			// case2 --- Node to be removed has one left child
			else if ((root.left != null && root.right == null)) {
				child = root.left;
				if (child.value.compareTo(parent.value) > 0)
					parent.right = child;
				else
					parent.left = child;
				return root;
			}
			// case 2 --- Node to be removed has one right child
			else if (root.left == null && root.right != null) {
				child = root.right;
				if (child.value.compareTo(parent.value) > 0)
					parent.right = child;
				else
					parent.left = child;
				return root;
			}
			// case 3 --- Node to be removed is having both left and right
			// children
			else if (root.left != null && root.right != null) {
				// 2 ways to do this
				// 1st way --- find minimum value from right subtree or
				// 2nd way --- find maximum value from left subtree --- based
				// upon selection of between 1st and 2nd way
				// the resultant outcome will be different
				// lets go with first approach -- finding minimum from right
				// subtree from deleting node
				// so minimum will always be child nodes of the right subtree.

				Node<V> node = root;
				Node<V> temp = node;
				node = null;
				if (root.right.left == null) {
					root.value = root.right.value;
					root.right = root.right.right;
				} else {
					Node<V> n = minValue(root.right);
					root.value = n.value;

				}
				return node;
			}
		}

		if (root.value.compareTo(val) > 0) {
			parent = root;
			return delete(root.left, val);
		} else {
			parent = root;
			return delete(root.right, val);
		}
	}

	public Node<V> minValue(Node<V> node) {
		if (node.left != null) {
			return minValue(node.left);
		}
		return node;
	}
}

public class BSTApp<V extends Comparable<V>> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		BST<Integer> bst = new BST<Integer>();
		Node<Integer> root = null;

		// insert few nodes into BST
		root = bst.insert(root, 8);
		root = bst.insert(root, 3);
		root = bst.insert(root, 10);
		root = bst.insert(root, 1);
		root = bst.insert(root, 2);
		root = bst.insert(root, 5);
		root = bst.insert(root, 4);
		root = bst.insert(root, 6);
		root = bst.insert(root, 7);
		root = bst.insert(root, 14);
		root = bst.insert(root, 13);

		// searh a node in BST

		Node<Integer> searchNode = bst.search(root, 6);
		if (searchNode == null)
			System.out.println("Not found");
		else {
			System.out.println("Found");
			// System.out.println(searchNode.left.value + "\t" +
			// searchNode.right.value);
		}
		// delete a node from BST

		Node<Integer> deletedNode = bst.delete(root, 5);
		System.out.println(deletedNode);
		root = bst.insert(root, 20);
		System.out.println(System.currentTimeMillis());
	}

}