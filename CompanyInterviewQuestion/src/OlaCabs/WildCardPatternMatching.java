package OlaCabs;

public class WildCardPatternMatching {

	public static void main(String[] args) {
		  String str = "baaabab";
		  	String pattern = "?*ba***b";
		
	        //String pattern = "ba*****ab";
	        // String pattern = "ba*ab";
	        // String pattern = "a*ab";
	        // String pattern = "a*****ab";
	        // String pattern = "*a*****ab";
	        // String pattern = "ba*ab****";
	        // String pattern = "****";
	        // String pattern = "*";
	        // String pattern = "aa?ab";
	        // String pattern = "b*b";
	        // String pattern = "a*a";
	        // String pattern = "baaabab";
	        // String pattern = "?baaabab";
	        // String pattern = "*baaaba*";
	      
	        if (strmatch(str, pattern, str.length(),
	                             pattern.length()))
	            System.out.println("Yes");
	        else
	            System.out.println("No");

	}

	private static boolean strmatch(String str, String patt, int m, int n) {
		Boolean T[][]=new Boolean[m+1][n+1];
		T[0][0]=true;
		for(int i=1;i<=m;i++) {
			T[i][0]=false;
		}
		for(int j=1;j<=n;j++) {
			if(patt.charAt(j-1)=='*')
				T[0][j]=T[0][j-1];
			else 
				T[0][j]=false;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(str.charAt(i-1)==patt.charAt(j-1)||patt.charAt(j-1)=='?')
					T[i][j]=T[i-1][j-1];
				else if(patt.charAt(j-1)=='*')
					T[i][j]=T[i-1][j]||T[i][j-1];
				else
					 T[i][j]=false;
					
			}
			
		}
		return T[m][n];
	}

}
