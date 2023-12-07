package com.demo.test;

import java.util.Scanner;

public class SelectionSort {
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
	
	// Sort Elements of Array
	private static void Sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min_ind = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min_ind])
					min_ind = j;
			}
			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
		}
	}
	// Driver Code
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = Sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter Elements of Array : ");
		acceptData(arr);
		System.out.println("Array Before Sort : ");
		displayData(arr);
		Sort(arr);
		System.out.println("Array After Sort : ");
		displayData(arr);
		Sc.close();
	}
}
