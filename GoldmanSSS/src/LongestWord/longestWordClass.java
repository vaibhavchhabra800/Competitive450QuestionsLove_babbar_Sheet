package LongestWord;
import java.lang.*;
import java.util.*;
public class longestWordClass {

	
	public static void main(String[] args) {
		HashSet<Character> hs1 = new HashSet<Character>();
		HashSet<Character> hs2 = new HashSet<Character>();
		hs1.add('t');
		hs1.add('o');
		hs1.add('e');
		hs1.add('e');
		hs1.add('d');
		hs1.add('l');
		hs1.add('p');
		hs1.add('r');
		hs1.add('k');
		//hs1.add('a');
		
		hs2.add('t');
		hs2.add('o');
		hs2.add('e');
		hs2.add('d');
		hs2.add('l');
		
		boolean b1 = hs1.containsAll(hs2);
		//Means Hs2 should contain all elements in hs1 only then it will be right
		System.out.println(b1);
		
		
		hs1 = new HashSet<Character>();
		hs2 = new HashSet<Character>();
		
		
		
		hs1.add('l');
		hs1.add('p');
		hs1.add('r');
		hs1.add('k');
		//hs1.add('a');
		
		
		hs2.add('l');
		hs2.add('p');
		hs2.add('r');
		hs2.add('k');
		hs2.add('l');
		hs2.add('z');
		hs2.add('x');
		
		
		b1 = hs2.containsAll(hs1);
		//every element in set hs1 should be in hs2
		
		System.out.println(b1);

	}

}
