package merge2SortedLkListsPackage;

public class SortedLKLists {

	Node root;
	public static class Node
	{
		Node next;
		int data;
		public Node(Node node , int data)
		{
			this.next =  node ;
			this.data = data;
		}
	}
	
	public Node addNode(Node root , int data)
	{
		if(root ==null)
		{
			root = new Node(null,data);
		}
		else
		{
			Node tempNode = root;
			while(tempNode.next != null)
			{
				tempNode=  tempNode.next;
			}
			Node newNode = new Node(null,data);
			tempNode.next=newNode;
		}
		return root;
	}
	public Node merge2LinkedListsSorted(Node one , Node two)
	{
		Node res = null;
		Node OneTemp=one;
		Node TwoTemp= two;
		
		while(OneTemp!=null)
		{
			OneTemp = OneTemp.next;
			
		}
		
		while(TwoTemp!=null)
		{
			TwoTemp = TwoTemp.next;
			
		}
		OneTemp=one;
		TwoTemp= two;
		Node resCurrent;
		
		while(OneTemp!=null && TwoTemp != null)
		{
			if(OneTemp.data< TwoTemp.data)
			{
			
				res =addNode(res,OneTemp.data);
				OneTemp = OneTemp.next;
				
			}
			else
			{
				res =addNode(res,TwoTemp.data);
				TwoTemp = TwoTemp.next;
				
			}
		}
		
		while(OneTemp!=null)
		{
			res = addNode(res,OneTemp.data);
			OneTemp=OneTemp.next;
		}
	
	
		while(TwoTemp!=null)
		{
			res =addNode(res,TwoTemp.data);
			TwoTemp = TwoTemp.next;
		}
		
		return res;
	}
	public static void main(String[] args)
	{
		SortedLKLists obj1 = new SortedLKLists();
		SortedLKLists obj2 = new SortedLKLists();
		obj1.root= obj1.addNode(obj1.root, 1);
		obj1.root= obj1.addNode(obj1.root, 4);
		obj1.root= obj1.addNode(obj1.root, 7);
		obj1.root= obj1.addNode(obj1.root, 11);
		
		
		
		
		obj2.root= obj2.addNode(obj2.root, 2);
		obj2.root= obj2.addNode(obj2.root, 3);
		obj2.root= obj2.addNode(obj2.root, 5);
		obj2.root= obj2.addNode(obj2.root, 7);
		obj2.root= obj2.addNode(obj2.root, 9);
		obj2.root= obj2.addNode(obj2.root, 13);
		obj2.root= obj2.addNode(obj2.root, 13);
		obj2.root= obj2.addNode(obj2.root, 16);
		
		
		SortedLKLists merged = new SortedLKLists();
		merged.root= merged.merge2LinkedListsSorted(obj1.root, obj2.root);
		System.out.println(0);
		
	}

}
