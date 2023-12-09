package com.demo.test;
import java.util.Scanner;

import com.demo.beans.MyStack;
public class TestMyStack {

	public static void main(String[] args) {
		int choice;
		Scanner Sc = new Scanner(System.in);
		MyStack S = new MyStack(5);
		do {
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("Enter Choice : ");
			choice = Sc.nextInt();
			switch(choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("Enter Element : ");
				int val = Sc.nextInt();
				if(S.push(val))
					System.out.println(val+" Is Pushed in Stack");
				else
					System.out.println("Stack is Full");
				break;
			case 2:
				val = S.pop();
				if(val == -1)
					System.out.println("Stack is Empty");
				else
					System.out.println(val+" Is Poped From Stack");
				break;
			case 3:
				S.display();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=0);
		Sc.close();
	}

}
