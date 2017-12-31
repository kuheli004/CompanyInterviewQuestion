package GoldmanSachs;

public class ReverseWordInString {

	public static void main(String[] args) {
		String str="i like this program very much";
		String fStr=reverseString(str);
		System.out.println(fStr);

	}

	private static String reverseString(String str) {
		if(str.indexOf(" ")==-1)
			return str;
		String revStr=str.substring(str.lastIndexOf(" ")+1)+" "
	+reverseString(str.substring(0, str.lastIndexOf(" ")));
		return revStr;
	}

}
