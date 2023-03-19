package Homework;

public class myList {

	Node head;
	Node tail;
	public class Node{
		int value;
		Node nextNode;
		Node prevNode;
	}

	public void reverse(){
		Node currentNode = this.head;
		while(currentNode != null){
			Node nextNode = currentNode.nextNode;
			Node prevNode = currentNode.prevNode;
			currentNode.nextNode = prevNode;
			currentNode.prevNode = nextNode;
			if (currentNode.nextNode == null){
				this.tail = currentNode;
			}
			if (currentNode.prevNode == null){
				this.head = currentNode;
			}
		}
	}
}
