package TrainBFSPackage;

import java.util.*;
import java.lang.*;
import java.io.*;

public class TrainBFSClass {

	public static class Edge
	{
		int src ;
		int end ;
		public Edge(int src , int end)
		{
			this.src = src;
			this.end = end;
		}
	}
	public static class Pair
	{
		int start;
		String Pathwa;
		public Pair(int start , String Pathwa)
		{
			this.start = start;
			this.Pathwa = Pathwa;
		}
	}
	public static void bfs(ArrayList<Edge>[] graph  ,int startNode,int endVertex)
	{
		
		ArrayDeque<Pair> dq = new ArrayDeque<Pair>();
		Pair first = new Pair(startNode,startNode+"");
		boolean[] visited = new boolean[graph.length];
		dq.add(first);
		while(dq.size()>0)
		{
			Pair inUse = dq.removeFirst();
			if(visited[inUse.start])
			{
				continue;
			}
			visited[inUse.start]=true;
			if(inUse.start==endVertex)
			{
				
				System.out.println(inUse.Pathwa);
				return;
			}
			
			for(int i=0;i<graph[inUse.start].size() ; i++)
			{
				Edge temp1 = graph[inUse.start].get(i);
				if(visited[temp1.end])
				{
					continue;
				}
				else
				{
					Pair pq2 = new Pair(temp1.end, inUse.Pathwa +" "+temp1.end);
					dq.add(pq2);
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		int vertices = 7;
		ArrayList<Edge>[] graph = new ArrayList[vertices];
		for(int i = 0; i< vertices ; i++)
		{
			graph[i]= new ArrayList<Edge>();
		}
		String edg1 = "0 1";
		String[] edg_1 = edg1.split(" ");
		int start1=Integer.parseInt(edg_1[0]);
		int end1=Integer.parseInt(edg_1[1]);
		Edge edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		edg1 = "1 2";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		
		edg1 = "0 3";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		
		edg1 = "2 3";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		
		edg1 = "3 4";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		
		edg1 = "4 5";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		
		edg1 = "5 6";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		
		
		edg1 = "4 6";
		edg_1 = edg1.split(" ");
		start1=Integer.parseInt(edg_1[0]);
		end1=Integer.parseInt(edg_1[1]);
		edge1 = new Edge(start1,end1);
		graph[start1].add(edge1);
		edge1 = new Edge(end1,start1);
		
		bfs(graph,2,6);
		
	}

}
