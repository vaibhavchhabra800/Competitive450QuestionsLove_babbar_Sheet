import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class MinkthElementArray {

	public static void main(String[] args) {
		int[] arr= {7,10, 4, 3 ,20, 15};
		System.out.println(kthSmallest(arr,0,5,3));
		
		
		

	}
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for (int i=0;i<arr.length;i++)
		{
			minHeap.add(arr[i]);
			
		}
		int	i=0;
		while(i<k) {
			
			if((i+1)==k)
			{
				return minHeap.poll();
			}

			minHeap.poll();
			i++;
		}
		return -1;
    } 

}
