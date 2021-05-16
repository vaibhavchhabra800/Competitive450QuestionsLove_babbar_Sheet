import java.lang.*;
import java.util.*;
import java.io.*;
public class LongestCommonSubsequence {

	
	
	
	public static int findTheLongestCommonSubsequenceLength(char str1[],char str2[])
	{
		int max=-1;
		int[][] dp = new int[str1.length+1][str2.length+1];
		for(int i=1;i<str1.length+1 ; i++) {
			for(int j =1;j<str2.length+1;j++){
				if(str1[i-1]==str2[j-1])
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[str1.length][str2.length];
	}
	
	
	public static void main(String[] args) {

		String str1 = "ABCDGHL";
        String str2 = "AEDPHR";
		int ans=LongestCommonSubsequence.findTheLongestCommonSubsequenceLength(str1.toCharArray(), str2.toCharArray());
		System.out.println(ans);
	}

}
