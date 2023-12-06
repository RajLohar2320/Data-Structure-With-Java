package com.demo.test;
import java.util.Scanner;
public class BinarySearchRecursive {
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
	private static int Search(int[] arr, int key, int low, int high) {
		if(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]==key)
				return mid+1;
			else if(key<arr[mid])
				return Search(arr, key, low, mid-1);
			else 
				return Search(arr, key, mid+1, high);
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
		int pos = Search(arr, key, 0, arr.length-1);
		if(pos != -1)
			System.out.println("Element if Present At "+pos);
		else
			System.out.println("Element Not Present ");
		Sc.close();
	}

}
