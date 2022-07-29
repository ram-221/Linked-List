package com.bridgelab.linkedlistuc2;

public class Node<K> implements INode<K> {
	private K key;
	private Node next;
		
	public Node(K key) {
		this.key = key;
		this.next = null; 
	}
		
	public K getKey() {
		return key;
	}
		
	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = (Node<K>) next;
	}	

}
