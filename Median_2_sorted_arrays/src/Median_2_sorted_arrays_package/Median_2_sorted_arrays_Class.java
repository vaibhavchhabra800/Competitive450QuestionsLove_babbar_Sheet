package Median_2_sorted_arrays_package;

public class Median_2_sorted_arrays_Class {
	
	public static double findMedian(int[] arr1 , int[] arr2)
	{
		int l1;
		int l2;
		int r1;
		int r2;
		int cut1;
		int cut2;
		int low, end;
		low = 0;
		end = arr1.length;
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		double ans =0.0;
		while(low<=end)
		{
			cut1=(low+ end)/2;
			cut2=(n1+n2)/2 - cut1 ;
			l1=cut1==0 ?Integer.MIN_VALUE :arr1[cut1 -1];
			l2=cut2==0?Integer.MIN_VALUE:arr2[cut2 -1];
			r1=cut1==n1?Integer.MAX_VALUE:arr1[cut1];
			r2=cut2==n2?Integer.MAX_VALUE:arr2[cut2];
			
			if(l1>r2)
			{
				//cut1 = mid -1;
				end = cut1 -1; 
			}
			else if(l2>r1)
			{
 				low = cut1 +1;
			}
			else {
				if((arr1.length + arr2.length)%2==0 )
				{
					
					ans= (double)(Math.max(l1, l2) + Math.min(r1, r2))/2;
					break;
				}
				else {
					ans=Math.min(r1, r2);
					break;	
				}
			}
		}
		return ans;

	}
	public static void main(String[] args) {

		int[] arr1 = {1,5,8,10,18,20};
		int[] arr2 = {2,3,6,7};
		double ans = findMedian(arr1,arr2);
		System.out.println(ans);
		
	}

}
