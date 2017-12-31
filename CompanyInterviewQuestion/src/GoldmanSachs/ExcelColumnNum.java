package GoldmanSachs;

public class ExcelColumnNum {

	public static void main(String[] args) {
	System.out.println(findExcelColName(52));

	}

	private static String  findExcelColName(int n) {
		StringBuffer br=new StringBuffer();
		if(n<=26)
			return br.append((char)n+65).toString();
		while(n>0) {
			int t=n%26;
			if(t==0) {
				t=26;
				n=n-1;
			}
			char c=(char) (t-1+'A');
			br.append(c);
			n=n/26;
		}
		return br.reverse().toString();
	}

}
