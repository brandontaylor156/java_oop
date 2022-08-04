package com.btaylor.singlyLinkedList;

public class ListTester {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(3);
		sll.add(0);
		sll.add(8);
		sll.removeAt(0);
		sll.removeAt(0);
		sll.printValues();
	}

}
