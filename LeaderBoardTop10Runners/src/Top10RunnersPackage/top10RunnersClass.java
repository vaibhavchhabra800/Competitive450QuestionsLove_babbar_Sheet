package Top10RunnersPackage;

import java.util.*;
import java.lang.*;
public class top10RunnersClass 
{​​​
	PriorityQueue<Player> pq = new PriorityQueue<>((p1,p2) -> p1.score-p2.score);
	public void init(List<Player> players, int k) 
	{​​​​​​​​
		int i=0; 
		while(i<=players.size() && i<k) 
		{
			​​​​​​​​ pq.add(players.get(i++)); 
		}
	​​​​​​​​ }​​​​​​​​
	public void topK(int k)
	{​​​​​​​​
		List<Player> players = new ArrayList<>();
		Stack<Player> stack = new Stack<>(); 
		while(k-->0 && pq.size()>0) 
		{
			​​​​​​​​ stack.push(pq.peek()); 
			players.add(pq.poll()); 
		}
		​​​​​​​while(!stack.isEmpty()) 
		{
			​​​​​​​​ System.out.println(stack.pop().name); 
		}​​​​​​​​
		pq.addAll(players);
		}​​​​​​​​ 
		public void add(String name, int score) 
		{
			​​​​​​​​ List<Player> players = new ArrayList<>(); 
			while(pq.size()>0 && name != pq.peek().name)
			{
				​​​​​​​​ players.add(pq.poll());
			}
			​​​​​​if(pq.size() == 0) 
			{
				​​​​​​​​ pq.addAll(players);
				if(score > pq.peek().score) 
				{​​​​​​​​ pq.poll();
				Player player = new Player(name);
				player.score = score; pq.add(player);
				}​​​​​​​​
			}
			​​​​​else 
			{​​​​​​​​ 
				Player p = pq.poll();
				p.score += score; pq.add(p); 
				pq.addAll(players); 
				}​​​​​​​​ 
			}​​​​​​​​
		
class Player 
{​​​​​​​​
	String name; 
	int score; 
	public Player(String name)
	{​​​​​​​​ 
		this.name = name; 
	}​​​​​​​​ 
}​​​​​​​​








public static void main(String[] args)
{​​​​​​​​ 
	List<Player> list = new ArrayList<>();
	top10RunnersClass top = new top10RunnersClass();
	Player p1 = new Player("a"); p1.score = 100; 
	list.add(p1);
	Player p2 = new Player("b");
	p2.score = 200;
	list.add(p2); 
	Player p3 = new Player("c");
	p3.score = 300; 
	list.add(p3); 
	top.init(list, 3); // top.topK(3); top.add("a", 250); top.topK(3); }​​​​​​​​

}​​​​​​​​ 

	

}
