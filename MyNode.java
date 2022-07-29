package com.bridgelab.linkedlistuc9;
import java.util.Scanner;

public class MyNode<K> {
	public INode head;
	public INode tail;

	public MyNode() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode temp = this.head;
			this.head = newNode;
			head.setNext(temp);
		}
	}

	public void append(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode temp = this.head;
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insert(INode myNode, INode myNewNode) {
		INode temp = myNode.getNext();
		myNode.setNext(myNewNode);
		myNewNode.setNext(temp);
	}

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	public INode popMiddleNode() {
		INode temp = head;
		if (temp.getNext() != null) {
			temp = temp.getNext();
		}
		this.tail = temp;
		head.getNext().setNext(null);
		return temp;
	}
	
	public INode searchNode() {
		System.out.println("enter the key to search node");
		Scanner scanner = new Scanner(System.in);
		int searchValue  = scanner.nextInt();
		INode temp = head;
		while(!temp.getKey().equals(searchValue) ) {
			temp = temp.getNext();
		}
		return temp;
	} 
	public void removeNode(int value) {
		INode node = head;
		INode previous = null;
		while (!node.getKey().equals(value)) {
			previous = node;
			node = node.getNext();
		}
		previous.setNext(node.getNext());
	}
	
	public int size() {
		INode node = head;
		int count = 1;
		while (node.getNext() != null) {
			count = count + 1;
			node = node.getNext();
		}
		return count;
	}
	

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes :");
		INode temp = head;
		while (temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if (!temp.equals(tail))
				myNodes.append("->");
			temp = temp.getNext();
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);
	}

}
