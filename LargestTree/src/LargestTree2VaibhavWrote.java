import java.util.*;

import javax.management.ImmutableDescriptor;

import java.lang.*;

public class LargestTree2VaibhavWrote {

	
	
	
	public static Integer largestTree( Map<Integer, Integer>immediateParent)
	{
		HashMap<Integer,Integer> childCountOfParent = new HashMap<Integer,Integer>();
		
		ArrayList<Integer> childrenList = new ArrayList(immediateParent.keySet());
		for(int i =0;i<immediateParent.keySet().size();i++)
		{
			int currChild = childrenList.get(i);
			int parent = immediateParent.get(currChild);
			while(immediateParent.containsKey(parent))
			{
				parent = immediateParent.get(parent);
			}
			childCountOfParent.put(parent, childCountOfParent.getOrDefault(parent,0)+1);
		}
		ArrayList<Integer> ansKeys  = new ArrayList<Integer>(childCountOfParent.keySet());
		int keyMax =-1; int valueMax = -1;
		for(int k =0;k<ansKeys.size();k++)
		{
			if(childCountOfParent.get(ansKeys.get(k))>valueMax)
			{
				valueMax = childCountOfParent.get(ansKeys.get(k));
				keyMax = ansKeys.get(k);
			}
		}
		return keyMax;
    }

	public static void main(String[] args) {
		Map<Integer, Integer>immediateParent = new HashMap<Integer,Integer>();
		immediateParent.put(1, 2);
		immediateParent.put(2, 3);
		immediateParent.put(3, 4);
		immediateParent.put(4, 7);
		immediateParent.put(5, 7);
		immediateParent.put(6, 7);
		

		immediateParent.put(8, 9);
		immediateParent.put(11, 9);
		immediateParent.put(9, 12);
		immediateParent.put(12, 13);
		immediateParent.put(14, 13);
		immediateParent.put(15, 13);
		immediateParent.put(17, 13);
		immediateParent.put(18, 13);
		
		int ans =largestTree(immediateParent);
		System.out.println(ans);
	}

}
