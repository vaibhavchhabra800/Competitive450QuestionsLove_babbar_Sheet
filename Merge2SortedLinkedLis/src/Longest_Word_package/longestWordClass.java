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
 
	
	public static void bekarFxn()
	{
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("10.0.0.3");
		arr.add("10.0.0.9");
		arr.add("10.0.0.8");
		arr.add("10.0.0.7");
		arr.add("10.0.0.1");
		arr.add("10.0.0.6");
		arr.add("10.0.0.1");
		arr.add("10.0.0.1");
		arr.add("10.0.0.3");
		String w1= "52";
		String w2 ="7771";
		int wow = w1.compareToIgnoreCase(w2);
		System.out.println(wow+"=Wow");
		Comparator<String> com = new Comparator<String>()
		{
			public int compare(String s1 , String s2)
			{
				if(s1.compareToIgnoreCase(s2)>0)
					return 1;
				else 
					return -1;
				//return 0;
			}
		};
		Collections.sort(arr,com);
		for(String word : arr)
		{
			System.out.println(word);
		}
		
		 
        
		
		
	}
	public static void main(String[] args) {
		
		String[] dict = new String[]{"to", "toe","etdgoo", "toes", "doe", "dog", "god", "dogs", "book", "banana"};
		String pattern = "oetdg";
		Set<String> abc =longestWord(pattern,dict);
		System.out.println(abc);
		bekarFxn();
	}

}
