package com.bridgelab.linkedlistuc10;

public class Node implements INode {
	  private int key;
		private INode next;

		public Node(int key) {
			this.key = key;
			this.next = null;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public INode getNext() {
			return next;
		}

		public void setNext(INode next) {
			this.next = (Node) next;
		}

}
