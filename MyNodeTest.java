package com.bridgelab.linkedlistuc2;

public class MyNodeTest {

	public static void main(String[] args) {

		Node<Integer> firstNumberNode = new Node<Integer>(70);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(56);
		MyNode myNode = new MyNode();
		myNode.add(firstNumberNode);
		myNode.add(secondNumberNode);
		myNode.add(thirdNumberNode);
		myNode.printNodes();

		boolean result = myNode.head.equals(thirdNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				&& myNode.tail.equals(firstNumberNode);
		System.out.println(result);
	}
}
