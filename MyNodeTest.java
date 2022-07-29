package com.bridgelab.linkedlist;

public class MyNodeTest {

	public static void main(String[] args) {
		givenNumbersWhenLinkedListPassedLinkedListTest();
	}
	public static  void givenNumbersWhenLinkedListPassedLinkedListTest() {

		MyNode<Integer> firstNumberNode = new MyNode<>(56);
		MyNode<Integer> secondNumberNode = new MyNode<>(30);
		MyNode<Integer> thirdNumberNode = new MyNode<>(70);
		firstNumberNode.SetNext(secondNumberNode);
		secondNumberNode.SetNext(thirdNumberNode);
		boolean result = firstNumberNode.getNext().equals(secondNumberNode) && secondNumberNode.getNext().equals(thirdNumberNode);
		System.out.println(result);
	}
}
