package MorganStanley;

public class Atoi {

	public static void main(String[] args) {
		String str="1433";
		int n=str.length();
		System.out.println(StringToNumber(str));
		System.out.println(recursiveAtoi(str,n));

	}

	private static int  recursiveAtoi(String str,int n) {
		if(n==1)
			return str.charAt(n-1)-'0';
		return (10*recursiveAtoi(str,n-1)+ str.charAt(n-1)-'0');
	}

	private static int StringToNumber(String str) {
		if(str==null)
			return -1;
		boolean sign=true;
		int i=0;
		int sum=0;
		if(str.charAt(0)=='-') {
			sign =false;
			i++;
		}
		
		for(;i<str.length();i++) {
			int t=str.charAt(i)-'0';
			if(t>=0 && t<=9)
			sum=sum*10+t;
			else
			{
				sum=-1;
				return sum;
			}
		}
		if(!sign)
		return sum*-1;
		return sum;
	}

}
