package com.test.examples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListReverseEx {

	 static Node1 head; 
	  
	    static class Node1 { 
	  
	        int data; 
	        Node1 next; 
	  
	        Node1(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	  
	    /* Function to reverse the linked list */
	    Node1 reverse(Node1 node) 
	    { 
	        Node1 prev = null; 
	        Node1 current = node; 
	        Node1 next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	        return node; 
	    } 
	  
	    public void printList() 
	    { 
	        Node1 tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	    } 
	  
	   
	    public static void main(String[] args) 
	    { 
	    	LinkedListReverseEx list = new LinkedListReverseEx(); 
	    	  
	         list.head = new Node1(1);
	         list.head.next = new Node1(2);
	         list.head.next.next = new Node1(3);
	   
	         //list.push(7); 
	         
	         list.reverse(head);
	         list.printList();
	    }
	    
	    
	    public void push(int new_data) 
	    { 
	        
	        Node1 new_node = new Node1(new_data); 
	  
	        new_node.next = head; 
	        head = new_node; 
	        
	    } 
}
