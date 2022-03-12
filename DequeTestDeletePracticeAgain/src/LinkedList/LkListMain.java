package LinkedList;

public class LkListMain {
	Node head;
	public static class Node
	{
		Node next;
		int data;
		public Node( int data)
		{
			this.next = null;
			this.data = data;
		}
	}
	
	public Node add(Node headPassed , int dataPassed)
	{
		Node newNode = new Node(dataPassed);
		if(headPassed == null)
		{
			headPassed = newNode;
		}
		else
		{
			Node current = headPassed;
			while(current.next!=null)
			{
				current= current.next;
			}
			current.next=newNode;
		}
		return headPassed;
	}
	
	public static void printAllNodes(Node headPassed)
	{

		if(headPassed==null)
			return;
		else
		{
			Node current = headPassed;
			while(current.next!=null)
			{
				System.out.println(current.data);
				current= current.next;
			}
			System.out.println(current.data);
		}
	}
	public static Node reverse_Iterative(Node headPassed)
	{
		Node current= headPassed;
		Node previous = null;
		Node next= headPassed;
		while(current!=null)
		{
			next = current.next;
			current.next= previous; 
			previous=current;
			current=next;
			
			
		}
		return previous;
		
	}
	public static void main(String[] args) {
		LkListMain obj = new LkListMain();
		Node head1=obj.head;
		
		obj.head = obj.add(obj.head, 1);
		obj.head = obj.add(obj.head, 3);
		obj.head = obj.add(obj.head, 4);
		obj.head = obj.add(obj.head, 5);
		printAllNodes(obj.head);
		System.out.println();
		System.out.println("Yo");
		System.out.println();
		obj.head=obj.reverse_Iterative(obj.head);
		printAllNodes(obj.head);
		
	}

}
