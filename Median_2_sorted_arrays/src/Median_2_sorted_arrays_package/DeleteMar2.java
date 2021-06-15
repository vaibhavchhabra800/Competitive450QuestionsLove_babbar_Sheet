package Median_2_sorted_arrays_package;

public class DeleteMar2 {

	public static double findMedianSortedArrays(int[] arr1, int[] arr2)
	{
		double ans = 0.0;
		int l1,l2,r1,r2,mid;
		int n = arr1.length;
		int m = arr2.length;
		int low=0;
		int high = n;
		while(low <=high)
		{
			int cut1 =(low + high)/2;
			int cut2= (n+m)/2 - cut1;
			
			l1=cut1==0?Integer.MIN_VALUE : arr1[cut1-1];
			l2=cut2==0?Integer.MIN_VALUE :arr2[cut2-1];
			r1=cut1==n ? Integer.MAX_VALUE:arr1[cut1];
			r2=cut2==m ? Integer.MAX_VALUE:arr2[cut2];
			
			if(l1>r2 )
			{
				high = cut1-1;
			}
			else if (l2>r1)
			{
				low = cut1+1;
			}
			else
			{
				if((n+m)%2==0)
				{
					ans = (double)(Math.max(l1,l2) + Math.min(r1,r2))/2;
				}
				else {
					ans= Math.min(r1,r2);
				}
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr1 =new int[] {1 , 5 ,8 ,10,18 ,20}; 
		int[] arr2 =new int[] {2 , 3 ,6 ,7}; 
		double ans =findMedianSortedArrays(arr1,arr2);
		System.out.println(ans);
	}

}
