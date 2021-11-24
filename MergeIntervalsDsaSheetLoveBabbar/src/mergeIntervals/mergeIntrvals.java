package mergeIntervals;
import java.lang.*;
import java.util.*;
import java.lang.Math.*;

public class mergeIntrvals 
{
	public static void main(String[] args) {
		
		List<int[]> strend= new ArrayList<int[]>();
		int[] strend2= new int[] {1,3};
		strend.add(strend2);
		strend2= new int[] {2,5};
		strend.add(strend2);
		strend2= new int[] {8,10};
		strend.add(strend2);
		strend2= new int[] {8,9};
		strend.add(strend2);
		strend2= new int[] {9,11};
		strend.add(strend2);
		strend2= new int[] {15,18};
		strend.add(strend2);
		strend2= new int[] {2,6};
		strend.add(strend2);
		strend2= new int[] {16,17};
		strend.add(strend2);
		
		Comparator<int[]> com = new Comparator<int[]>()
		{
			@Override
			public int compare(int a[], int b[])
			{
				if(a[0]>b[0])
					return 1;
				else if(a[0]==b[0])
				{
					if(a[1]>b[1])
						return 1;
					else return -1;
				}
				else
					return -1;
			}
			
		};
		Collections.sort(strend,com);
		
		for(int[] pair: strend)
		{
			System.out.println(pair[0]+" " + pair[1] );
		}
		
		//strend2= new int[] {1,3};
		//strend2= new int[] {1,3};
	}
}
