package Walmart;

public class LongestRepeatedSubString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(longestRepeatedSubstring(str));
		

	}

	private static String longestRepeatedSubstring(String str) {
		int n=str.length();
		int LCS[][]=new int[n+1][n+1];
		String res="";
		int i=1;
		int index=0;
		int res_length=0;
		for( i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				
				if((str.charAt(i-1)==str.charAt(j-1)) && ((j-i)> LCS[i-1][j-1])) {
					LCS[i][j]=LCS[i-1][j-1]+1;
				if(LCS[i][j]>res_length)
				{
					res_length=LCS[i][j];
					index=Math.max(i,index);
				}
				}else
					LCS[i][j]=0;
				
			}
		}
		  if (res_length > 0) {
		        for (i = index - res_length + 1; i <= index; i++)
		           res+=str.charAt(i-1);
		  }
		  return res;
	}
}
