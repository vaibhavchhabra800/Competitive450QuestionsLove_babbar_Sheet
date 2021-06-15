package Longest_Word_package;

import java.util.*;
import java.lang.*;

public class longestWordClass {

	public static Set<String> longestWord(String pattern, String[] dict)
	{
		Set<String>  ans = new HashSet<String>();
		HashMap<Character, Integer> pat = new HashMap<Character,Integer>();
		for(int i = 0 ; i < pattern.length(); i++)
		{
			char ch = pattern.charAt(i);
			
				
			pat.put(ch, pat.getOrDefault(ch,0)+1);
			
		}
		
		int longestWord=0;
		HashMap<Character, Integer> curr = null;
			for(int j =0 ; j <dict.length;j++)
			{
				boolean flag = true;
				String currentString = dict[j];
				curr= new HashMap<Character,Integer>();
				for(int k=0 ; k <currentString.length(); k++)	
				{
					char ch = currentString.charAt(k);
					curr.put(ch, curr.getOrDefault(ch,0)+1);
					
				}
				
				ArrayList<Character> charsInNewString =new ArrayList<Character>(curr.keySet());
				for(int l=0;l< charsInNewString.size() ; l++)
				{
					char ch2 = charsInNewString.get(l);
					if(!pat.containsKey(ch2))
					{
						flag=  false;
						break;
					}
					if(curr.get(ch2)>pat.get(ch2))
					{
						flag=  false;
						break;
					}
				}
				if(!flag)
				{
					continue;
				}
				int currSize = currentString.length();
				if(currSize>longestWord)
				{
					
					longestWord = currSize;
					ans = new HashSet<String>();
					ans.add(currentString);
				}
				else if(longestWord == currSize)
				{
					ans.add(currentString);
				}
				
			}
		return ans;
    }
 
	public static void main(String[] args) {
		
		String[] dict = new String[]{"to", "toe","etdgoo", "toes", "doe", "dog", "god", "dogs", "book", "banana"};
		String pattern = "oetdg";
		Set<String> abc =longestWord(pattern,dict);
		System.out.println(abc);
	}

}
