
import java.lang.*;
import java.util.*;
public class LargestTreeClass {

	
		public static Integer solution(final Map<Integer, Integer> immediateParent)
		{
			if(null == immediateParent || 0 == immediateParent.size())
				return null;
			Map<Integer, Integer> treeSize = new HashMap<Integer, Integer>();
			for(Integer key : immediateParent.keySet()) 
			{
				Integer root = immediateParent.get(key);
				while(immediateParent.containsKey(root)) {
					root = immediateParent.get(root);
				}
				Integer size = treeSize.get(root);
				if(null == size)
					treeSize.put(root, 1);
				else
					treeSize.put(root, size + 1);
			}
			int lgTreeSize = 0;
			int lgTreeRoot = -1;
			for(Integer root : treeSize.keySet()) {
				int size = treeSize.get(root);
				if(size > lgTreeSize) {
					lgTreeSize = size;
					lgTreeRoot = root;
				} 
				else if(size == lgTreeSize && root < lgTreeRoot) {
					lgTreeRoot = root;
				}
			}
			return lgTreeRoot;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void main(String[] args)
	{
		Map<Integer, Integer> immediateParent  = new HashMap<Integer, Integer>();
		
		immediateParent.put(1,2);
		immediateParent.put(3,4);
		Integer ans = solution(immediateParent);
		System.out.println(ans);
		
	}

}
