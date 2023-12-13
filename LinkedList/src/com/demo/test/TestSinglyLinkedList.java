package com.demo.test;
import java.util.Scanner;
import com.demo.beans.*;
public class TestSinglyLinkedList {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		int choice, val, pos;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Add In Position");
			System.out.println("4. Display List");
			System.out.println("5. Delete First");
			System.out.println("6. Delete By Value");
			System.out.println("7. Delete By Position");
			System.out.println("Enter Choice : ");
			choice = Sc.nextInt();
			
			switch(choice) {
			case 0: 
				System.exit(0);
				
			case 1:
				System.out.println("Enter Value : ");
				val = Sc.nextInt();
				list.addFirst(val);
				break;
				
			case 2:
				System.out.println("Enter Value : ");
				val = Sc.nextInt();
				list.addLast(val);
				break;
			
			case 3:
				System.out.println("Enter Value : ");
				val = Sc.nextInt();
				System.out.println("Enter Position : ");
				pos = Sc.nextInt();
				list.addInPos(pos, val);
				break;
				
			case 4:
				list.display();
				break;
				
			case 5:
				val = list.delFirst();
				if(val == -1)
					System.out.println("List is Empty !!");
				else
					System.out.println(val+" Deleted From List.");
				break;
				
			case 6:
				System.out.println("Enter Value to Delete Node : ");
				val = Sc.nextInt();
				val = list.delByValue(val);
				if(val == -1)
					System.out.println("List is Empty !!");
				else 
					System.out.println(val+" Deleted From List.");
				break;
				
			case 7:
				System.out.println("Enter Position to Delete Node : ");
				pos = Sc.nextInt();
				val = list.delByValue(pos);
				if(val == -1)
					System.out.println("List is Empty !!");
				else 
					System.out.println(val+" Deleted From List.");
				break;
				
			default:
				System.out.println("Invalid Choice..");		
			}		
		}while(choice != 0);
		Sc.close();
	}
}
