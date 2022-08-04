package com.btaylor.singlyLinkedList;

public class ListTester {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(3);
		sll.add(0);
		sll.add(5);
		sll.add(70);
		sll.add(8);
		System.out.println("Found at index " + sll.find(8));
		sll.removeAt(5);
		sll.printValues();
	}

}
