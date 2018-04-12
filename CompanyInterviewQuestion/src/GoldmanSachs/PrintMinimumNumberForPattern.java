package GoldmanSachs;
p0
import java.util.Stack;

public class PrintMinimumNumberForPattern {

	public static void main(String[] args) {
		PrintMinNumberForPattern("IDID");
	    PrintMinNumberForPattern("I");
	    PrintMinNumberForPattern("DD");
	    PrintMinNumberForPattern("II");
	    PrintMinNumberForPattern("DIDI");
	    PrintMinNumberForPattern("IIDDD");
	    PrintMinNumberForPattern("DDIDDIID");
	}

	private static void PrintMinNumberForPattern(String seq) {
		String result="";
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i=0;i<=seq.length();i++) {
			st.push(i+1);
		if(i==seq.length()|| seq.charAt(i)=='I')
			while(!st.isEmpty()) {
				result+=st.peek();
				result+=" ";
				st.pop();
			}
		}
		System.out.println(result);
	}

}
