package Deque;
import java.util.*;
import java.lang.*;
import java.io.*;
public class mainClass {
	Node head;
	Node tail;
	

	public static class Node {
		Node prev;
		int data;
		Node next;
		public  Node(Node prev , int data , Node next)
		{
			this.prev = prev;
			this.data = data;
			this.next= next;
			
		}
	}
	
	
	public static ArrayList<Node> insertStart(Node headPassed ,Node tailPassed ,int dataPassed)
	{
		ArrayList<Node> arrlst= new ArrayList<Node>();
		Node newNode= new Node(null,dataPassed ,null);
		if(headPassed==null)
		{
			tailPassed=newNode;
			
			
		}
	
		else {

			
			
			headPassed.prev= newNode;
			newNode.next=headPassed;
			
			

		}
		headPassed=newNode;
		arrlst.add(headPassed);
		arrlst.add(tailPassed);
		return arrlst;
	}
	public static void print(Node headPassed )
	{
		Node curr = headPassed;
		if(curr==null)
		{
			return;
		}
		while(curr.next!=null)
		{
			System.out.println(curr.data);
			
			curr=curr.next;
		}
		System.out.println(curr.data);
		
	}
	 public static void main(String[] args) {
		 //Node head =null;
		 mainClass obj = new mainClass();
	//	 obj.head=
		//		 mainClass.insertStart(obj.head,obj.tail,2);
		// obj.head=
		//		 mainClass.insertStart(obj.head,3);
//		 mainClass.insert(head,1);
//		 mainClass.insert(head,2);
//		 mainClass.insert(head,3);
//		 mainClass.insert(head,4);
		 print(obj.head);
		 
		 ArrayList<Node> lst = mainClass.insertStart(obj.head,obj.tail,5);
		 obj.head=		lst.get(0);	
		 obj.tail=		lst.get(1);
		 
		 lst = insertStart(obj.head,obj.tail,4);
		 obj.head=		lst.get(0);	
		 obj.tail=		lst.get(1);	 
		 
		 lst = insertStart(obj.head,obj.tail,3);
		 obj.head=		lst.get(0);	
		 obj.tail=		lst.get(1);	 
		 
		 lst = insertStart(obj.head,obj.tail,2);
		 obj.head=		lst.get(0);	
		 obj.tail=		lst.get(1);	 
		 
		 lst = insertStart(obj.head,obj.tail,1);
		 obj.head=		lst.get(0);	
		 obj.tail=		lst.get(1);	 
		 
		 print(obj.head);
	}
}
