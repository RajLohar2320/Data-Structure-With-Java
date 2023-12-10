package com.demo.beans;

import java.util.Arrays;

public class MyQueue {
	private int front;
	private int rear;
	private int size;
	private int[] q_arr;
	public MyQueue() {
		this.front = 0;
		this.rear = -1;
		this.size = 6;
		this.q_arr = new int[this.size];
	}
	public MyQueue(int size) {
		this.front = 0;
		this.rear = -1;
		this.size = size;
		this.q_arr = new int[this.size];
	}
	private boolean isEmpty() {
		if(front>rear)
			return true;
		return false;
	}
	private boolean isFull() {
		if(rear == size-1)
			return true;
		return false;
	}
	public boolean insert(int data) {
		if(isFull())
			return false;
		else {
			rear++;
			q_arr[rear] = data;
			return true;
		}
	}
	public int remove() {
		if(isEmpty())
			return -1;
		else {
			int data = q_arr[front];
			q_arr[front] = 0;
			front++;
			return data;
		}
	}
	public void display() {
		System.out.println(Arrays.toString(q_arr));
	}
}
