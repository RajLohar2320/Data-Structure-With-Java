package com.demo.beans;

public class BinarySearchTree {
	private Node root;
	class Node {
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public BinarySearchTree() {
		this.root = null;
	}
	public void insert(int data) {
		root = insertrec(root,data);
	}
	private Node insertrec(Node root, int data) {
		if(root == null)
			root = new Node(data);
		else if(data < root.data)
			root.left = insertrec(root.left,data);
		else
			root.right = insertrec(root.right, data);
		return root;
	}
	public void preOrder() {
		preorder(root);
	}
	public void inOrder() {
		inorder(root);
	}
	public void postOrder() {
		postorder(root);
	}
	public void preorder(Node root) {
		if(root != null) {
			System.out.print(root.data+"  ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data+"  ");
			inorder(root.right);
		}
	}
	public void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+"  ");
		}
	}
}
