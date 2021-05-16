
public class LinkedList_Reverse {
	static Node head;
	public static void insert(int data)
	{
		if(head==null)
		{
			head = new Node();
			head.data=data;
		}
		else {
			Node temp=head;
			Node new_node = new Node();
			new_node.data=data;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next=new_node;
			
			
		}
	}
	
	public static void print()
	{
		if(head==null)
		{
			return;
		}
		else {
			Node temp=head;
			
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	public static void reverse_Iterative()
	{
		Node next=head;
		Node prev=null;
		Node currentOne=head;
		while(currentOne!=null)
		{
			next=currentOne.next;
			currentOne.next=prev;
			prev=currentOne;
			currentOne=next;
		}
		head=prev;
	}
	
	public static void reverse_Recursive(Node curr)
	{
		
	}
	
	public static void main(String[] args) {

		LinkedList_Reverse.insert(2);
		LinkedList_Reverse.insert(3);
		LinkedList_Reverse.insert(4);
		LinkedList_Reverse.insert(5);
		LinkedList_Reverse.print();
		System.out.println();
		LinkedList_Reverse.reverse_Iterative();
		LinkedList_Reverse.print();
		
		
		
	}

}
