package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		int choice;
		Scanner Sc = new Scanner(System.in);
		MyQueue mq = new MyQueue(5);
		do {
			System.out.println("0. Exit");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("Enter Choice : ");
			choice = Sc.nextInt();
			switch(choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("Enter Element : ");
				int val = Sc.nextInt();
				if(mq.insert(val))
					System.out.println(val+" Is Inserted in Queue");
				else
					System.out.println("Queue is Full");
				break;
				
			case 2:
				val = mq.remove();
				if(val == -1)
					System.out.println("Queue is Empty");
				else
					System.out.println(val+" Is Removed From Queue");
				break;
				
			case 3:
				mq.display();
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=0);
		Sc.close();

	}

}
