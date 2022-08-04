package com.btaylor.doublyLinkedList;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	
	public void printValuesForward() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void printValuesBackward() {
		Node current = this.tail;
		while(current != null){
			System.out.println(current.value);
			current = current.previous;
		}
	}
	
	// Last node and second to last node! Draw it out
	public Node pop() {
		Node lastNode = this.tail;
		Node secondLastNode = this.tail.previous;
		lastNode.previous = null;
		secondLastNode.next = null;
		this.tail = secondLastNode;
		return lastNode;
	}
	
	public boolean contains(Integer value) {
		Node current = this.head;
		while(current != null) {
			if (current.value == value)
				return true;
			current = current.next;
		}
		return false;
	}
	
	public int size() {
		Node current = this.tail;
		int count = 0;
		while(current != null) {
			count++;
			current = current.previous;
		}
		return count;
	}
	
	public void insertAt(Node newNode, int index) {
		if (index == 0) {
			if (this.head ==  null) {
				this.head = newNode;
			}
			else {
				this.head.previous = newNode;
				newNode.next = this.head;
				this.head = newNode;
			}
			return;
		}
		
		Node current = this.head;
		int count = 1;
		while(current.next != null) {
			if (count == index) {
				newNode.next = current.next;
				current.next.previous = newNode;
				current.next = newNode;
				newNode.previous = current;
				return;
			}
			count++;
			current = current.next;
		}
		push(newNode);
		}
	
	public void removeAt(int index) {
		if (this.head == null)
			return;
		
		if (index == 0) {
			Node firstNode = this.head;
			Node secondNode = this.head.next;
			secondNode.previous = null;
			firstNode.next = null;
			this.head = secondNode;
			return;
		}
		
		Node current = this.head;
		int count = 1;
		while(current.next != null) {
			if (count == index) {
				Node firstNode = current;
				Node secondNode = current.next;
				firstNode.next = secondNode.next;
				secondNode.next.previous = firstNode;
				secondNode.next = null;
				secondNode.previous = null;
				return;
			}
			count++;
			current = current.next;
		}
		
	}
}


