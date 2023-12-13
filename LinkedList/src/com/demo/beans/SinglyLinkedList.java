package com.demo.beans;

public class SinglyLinkedList {
	private Node head;
	class Node {
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public SinglyLinkedList()
	{
		this.head = null;
	}
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		if(temp == null)
			head = newNode;
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	public void addInPos(int pos, int data) {
		Node newNode = new Node(data);
		if(head == null && pos != 1)
			System.out.println("List is Empty !!");
		else if(head == null)
			head = newNode;
		else {
			Node prev = head;
			int i=1;
			while(i<pos-1 && prev != null) {
				prev = prev.next;
				i++;
			}
			if(prev != null) {
				newNode.next = prev.next;
				prev.next = newNode;
			}
			else
				System.out.println("Wrong Position !!");
		}
	}
	public int delFirst() {
		Node temp = head;
		if(temp == null)
			return -1;
		else {
			int data = head.data;
			head = head.next;
			temp = null;
			return data;
		}
	}
	public int delByPos(int pos) {
		int val;
		if(head == null)
			return -1;
		else if(pos == 1){
			val = head.data;
			head = null;
			return val;
		}
		else {
			Node prev = head;
			Node cur = prev.next;
			for(int i=1; i<pos-1 && cur != null; i++) {
				prev = prev.next;
				cur = cur.next;
			}
			if(cur != null) {
				val = cur.data;
				prev.next = cur.next;
				cur = null;
				return val;
			}
			else
				return -1;
		}
	}
	public int delByValue(int val) {
		if(head == null)
			return -1;
		else {
			if(head.data == val) {
				Node temp = head;
				head = head.next;
				temp = null;
			}
			else {
				Node prev = head;
				Node cur = prev.next;
				while(cur.data != val && cur != null) {
					prev = prev.next;
					cur = cur.next;
				}
				if(cur != null) {
					prev.next = cur.next;
					cur = null;
				}
			}
			return val;
		}
	}
//	public int delLast() {
//		Node trav = head;
//		if(trav == null)
//			return -1;
//		else {
//			int data;
//			Node temp;
//			while(trav.next != null) {
//				trav = trav.next;
//			}
//			temp = trav.next;
//			data = temp.data;
//			trav.next = null;
//			temp = null;
//			return data;
//		}
//	}
	public void display()
	{
		Node temp = head;
		if(temp == null)
			System.out.println("List is Empty !!");
		else {
			while(temp != null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
