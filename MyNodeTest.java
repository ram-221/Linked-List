package com.bridgelab.linkedlistuc7;

public class MyNodeTest {

	public static void main(String[] args) {
		giveElementFindKeyNode30ShouldPassLinkedListResult();
	}

	public static void giveElementFindKeyNode30ShouldPassLinkedListResult(){
	        Node<Integer> firstNumberNode = new Node<Integer>(56);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(70);
		MyNode myNode = new MyNode();
		myNode.add(firstNumberNode);
		myNode.append(thirdNumberNode);
		myNode.insert(firstNumberNode,secondNumberNode);
		myNode.printNodes();
		boolean result = myNode.head.equals(firstNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				 && myNode.tail.equals(thirdNumberNode);
	    System.out.println(result);
		INode getNode = myNode.searchNode();
		System.out.println("Search key : "+getNode.getKey());
		boolean found = getNode.equals(secondNumberNode);
		System.out.println(found);
	}
}
