package MorganStanley;

public class Replace3With4 {

	public static void main(String[] args) {
		int n=135;
		int nn=reverse(n);
		System.out.println(replaceNumber(nn));

	}

	private static int reverse(int n) {
		int sum=0;
		while(n!=0) {
			int t=n%10;
			sum=sum*10+t;
			n=n/10;
			
		}
		return sum;
	}

	private static int  replaceNumber(int n) {
		int sum=0;
		while(n!=0) {
			int t=n%10;
			if(t==3)
				t=4;
			sum=sum*10+t;
			n=n/10;
			
		}
		return sum;
	}

}
