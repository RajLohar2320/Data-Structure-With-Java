package com.demo.test;
import java.util.Scanner;
public class LinearSearch {
	// Storing Elements in Array
	private static void acceptData(int[] arr) {
		Scanner Sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = Sc.nextInt();
		}
	}
	
	// Display Content of Array
	private static void displayData(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	// Search Data in Array
	private static int Search(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key)
				return i+1;
		}
		return -1;
	}
	
	// Driver Code
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = Sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter Elements of Array : ");
		acceptData(arr);
		System.out.println("Enter Key to Find : ");
		int key = Sc.nextInt();
		displayData(arr);
		int pos = Search(arr,key);
		if(pos != -1)
			System.out.println("Element if Present At "+pos);
		else
			System.out.println("Element Not Present ");
		Sc.close();
	}	
}
