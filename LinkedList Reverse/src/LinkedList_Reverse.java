//JAVA 11
public class LinkedList_Reverse {
	Node head;
	public static void insert(Node head ,int data)
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
	
	public static void print(Node head)
	{
		if(head==null)
		{
			return;
		}
		else {
			Node temp= head;
			
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	public static void reverse_Iterative(Node head)
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
	
	public static void removeDuplicatesSortedList(Node head )
	{
		Node nextwa=head.next;
		Node currentwa=head;
		while(nextwa!=null)
		{
			if(currentwa.data==nextwa.data)
			{
				currentwa.next=nextwa.next;
			//	currentwa=nextwa;
				nextwa=nextwa.next;
			}
			else {
				
				currentwa=nextwa;
				nextwa=nextwa.next;
			}
		}
	}
	
	
	public static void main(String[] args) {

		LinkedList_Reverse obj= new LinkedList_Reverse();
		LinkedList_Reverse.insert(obj.head,1);
		LinkedList_Reverse.insert(obj.head,2);
		LinkedList_Reverse.insert(obj.head,2);
		LinkedList_Reverse.insert(obj.head,2);
		LinkedList_Reverse.insert(obj.head,2);
		LinkedList_Reverse.insert(obj.head,3);
		LinkedList_Reverse.insert(obj.head,3);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,4);
		LinkedList_Reverse.insert(obj.head,5);
		LinkedList_Reverse.insert(obj.head,5);
		LinkedList_Reverse.insert(obj.head,5);
		LinkedList_Reverse.insert(obj.head,5);
		LinkedList_Reverse.print(obj.head);
		System.out.println();
		LinkedList_Reverse.removeDuplicatesSortedList(obj.head);
		LinkedList_Reverse.print(obj.head);
		System.out.println();
		//LinkedList_Reverse.reverse_Iterative();
		//LinkedList_Reverse.print();
		
		
		
	}

}
