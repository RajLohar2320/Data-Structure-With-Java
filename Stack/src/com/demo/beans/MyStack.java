package com.demo.beans;

import java.util.Arrays;

public class MyStack {
	private int top;
	private int size;
	private int [] arr;
	public MyStack() {
		this.top = -1;
		this.size = 6;
		this.arr = new int[size];
	}
	public MyStack(int size) {
		this.top = -1;
		this.size = size;
		this.arr = new int[this.size];
	}
	private boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
	}
	private boolean isFull() {
		if(top == this.size-1)
			return true;
		return false;
	}
	public boolean push(int data) {
		if(isFull())
			return false;
		else {
			top++;
			this.arr[top] = data;
			return true;
		}
	}
	public int pop() {
		if(isEmpty())
			return -1;
		else {
			int data = this.arr[top];
			this.arr[top] = 0;
			top--;
			return data;
		}
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
}
