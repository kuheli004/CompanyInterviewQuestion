package MorganStanley;

public class OddToEven {

	public static void main(String[] args) {
	String str="536425";
	int n=str.length();
	int lastNum=str.charAt(n-1)-'0';
	for(int i=0;i<n-1;i++) {
		int c=str.charAt(i)-'0';
		if(c%2==0) {
			if(c<lastNum)
			{
			
				str=str.substring(0,i)+(char)(lastNum+'0')+str.substring(i+1,n-1)+(char)(c+'0');
				break;
			}
			else continue;
		}
	}
	System.out.println(str);
	}

}
