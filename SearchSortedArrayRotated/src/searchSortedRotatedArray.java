
public class searchSortedRotatedArray {

	
	
	int binarySearch(int arr[], int target)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if target is present at mid
            if (arr[m] == target)
                return m;
 
            // If target greater, ignore left half
            if (arr[m] < target)
                l = m + 1;
 
            // If target is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long a=10000000000000L;
	}

}
