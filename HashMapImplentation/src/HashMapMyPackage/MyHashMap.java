package HashMapMyPackage;

import java.util.LinkedList;

public class MyHashMap {
	
	public LinkedList<myHashMapnow>[] buckets;
	static int N;
	public static class myHashMapnow
	{
		String key;
//		int HashCode;
		int data;
		public myHashMapnow(String key ,int data)
		{
			this.key = key;
			this.data= data;
		}
		
	}
	public MyHashMap()
	{
		for(int i =0 ; i< 16 ;i++)
		{
			buckets[i] = new LinkedList<myHashMapnow>();
		}
		N = 16;
	}
	public int getBucketId(String key)
	{
		int hashcode = key.hashCode() ;
		int temp = Math.abs(hashcode);
		int place = temp % N ;
		return place;
	}
	public boolean containsKey(String key)
	{
		int getIdForKey = getBucketId(key);
		LinkedList<myHashMapnow> temp = new LinkedList<myHashMapnow>();
		temp=buckets[getIdForKey];
		int i =0;
		while(temp!=null)
		{
			myHashMapnow temp2 = temp.get(i);
			if(key.equals(key))
			{
				return true;
			}
			i++;
		}
		
		return false;
	}
	
	public int getIndexWithinBucket(String key , int getIdForKey)
	{
		int loc=-1;
		for(int i =0;i <buckets[getIdForKey].size();i++)
			//vaibhav ji above line
		{
			if(buckets[getIdForKey].get(i).key.equals(key))
				//vaibhav ji above line
			{
				break;
			}
		}
		return loc;
		
	}
	public Integer put(String key , int data)
	{
		int getIdForKey = getBucketId(key);
		boolean containsKey = containsKey(key);
		
		if(containsKey)
		{
			int loc = getIndexWithinBucket(key,getIdForKey);
			int toReturn =buckets[getIdForKey].get(loc).data;
			buckets[getIdForKey].get(loc).data = data;
			return toReturn;
		}
		else
		{
			myHashMapnow obj = new myHashMapnow(key,data);
			
			buckets[getIdForKey].add(obj);
			return null;
		}
	}
//	public int getBucketNumber()
//	{
//		
//	}
//	
}
