package Accolite;

public class WaysToReachNthStair {

	public static void main(String[] args) {
		int s = 4, m = 2;
        System.out.println("Nuber of ways = " + countWays(s, m));

	}

	private static int countWays(int s, int m) {
		return countWaysUtil(s+1,m);
	}

	private static int countWaysUtil(int n, int m) {
		int res[]=new int[n];
		res[0]=1;
		res[1]=1;
		for(int i=2;i<n;i++) {
			res[i]=0;
			for(int j=1;j<=m && j<=n;j++)
				res[i]+=res[i-j];
			
		}
		return res[n-1];
	}

}
