package Median_2_sorted_arrasyDewletePractice;

public class median2SortedarraysClassdelete {

	public static double findMedianOf2SortedArrays(int[] arr1 , int[] arr2)
	{
		int cut1 ;
		int cut2;
		int n = arr1.length;
		int m= arr2.length;
		int low= 0;
		int high = n;
		int l1 = 0,l2=0, r1=0,r2=0;
		double median = 0.0;
		while(low <= high)
		{
			int mid= (low+high)/2;
			cut1 = mid;
			cut2= (n+m)/2 - cut1;
			l1 = cut1==0 ? Integer.MIN_VALUE : arr1[cut1-1];
			l2 = cut2==0 ? Integer.MIN_VALUE : arr2[cut2-1];
			r1 = cut1==n ? Integer.MAX_VALUE : arr1[cut1];
			r2 = cut2==m ? Integer.MAX_VALUE : arr2[cut2];
			if(l1>r2)
			{
				high = mid-1;
			}
			else if(l2>r1)
			{
				low = mid+ 1;
			}
			else {
				if((n+m)%2==0)
				{
					median = ((double)(Math.max(l1, l2)+Math.min(r1,r2))/2);
				}
				else {
					median = (double)(Math.min(r1,r2));
				}
				break;
			}
			
		}
		return median;
	}
	public static void main(String[] args) {
		int[] arr2= new int[] {1,5,8,10,18,20,21,23,24};
		int[] arr1 = new int[] {2 , 3 , 6 , 7};
		double ans = findMedianOf2SortedArrays(arr1,arr2);
		//System.out.println(ans);
		  int[][] dp = new int[3][7];
        System.out.println(dp[1].length);
	}

}
