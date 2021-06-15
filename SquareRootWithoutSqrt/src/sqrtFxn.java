import java.lang.*;
import java.util.*;
public class sqrtFxn {
	
	
	public static void main(String[] args) {

	     
	     double givenNumber =2;
	     double result = 1;
	     double temp = givenNumber;
	     while(temp > result)
	     {
	        temp = (temp+result)/2;
	        result = givenNumber/temp;
	     }
	    System.out.println(temp);
	    


	}
}


