package binaryTreeDelete;
import java.lang.*;
import java.util.*;
public class binaryTreeClass {
	Node rootMain;
	static class Node
	{
		Node left;
		int data;
		Node right;
		public Node(Node left,int data , Node right)
		{
			this.left = left;
			this.data = data;
			this.right = right;
		}
	}
	static class Pair
	{
		Node node;
		int state;
		public Pair(Node node , int state)
		{
			this.node = node;
			this.state = state;
		}
	}
	
	
	public static void displayTree(Node rootPassed)
	{
		if(rootPassed==null)
		{
			return;
		}
		String str="";
		str+=rootPassed.left==null?". ":rootPassed.left.data +" ";
		str+="<-- "+rootPassed.data +" --> ";
		str+=rootPassed.right==null?" - . ":" -"+rootPassed.right.data +" ";
		System.out.println(str);
		displayTree(rootPassed.left);
		displayTree(rootPassed.right);
	}
	public static Node constructBinaryTree(Integer[] arr)
	{
		
		Node root = new Node(null,arr[0],null);
		Stack<Pair> st1 = new Stack<Pair>();
	    Pair tempPair = new Pair(root,1);
		st1.add(tempPair);
		int idx=0;
		while(st1.size()!=0)
		{
			Pair top = st1.peek();
			
			int stateTop = top.state;
			if(stateTop == 1)
			{
				idx++;
				if(arr[idx]!=null)
				{
					top.node.left= new Node(null,arr[idx],null);
					Pair lc =new Pair(top.node.left,1);
					st1.add(lc);
				}
				
				top.state =top.state +1;
			}
			else if(stateTop == 2)
			{
				idx++;
				if(arr[idx]!=null)
				{
					top.node.right= new Node(null,arr[idx],null);
					Pair rc =new Pair(top.node.right,1);
					st1.add(rc);
				}
				top.state =top.state +1;
			}
			else {
				st1.pop();
				
			}
			
			
		}
		//Node newNode = new Node(null,);

		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[] {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		binaryTreeClass  obj = new binaryTreeClass();
		obj.rootMain = constructBinaryTree(arr);
		System.out.println("YOLO");
		displayTree(obj.rootMain);
	}

}
