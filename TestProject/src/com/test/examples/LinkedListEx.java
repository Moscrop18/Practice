package com.test.examples;

public class LinkedListEx {
	
	Node head;

	public static void main(String[] args) {
		LinkedListEx list = new LinkedListEx();
		list.head= new Node(1);
		list.head.next= new Node(2);
		list.head.next.next= new Node(3);
		
		
		list.addAtBeg(6);
		//list.printList();
		list.addAtEnd(7);
		//list.printList();
		list.addRandom(list.head.next, 8);
		list.printList();
		

	}
	
	public  void printList() {
		Node node = head;
		while(node !=null) {
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
	
	 static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			 next= null;
		}
		
	}
	
	public void addAtBeg(int newData) {
		Node newNode = new Node(newData);
		newNode.next=head;
		head = newNode;
		
	}
	
	public void addAtEnd(int newData) {
		Node newNode = new Node(newData);
		newNode.next=null;
		
		if(head ==null) {
			head= new Node(newData);
			return;
		}
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		
		last.next=newNode;
		
	}
	
	public void addRandom(Node preNode, int newData) {
		Node newNode = new Node(newData);
		newNode.next=preNode.next;
		preNode.next=newNode;
		
	}
	


}


