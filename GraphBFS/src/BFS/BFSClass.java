package BFS;

import java.util.*;
import java.lang.*;

public class BFSClass {
	public static class Edge
	{
		int src;
		int nbr;
		public Edge(int src , int nbr)
		{
			this.src = src;
			this.nbr = nbr;
		}
	}
	public static class Pair{
		int src;
		String path;
		public Pair(int src , String path)
		{
			this.src= src;
			this.path = path;
		}
	}
	public static void BFS(ArrayList<Edge>[] graph , int srcVertex  )
	{
		
		boolean[] visited = new boolean[graph.length];
		ArrayDeque<Pair> queue = new ArrayDeque<>();
		queue.add(new Pair(srcVertex , srcVertex+" "));
		
		while(queue.size() != 0)
		{
			Pair tempPair = queue.removeFirst();
			if(visited[tempPair.src]==true)
			{
				continue;
			}
			visited[tempPair.src]=true;
			System.out.println(tempPair.src + " @ "+ tempPair.path);
			for(int i =0 ;i<graph[tempPair.src].size();i++)
			{
				if(visited[graph[tempPair.src].get(i).nbr]==false)
				{
				
					queue.add(new Pair(graph[tempPair.src].get(i).nbr , tempPair.path+ graph[tempPair.src].get(i).nbr +" " ));
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int vertices = 7;
		ArrayList<Edge>[] graph = new ArrayList[vertices];
		for(int k =0 ; k<graph.length; k++)
		{
			graph[k] = new ArrayList<Edge>();
		}
		String input= "0 1";
		String[] parts = input.split(" ");
		int part1 = Integer.parseInt(parts[0]);
		int part2 = Integer.parseInt(parts[1]);
		Edge e1= new Edge(part1,part2);
		Edge e2= new Edge(part2,part1);
		graph[part1].add(e1);
		graph[part2].add((e2));
		
		
		
		
		
		
			input= "0 3";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			
			input= "2 3";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			
			input= "1 2";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			
			input= "3 4";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			
			input= "4 6";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			
			input= "4 5";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			
			input= "5 6";
			parts = input.split(" ");
			part1 = Integer.parseInt(parts[0]);
			part2 = Integer.parseInt(parts[1]);
			graph[part1].add(new Edge(part1,part2));
			graph[part2].add(new Edge(part2,part1));
			
			
			for(int k =0 ; k<graph.length; k++)
			{
				
				Comparator<Edge> com = new Comparator<Edge>()
				{
					@Override
					public int compare(Edge e1 ,Edge e2)
					{
						if(e1.src>e2.src)
							return 1;
						else 
							return -1;
					}
					
				};
				Collections.sort(graph[k],com);
			}
			BFS( graph , 2  );

	}

}
