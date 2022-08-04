package com.btaylor.singlyLinkedList;

public class ListTester {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(3);
		sll.add(0);
		System.out.println(sll.find(8));
		sll.removeAt(1);
		sll.removeAt(0);
		sll.printValues();
	}

}
