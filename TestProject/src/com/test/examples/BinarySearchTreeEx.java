package com.test.examples;

public class BinarySearchTreeEx {

	
	public static boolean isBST(Node root, Node left, Node right) {
		
		if(root==null) {
			return true;
		}
		if(left!=null && left.data>=root.data) {
			return false;
		}
		if(right!=null && right.data<=root.data) {
			return false;
		}
		return isBST(root.left, left, root) && isBST(root.right, root, right);
		
		
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(6);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		if(isBST(root, null, null)) {
			System.out.println("BST");
		}
		else {
			System.out.println("Non BST");
		}

	}
	
	

}

class Node{
	
	int data;
	Node left, right;
	
	
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
