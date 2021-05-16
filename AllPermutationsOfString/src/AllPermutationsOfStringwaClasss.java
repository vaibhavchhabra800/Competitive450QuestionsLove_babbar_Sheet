import java.lang.*;
import java.util.*;
import java.io.*;


public class AllPermutationsOfStringwaClasss {
	static Set<String> ans= new HashSet<String>();
	
	public static void getMeThem(String str, int l , int r) {
		
		if(l==r)
		{
			if(AllPermutationsOfStringwaClasss.ans.contains(str)) {return;}
			AllPermutationsOfStringwaClasss.ans.add(str);
			System.out.print(str+" ");
					}
		for(int i=l;i<=r;i++)
		{
			str=AllPermutationsOfStringwaClasss.interchange(str,l,i);
			getMeThem(str,l+1,r);
 			str=AllPermutationsOfStringwaClasss.interchange(str,l,i);
		}
		return ;
	}
	
	public static String interchange(String str,int l , int i) {
		char[] temp= str.toCharArray();
		char tempchar=temp[l];
		temp[l]=temp[i];
		temp[i]=tempchar;
		return String.valueOf(temp);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		AllPermutationsOfStringwaClasss.getMeThem(str,0,2);
		List<String> list = new ArrayList<String>(ans);
		for(int j=0;j<list.size();j++)
		{
			System.out.println(list.get(j));
		}

	}

}
