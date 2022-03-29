package com.tyss.linkedlist;
import java.io.*;
public class Linkedlist {
	

		Node head; 
		static class Node {

			int data;
			Node next;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}

	
		public static void insert(Linkedlist list, int data)
		{
			Node new_node = new Node(data);
			new_node.next = null;

			if (list.head == null) {
				list.head = new_node;
			}
			else {
				
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}

				last.next = new_node;
			}

			
			
		}

		
		public static void printList(Linkedlist list)
		{
			Node currNode = list.head;
			System.out.print("LinkedList: ");
		
			while (currNode != null) {
				System.out.print(currNode.data + " ");
				currNode = currNode.next;
			}
		}
		
		public static void main(String[] args)
		{
		
			Linkedlist list = new Linkedlist();

			insert(list, 1);
			insert(list, 2);
			insert(list, 3);
			insert(list, 4);
			insert(list, 8);
			insert(list, 6);
			 insert(list, 7);
			 insert(list, 8);

			
			printList(list);
		}

		
	}


