
public class ReturnAllSubsequencesString {

	
	public static String[] returnAllStringswa(String str)
	{
		if(str.length()==0)
		{
			String[] answer= {""};
			return answer;
		}
		String[] smallAnswer= returnAllStringswa(str.substring(1));
		String[] finalAnswer= new String[2*smallAnswer.length];
		for(int i=0;i<smallAnswer.length;i++) {
			finalAnswer[i]=smallAnswer[i];
		}
		for(int i=smallAnswer.length;i<(2*smallAnswer.length);i++) {
			finalAnswer[i]=str.charAt(0)+smallAnswer[i-smallAnswer.length];
		}
		
		
		return finalAnswer ;
	}
	
	public static void main(String[] args) {

		String[] ans=ReturnAllSubsequencesString.returnAllStringswa("abc");
		for(String str:ans)
		{
			
			System.out.println(str);
		}
	}

}
