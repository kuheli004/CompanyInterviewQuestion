package OlaCabs;

public class CountAllPalindromeSubString {

	public static void main(String[] args) {
		String str="abbaeae";
		int n=str.length();
		System.out.println(CountAllPalindromeSubString(str,n));

	}

	private static int  CountAllPalindromeSubString(String str, int n) {
		
		int count=0;
		for(int i=0;i<n-1;i++) {
			StringBuffer sb=new StringBuffer();
			sb.append(str.charAt(i));
			for(int j=i+1;j<n;j++) {
				sb.append(str.charAt(j));
				if(checkpalin(sb.toString()))
					count++;
				
			}
		}
		return count;
	}

	private static boolean checkpalin(String str) {
		if(str.length()==1)
			return false;
	
		String oldStr=new StringBuffer(str).reverse().toString();
		if(str.equals(oldStr))
			return true;
		return false;
		
	}

	
}
