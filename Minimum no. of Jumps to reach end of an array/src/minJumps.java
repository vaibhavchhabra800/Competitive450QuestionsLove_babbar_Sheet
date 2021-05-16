import java .util.*;
import java.lang.*;
import java .io.*;

public class minJumps {

	public static void main(String[] args) {

			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int t=-1;
			try {
				t = Integer.parseInt(br.readLine().trim());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //Inputting the testcases
			while(t-->0){
			    //size of array
			    int n=100;
				try {
					n = Integer.parseInt(br.readLine().trim());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    int arr[] = new int[n];
			    String inputLine[] = new String[1000];
				try {
					inputLine = br.readLine().trim().split(" ");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    //adding elements
			    for(int i=0; i<n; i++){
			        arr[i] = Integer.parseInt(inputLine[i]);
			    }
			    
			    Solution obj = new Solution();
			    
			    //calling maxSubarraySum() function
			    System.out.println(obj.maxSubarraySum(arr, n));
			
			}
		}




  
  
		  
		  
}




class Solution{
    static int minJumps(int[] arr){
        return -1;
    }
}
