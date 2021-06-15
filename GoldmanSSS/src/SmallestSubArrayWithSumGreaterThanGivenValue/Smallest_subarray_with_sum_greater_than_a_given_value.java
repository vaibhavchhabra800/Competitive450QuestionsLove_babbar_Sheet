
package SmallestSubArrayWithSumGreaterThanGivenValue;

public class Smallest_subarray_with_sum_greater_than_a_given_value {
	public static int subArrayExceedsSum(int arr[], int target) {
		int start =0 , end =0,sum=0;

		sum=arr[start];
		int minLength=100000;
		while(start< arr.length && end < arr.length)
		{
			if(sum>=target)
			{
				if(minLength> (end-start +1))
				{
					minLength= end-start+1;
				}
				sum-=arr[start];
				start++;
				if(start>=arr.length)
				{
					break;
				}
				if(start > end)
				{
					end++;
					if(end>=arr.length)
					{
						break;
					}
					sum+=arr[end];
				}
			}
			else {
				end++;
				if(end>=arr.length)
				{
					break;
				}
				sum+=arr[end];
			}
		}
		System.out.println(minLength);
		return -1;
	}

	
	
	
	
	public static void main(String[] args) {
		int[] arr= new int[] {1 ,2 ,3 ,4 ,5 ,1, 2, 10, 6};
		

		


		Smallest_subarray_with_sum_greater_than_a_given_value.subArrayExceedsSum(arr,12);
	}
}
