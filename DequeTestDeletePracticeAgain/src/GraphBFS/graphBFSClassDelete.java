package GraphBFS;

import java.util.ArrayList;

import java.lang.*;
import java.util.*;

public class graphBFSClassDelete 
{
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
	
	public static class Pair
	{
		int src;
		String pathwa;
		public Pair(int src , String pathwa)
		{
			this.src = src;
			this.pathwa =pathwa;
		}
	}
	public static void BFS(ArrayList<Edge>[] graph , int startVertex)
	{
		Pair pairStart = new Pair(startVertex , startVertex +"");
		ArrayDeque<Pair> dq = new ArrayDeque<Pair>();
		dq.push(pairStart);
		boolean[] visited = new boolean[graph.length];
		while(dq.size()!=0)
		{
			Pair inspect = dq.removeFirst();
			int currSrc=inspect.src;
			if(visited[currSrc]==true)
			{
				continue;
			}
			visited[currSrc] = true;
			System.out.println( currSrc + " @ " + inspect.pathwa );
			ArrayList<Edge> nbrCurr=graph[currSrc];
			for(int l= 0 ;l < nbrCurr.size() ;l++)
			{
				if(visited[nbrCurr.get(l).nbr ]==true)
				{
					continue;
				}
				else 
				{
					dq.add(new Pair(nbrCurr.get(l).nbr , inspect.pathwa +" " + nbrCurr.get(l).nbr ));
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
		
		
		
		graphBFSClassDelete obj = new graphBFSClassDelete();
		Comparator<Edge> com = new Comparator<Edge>() {
			@Override
			public int compare(Edge e1 , Edge e2)
			{
				if(e1.nbr > e2.nbr)
					return 1;
				else 
					return -1;
			}
		};
		for(int k = 0 ; k < graph.length;k++)
		{
			Collections.sort(graph[k],com);
		}
		int startVertex=2;
		BFS(graph,startVertex);
		
		
		
	}

}
