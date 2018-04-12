package Accolite;

public class StringPermutation {

	public static void main(String[] args) {
		String str="ABC";
		Permutation(str);
				
	}

	private static void Permutation(String str) {
		Permutation("",str);
		
	}

	private static void Permutation(String str1, String str2) {
		if(str2.isEmpty())
			System.out.println(str1);
		
		for(int i=0;i<str2.length();i++) {
			Permutation(str1+str2.charAt(i),str2.substring(0,i)+str2.substring(i+1));
		}
	}

}
