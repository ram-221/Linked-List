package com.bridgelab.linkedlistuc9;

public class MyNodeTest {

	public static void main(String[] args) {
		giveElementFindKeyNode30AndInsert40After30ShouldPassLinkedListResult();
	}

	public static void giveElementFindKeyNode30AndInsert40After30ShouldPassLinkedListResult() {
		Node<Integer> firstNumberNode = new Node<Integer>(56);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(70);
		Node<Integer> newNode = new Node<Integer>(40);
		MyNode myNode = new MyNode();
		myNode.add(firstNumberNode);
		myNode.append(thirdNumberNode);
		myNode.insert(firstNumberNode, secondNumberNode);
		myNode.printNodes();
		boolean result = myNode.head.equals(firstNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				&& myNode.tail.equals(thirdNumberNode);
		System.out.println(result);

		// searching 30 in linked list
		INode getNode = myNode.searchNode();
		System.out.println("Search key : " + getNode.getKey());
		boolean found = getNode.equals(secondNumberNode);
		System.out.println(found);

		// inserting 40 after 30 .
		myNode.insert(getNode, newNode);
		System.out.println("After inserting 40 in linked list");
		myNode.printNodes();
		boolean finalResult = myNode.head.equals(firstNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				&& myNode.head.getNext().getNext().equals(newNode) && myNode.tail.equals(thirdNumberNode);
		System.out.println(finalResult);

		// remove element 40.
		myNode.removeNode(40);
		System.out.println("Linked list after deleting 40 ");
		myNode.printNodes();

		// print size of Linked list.
		System.out.println(myNode.size());
		boolean result1 = myNode.head.equals(firstNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				&& myNode.tail.equals(thirdNumberNode);
		System.out.println(result1);

	}
}
