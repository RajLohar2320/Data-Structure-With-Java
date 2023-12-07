package com.demo.test;

import java.util.Scanner;

public class MergeSort {
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
			int mid = (start+end)/2;
			Sort(arr, start, mid);
			Sort(arr, mid+1, end);
			merge(arr, start, end, mid);
		}
	}
	private static void merge(int[] arr, int start, int end, int mid) {
		int i, j, k;
		int n1 = mid-start+1;
		int n2 = end-mid;
		int [] l_arr = new int[n1];
		int [] r_arr = new int[n2];
		for(i=0; i<n1; i++) {
			l_arr[i] = arr[start+i];
		}
		for(i=0; i<n2; i++) {
			r_arr[i] = arr[mid+1+i];
		}
		i = 0;
		j = 0;
		k = start;
		while(i<n1 && j<n2) {
			if(l_arr[i] < r_arr[j]) {
				arr[k] = l_arr[i];
				i++;
			}
			else {
				arr[k] = r_arr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = l_arr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = r_arr[j];
			j++;
			k++;
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
		Sort(arr, 0, arr.length-1);
		System.out.println("Array After Sort : ");
		displayData(arr);
		Sc.close();
	}

}
