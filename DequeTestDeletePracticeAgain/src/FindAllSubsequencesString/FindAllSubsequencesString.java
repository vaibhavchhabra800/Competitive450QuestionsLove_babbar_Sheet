package FindAllSubsequencesString;

public class FindAllSubsequencesString {

	public static String[] findAllSubsequencesNow(String str)
	{
		if(str.length()==0)
		{
			String[] ansRetrun =new String[] {""};
			return ansRetrun;
		}
		String[] ans1 = findAllSubsequencesNow(str.substring(1));
		char ch =str.charAt(0);
		String[] finalAns = new String[2*ans1.length];
		int k =0;
		for(int i=0;i<ans1.length; i++)
		{
			finalAns[i] = ans1[i];
			k++;
		}
		for(int i=0;i<ans1.length; i++)
		{
			finalAns[k] = ch + ans1[i];
			k++;
		}
		return finalAns;
	}
	public static void main(String[] args) {
		String[] ans = findAllSubsequencesNow("abcde");
		for(int i=0; i <ans.length ; i++ )
		{
			System.out.println(ans[i]);
		}

	}

}
