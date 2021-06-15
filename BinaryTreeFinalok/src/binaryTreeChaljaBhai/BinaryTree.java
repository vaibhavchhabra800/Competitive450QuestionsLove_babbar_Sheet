package binaryTreeChaljaBhai;

import java.util.*;
import java.lang.Math.*;
import java.lang.*;
import java.io.*;

public class BinaryTree {
	public static class Node{
		Node left;
		int data;
		Node right;
		public Node(Node left, int data, Node right)
		{
			this.left=left;
			this.data = data;
			this.right= right;
		}
		
	}
	public static class Pair
	{
		Node node;
		int state;
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
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {50 ,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Pair top = new Pair();
		Node root = new Node(null,arr[0],null);
		
		top.node = root;
		top.state=1;
		Stack<Pair> st = new Stack<Pair>();
		st.push(top);
		int idx=0;
		Node temp=root;
		while(st.size()>0  )
		{
			if(idx >= arr.length)
				break;
			top = st.peek();
			
			if(top.state==1)
			{
				idx++;
				Pair pr = new Pair();
				if(arr[idx]!=null)
				{
					
					Node ln= new Node(null,arr[idx] ,null);
					top.node.left=ln;
					pr.node =ln;
					pr.state=1;
	
					st.push(pr);
				}
				
				top.state=2;
				  
			}
			else if (top.state==2)
			{
				idx++;
				Pair pr = new Pair();
				if(arr[idx]!=null)
				{
					
					Node rn= new Node(null,arr[idx] ,null);
					top.node.right=rn;
					pr.node =rn;
					pr.state=1;
	
					st.push(pr);
				}
				

				top.state=3;	
			}
			else 
			{
				st.pop();
			}
			
		}
		
		BinaryTree.display(root);
		
		
	}

}
