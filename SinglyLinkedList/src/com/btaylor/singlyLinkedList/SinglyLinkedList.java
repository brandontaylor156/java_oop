package com.btaylor.singlyLinkedList;

public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		head = null;
	}
	
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
	
	public void removeAt(int index) {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		
		if (index == 0) {
			if (head != null && head.next == null) 
				head = null;
			else 
				head = head.next;
			
			return;
		}
		
		try {
			Node runner = head;
			int count = 1;
			while(runner != null) {
				if (count == index) {
					runner.next = runner.next.next;
				}
				count++;
				runner = runner.next;
				}
			} catch (NullPointerException e) {
				System.out.println("Out of bounds");
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
