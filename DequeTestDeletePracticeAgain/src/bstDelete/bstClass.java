package bstDelete;

import java.lang.*;
import java.util.*;


public class bstClass
{
	Node theRoot;
	public static class Node{
		Node leftChild;
		int data;
		Node rightChild;
		public Node(Node leftChild , int data , Node rightChild)
		{
			this.leftChild = leftChild;
			this.data = data;
			this.rightChild = rightChild;
		}
	}
	public static Node constructBST(int[] arr, int low , int high)
	{
		if(low> high)
			return null;
		int mid = (low + high)/2;
		Node lc = constructBST(arr , low , mid-1);
		Node rc = constructBST(arr , mid+1 , high ); 		
		Node parent = new Node(lc , arr[mid] , rc );
		return parent;
	}
	public static Node addNode(Node root , int data)
	{
		if(root == null )
		{
			root = new Node(null, data,null);
			return root;
		}
		else
		{
			if(data > root.data)
			{
				root.rightChild = addNode(root.rightChild , data);
			}
			else if (data == root.data)
			{
				//do nothing , don't add duplicates
			}
			else {
				root.leftChild = addNode(root.leftChild , data);
			}
			
			return root;
		}
	}
	
	public static void inorderAbhi(Node root)
	{
		if(root == null)
			return ;
		inorderAbhi(root.leftChild);
		System.out.println(root.data);
		inorderAbhi(root.rightChild);
	}
	// inOrderTraversa
	

	
	
	public static Node findNodeBST(Node root ,int data)
	{
		while(root!= null)
		{
			if(root.data== data)
			{
				return root;
			}
			else if (root.data< data)
			{
				root= root.rightChild;
			}
			else if (root.data> data)
			{
				root= root.leftChild;
			}
		}
		return null;
	}
	
	


	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {12,25,37,50,62,75,87};
		bstClass obj = new bstClass();
		obj.theRoot = constructBST(arr, 0, arr.length - 1);
		int findData = 4100;
		obj.theRoot = addNode(obj.theRoot , findData);
		System.out.println("Yo");
		inorderAbhi(obj.theRoot);
		Node test = findNodeBST(obj.theRoot , 12);
		System.out.println();
		System.out.println();
		System.out.println(test.data);
	}

}
