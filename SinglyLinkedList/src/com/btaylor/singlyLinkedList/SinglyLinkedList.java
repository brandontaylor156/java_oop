package com.btaylor.singlyLinkedList;

public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		head = null;
	}
	
	// Add to end of list
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		}
		else {
			Node runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	
	// Remove from end of list
	public void remove() {
		if (head == null) 
			return;
		
		if (head != null && head.next == null) {
			head = null;
			return;
			}
			
		Node runner = head;
		while(runner.next.next != null) {
			runner = runner.next;
		}
		runner.next = null;
	}
	
	// Find value
	public int find(int value) {
		if (head == null) {
			System.out.println("Empty list");
			return -1;
		}
		
		Node runner = head;
		int index = 0;
		while(runner != null) {
			if (runner.value == value)
				return index;
			else {
				runner = runner.next;
				index++;
			}
		}
		System.out.println("Value not found");
		return -1;
	}
	
	// Check if list empty, then if index 0 (1 node vs more than 1), then start at index 1 with a runner and loop through
	public void removeAt(int index) {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		
		// If index is 0
		if (index == 0) {
			if (head != null && head.next == null) 
				head = null;
			else 
				head = head.next;
			
			return;
		}
		
		// Runner starts at first node but with start count of 1
		// We are removing the node at the position 1 above current position, (while RUNNER.NEXT)
		// runner.next = runner.next.next
		Node runner = head;
		int count = 1;
		
		// IMPORTANT: WHILE RUNNER.NEXT FOR REMOVAL AT INDEX
		while(runner.next != null) {
			if (count == index) {
				// runner.next.next will point to null if runner on second to last node, so no error
				runner.next = runner.next.next;
				return;
			}
			count++;
			runner = runner.next;
			}
		}
		
	
	
	public void printValues() {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		Node runner = head;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
}
