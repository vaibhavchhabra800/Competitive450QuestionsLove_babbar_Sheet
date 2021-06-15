
public class bst1 {

	public static class Node
	{
		Node left;
		int data;
		Node right;
		public Node(Node left, int data , Node right)
		{
			this.left=left;
			this.data=data;
			this.right=right;
		}
	}
	
	public static void inOrderTraversal(Node node )
	{
		if(node.left!=null)

		{
			inOrderTraversal(node.left);
		}
		System.out.println(node.data);
		
		if(node.right!=null)
		{
			inOrderTraversal(node.right);
		}
	}
	public static Node addNode(Node node, int data)
	{
		if(node == null)
		{
			return new Node(null,data,null);
		}
		if(data>node.data) 
		{
			node.right = addNode(node.right,data);
		}
		else if(data < node.data)
		{
			node.left = addNode(node.left,data);
		}
		else
		{
			//DON't do anything if data already present , don't repeat them
		}
		return node;
	}
	
	public static Node findNodeBST(Node root , int findIt)
	{
		while(root!=null)
		{
			if(findIt < root.data)
			{
				root=root.left;
			}
			else if (findIt > root.data)
			{
				root=root.right;
			}
			else {
				System.out.println("MILGAYA BHAI");
				break;
			}
		}
		return root;
	}


	
	
	
	
	
	
	
	
	public  static void display(Node node)
	{
		
		String str="";
		if(node == null)
		{
			return;
		}
		if(node.left==null)
		{
			str+=". - ";
		}
		else {
			str+=node.left.data+ " - ";
		}
		str+="<-- "+node.data+ " --> ";
		if(node.right==null)
		{
			str+="- .";
		}
		else {
			str+="- "+node.right.data ;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Node constructBST(int[] arr, int low , int high)
	{
		if(low>high)
		{
			return null;
		}
		int mid= (low+ high)/2;
		Node lcd =constructBST(arr, low, mid-1);
		Node rcd =constructBST(arr,mid+1,high);
		
		Node node = new Node(lcd,arr[mid],rcd);
		return node;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {12,25,37,50,62,75,87};
		Node root = constructBST(arr, 0 , arr.length-1);
		display(root);
		
		System.out.println(findNodeBST(root , 37));
		root = addNode(root,100);
		System.out.println();
		System.out.println();
		System.out.println();
		
		display(root);
		System.out.println();
		inOrderTraversal(root);
	}

}
