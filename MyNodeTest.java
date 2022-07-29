package com.bridgelab.linkedlistuc5;

public class MyNodeTest {

	private static final boolean isExist = false;

	public static void main(String[] args) {
		given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult();
	}

	public static void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		Node<Integer> firstNumberNode = new Node<Integer>(56);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(70);
		MyNode myNode = new MyNode();
		myNode.add(firstNumberNode);
		myNode.append(thirdNumberNode);
		myNode.insert(firstNumberNode, secondNumberNode);
		myNode.printNodes();
		boolean result = myNode.head.equals(firstNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				&& myNode.tail.equals(thirdNumberNode);
		myNode.pop();
		System.out.println("Linked List after deleting first element");
		myNode.printNodes();
		System.out.println(result);
		
		
	}

}
