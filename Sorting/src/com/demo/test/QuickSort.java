package com.demo.test;
import java.util.Scanner;
public class QuickSort {
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
			
	// Sort Data in Array
	private static void Sort(int[] arr, int start, int end) {
		if(start<end) {
			int p = partion(arr, start, end);
			Sort(arr, start, p-1);
			Sort(arr, p+1, end);
		}
	}
	private static int partion(int[] arr, int start, int end) {
		int pivot = start;
		int i = start;
		int j = end;
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot] = temp;
		return j;
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
		Sort(arr, 0, arr.length-1);
		System.out.println("Array After Sort : ");
		displayData(arr);
		Sc.close();
	}
}

