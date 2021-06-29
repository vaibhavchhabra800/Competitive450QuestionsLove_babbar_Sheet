package SmallestNumberRotatedPackage;

public class SmallestNumberRotatedClass {

	public static int FindMin(int arr[])
	{
		int low =0;
		int high = arr.length -1;
		int mid= 0;
		while(low <= high)
		{
			mid = (low+high)/2;
			if(arr[mid]< arr[mid-1])
			{
				return arr[mid];
			}
			else if(arr[low] > arr[mid])   // = sign if arr[mid ] == high th element important
			{
				high = mid-1;
			}
			else  // = sign if arr[mid ] == high th element important
			{
				low = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {7,8,9,1,2,3,4,5,6};
		int[] arr2 = new int[] {4,5,6,7,81,1,3};
		int[] arr3 = new int[] {0,1,3,4,5,6,7,8};
		int[] arr4= new int[] {1,1,1,1,1,1,1,1};
		int a =FindMin(arr2);
		System.out.println(a);
	}

}
