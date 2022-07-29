package com.bridgelab.linkedlistuc10;
import com.bridgelab.linkedlistuc10.Node;

public class MyNode {

	private INode head;

	MyNode() {
		head = null;
	}

	public void insert(int data) {
		INode newNode = new Node(data);
		INode current = head;
		INode previous = null;
		while (current != null && data > current.getKey()) {
			previous = current;
			current = current.getNext();
		}
		if (previous == null) {
			head = newNode;
		} else {
			previous.setNext(newNode);
			;
		}
		newNode.setNext(current);
	}

	public void displayList() {
		INode current = head;
		while (current != null) {
			System.out.print(current.getKey() + " ");
			current = current.getNext();
		}
	}
}
