
import java.util.*;
import java.lang.Math.*;
import java.lang.*;
import java.util.*;
import java.io.*;
public class myFirst {

	
	
	public static void main(String[] args) {
		vulgarToDecimal(3L,2L);
		// Arrays.sort(a, Collections.reverseOrder());
		//
		//Collections.sort(arrList, Collections.reverseOrder());
		
		Apache_Log_Pattern();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		int[] abc=longestUniformSubstring("abaaab");
		System.out.println(abc[0]+" KAKA ji " + abc[1]);
		System.out.println(findMissingLetters("asdad"));
		double shit=2.8;
		int shit2=(int)shit;
		System.out.println("SHIT2 = "+shit2);
		Apache_Log_Pattern();
		List<Integer> abcd= new ArrayList<Integer>();
		abcd.add(6);
		abcd.add(2);
		abcd.add(11);
		abcd.add(4);
		abcd.add(51);
		abcd.add(51);
		abcd.add(51);
		abcd.add(1);
		Comparator<Integer> com = new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1.intValue() > o2.intValue())
					return 1;
				else {
					return -1;
				}
			}
			
		};
		Collections.sort(abcd , com);
		System.out.println(abcd);
	}
	
	
	
	public static String vulgarToDecimal(Long numerator, Long denominator)
	{	
		Long ac=2L;
		double n= numerator;
		double d=  denominator;
		double c=n/d;
		System.out.println(c);
		String ans= c+"";
		return ans;
		
	}
	
	
	
	public static void Apache_Log_Pattern()
	{
		String lines[] = new String[]{
                "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                //"10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                "10.0.0.3 - logan [10/Dec/2000:12:34:59 -0500] \"GET /d.gif HTTP/1.0\" 200 234",
                };
		HashMap<String, Integer> myMap = new HashMap<String,Integer>();
		for(int  i =0; i < lines.length; i ++ )
		{
			String line1= lines[i];
			String[] lineInside = line1.split(" ");
			String abc = lineInside[0];
			if(myMap.containsKey(abc))
			{
				int times=myMap.get(abc);
				myMap.put(abc, (times+1));
			}
			else {
				myMap.put(abc, (1));
			}
		}
		
		
		
		Set<String> keySet = myMap.keySet();
		  
        // Creating an ArrayList of keys
        // by passing the keySet
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
        
        
        
		ArrayList<String> lst2= new ArrayList<String>(myMap.keySet());
		ArrayList<Integer> lst1= new ArrayList<Integer>(myMap.values());
		//lst1
		int max=(Collections.max(lst1)) ;
		for(int k=0;k<lst1.size(); k++)
		{
			if(myMap.get(lst2.get(k))==max)
			{
				System.out.println(lst2.get(k));
			}
		}

	}
	public static void myTest()
	{
		 		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		        hs.put(1,1);
		        hs.put(2,3);
		        hs.put(4,5);
		        hs.put(6,7);
		        
		        Set<Integer> st1 = hs.keySet();
		        ArrayList<Integer> arr = new ArrayList<Integer>(st1);
		        for(int i =0;i<arr.size();i++)
		        {
		            System.out.println(arr.get(i));
		        }
		        Set<Integer> stwa= new HashSet<Integer>(arr);
		        arr = new ArrayList<Integer>(stwa);
		        
		          for(int i =0;i<arr.size();i++)
		        {
		            System.out.println(arr.get(i));
		        }
		        
	}
	
	
	public static int[] longestUniformSubstring(String str) {
		//use start and end will be simpler two pointer
//		char temp1;
//		int pos=0,length=1;
//		int tempsize=1;
//		int posFound=0;
//		int flag=1;
//		for (int i =1;i < str.length(); i++)
//		{
//			if(flag==0)
//			{
//				flag=1;
//				//posFound=i;
//			}
//			temp1 = str.charAt(i);
//			if(str.charAt(i)==str.charAt(i-1))
//			{
//				tempsize++;
//				if(tempsize>length)
//				{
//					length=tempsize;
//					pos=posFound;
//				}
//			}
//			else {
//				tempsize=1;
//				flag=0;
//				posFound=i;
//			}
//		}
//		return new int[] {pos,length};
		
		
		
		int start=0;
		int end=0;
		int i =0;
		int maxSize=-1;
		int startMax=-1;
		int endMax=-1;
		while(end < str.length())
		{
			if(str.charAt(start)==str.charAt(end))
			{
				if(end-start+1>maxSize)
				{
					maxSize =  end-start+1;
					startMax = start;
					endMax = end;
				}
			}
			else {
				start = end;
			}
			end++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return new int[] {startMax,maxSize};
		
	}
	
	public static String findMissingLetters(String sentence) {
		//INCOMPLETE NOT NEEDED TO COMPLETE VAIBHAV JUST SEE HOW SET WORKS
		
		Set<Character> st = new HashSet<Character>();
		st.add('a');
		st.add('b');
		st.add('c');
		st.add('d');
		st.add('e');
		st.add('f');
		st.add('g');
		st.add('h');
		st.add('i');
		st.add('j');
		st.add('k');
		st.add('l');
		st.add('m');
		st.add('n');
		st.add('o');
		st.add('p');
		st.add('q');
		st.add('r');
		st.add('s');
		st.add('t');
		st.add('u');
		st.add('v');
		st.add('w');
		st.add('x');
		st.add('y');
		st.add('z');
		
		if(st.contains('v'))
		{
			st.remove('v');
		}
		if(st.contains('v'))
		{
			st.remove('v');
		}
		if(st.contains('c'))
		{
			st.remove('c');
		}
		List<Character> ansList = new ArrayList<Character>(st);
		String ans="";
		for(int j =0 ; j < ansList.size(); j++)
		{
			ans+=ansList.get(j);
		}
		
		return ans;
	}


}
