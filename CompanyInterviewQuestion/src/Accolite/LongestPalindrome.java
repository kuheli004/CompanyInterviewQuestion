package Accolite;

public class LongestPalindrome {

	public static void main(String[] args) {
		   String str = "forgeeksskeegfor";
	        System.out.println("Length is: " + 
	                           longestPalSubstr(str));

	}

	private static int longestPalSubstr(String str) {
		if(str==null) return 0;
		String longest=str.substring(0,1);
		for(int i=0;i<str.length()-1;i++) {
		String palindromeOdd=findPalindrome(str,i,i);
		if(palindromeOdd.length()>longest.length())
			longest=palindromeOdd;
		String palindromeEven=findPalindrome(str,i,i+1);
		if(palindromeEven.length()>longest.length())
			longest=palindromeEven;
		
		}
		System.out.println(longest);
		return longest.length();
	}

	private static String findPalindrome(String str, int low, int high) {
		if(low>high)
			return null;
		while(low>=0 && high<str.length() 
			&&str.charAt(low)==str.charAt(high))
			{
			low--;
			high++;	
			}
		return str.substring(low+1,high);
	}

}
