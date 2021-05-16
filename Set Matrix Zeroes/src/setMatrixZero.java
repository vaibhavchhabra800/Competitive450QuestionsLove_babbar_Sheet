import java.lang.*;
import java.util.*;
import java.io.*;
public class setMatrixZero {

	public static void main(String[] args) {
		int[][] matrix = {{5,6,0,8},{2,2,3,4},{1,5,0,6},{0,7,8,9}};
		
		Solution.setZeroes(matrix);

				
		
		
	}
}
	
class Solution {
    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int col0=1;
        int row0=1;
        for(int i=0;i<rows;i++)
        {
        	if (matrix[i][0]==0)
        		col0=0;
        }
        for(int i=0;i<columns;i++)
        {
        	if (matrix[0][i]==0)
        	{
        		row0=0;
        	}
        }
        for(int i =1;i<rows;i++)
        {
        	for(int j =1;j<columns;j++)
            {
            	if(matrix[i][j]==0)
            	{
            		matrix[i][0]=0;
            	    matrix[0][j]=0;
            	}
            }
        }
        
        
        
        
        for(int i =rows-1 ; i>0 ; i--)
        {
        	for(int j =columns-1;j>0;j--)
            {
        		if (matrix[i][0]==0||matrix[0][j]==0)
        		{
        			matrix[i][j]=0;
        		}
            }
        }
        
        for(int i=0;i<columns;i++)
        {
        	if(row0==0)
        	{
        		matrix[0][i]=0;
        	}
        }
        
        
        for(int i=0;i<rows;i++)
        {
        	if(col0==0)
        	{
        		matrix[i][0]=0;
        	}
        }
        
        System.out.println();
    }
}

