package com.demo.test;
import com.demo.beans.*;
import java.util.Scanner;
public class TestBST {

	public static void main(String[] args) {
		int choice;
		Scanner Sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		do {
			System.out.println();
			System.out.println("0. Exit");
			System.out.println("1. Insert");
			System.out.println("2. Pre-Order");
			System.out.println("3. In-Order");
			System.out.println("4. Post-Order");
			System.out.println("Enter Choice : ");
			choice = Sc.nextInt();
			switch(choice) {
				case 0:
					System.exit(0);
				case 1:
					System.out.println("Enter Element : ");
					int val = Sc.nextInt();
					bst.insert(val);
					break;
				case 2:
					bst.preOrder();
					break;
				case 3:
					bst.inOrder();
					break;
				case 4:
					bst.postOrder();
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			}while(choice!=0);
			Sc.close();
		}
	}
