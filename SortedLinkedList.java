package com.bridgelab.linkedlistuc10;

public class SortedLinkedList {

	public static void main(String[] args) {
		CreateSortedLinkedList();
	}

	public static void CreateSortedLinkedList() {
		MyNode linkedList = new MyNode();
		linkedList.insert(56);
		linkedList.insert(58);
		linkedList.insert(41);
		linkedList.insert(30);
		linkedList.insert(50);
		linkedList.insert(4);
		linkedList.insert(70);
		System.out.println("After insertions--");
		linkedList.displayList();
	}
}
