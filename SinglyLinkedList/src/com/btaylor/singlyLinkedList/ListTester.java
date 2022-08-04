package com.btaylor.singlyLinkedList;

public class ListTester {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(3);
		sll.add(0);
		sll.add(5);
		sll.add(70);
		sll.add(8);
		sll.removeAt(78);
		sll.printValues();
	}

}
