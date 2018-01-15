package MorganStanley;

public class CountWaysToReachNth {

	public static void main(String[] args) {
		   int s = 4,m=2;
	          System.out.println("Number of ways = "+ countWays(s));
	          System.out.println("Number of ways = "+ countWaysDynamic(s,m));

	}

	private static int countWaysDynamic(int s,int m) {
		// TODO Auto-generated method stub
		return countWaysDynamicUtil(s+1,m);
	}

	private static int countWaysDynamicUtil(int n,int m) {
		int res[]=new int[n];
		res[0]=1;
		res[1]=1;
		for(int i=2;i<n;i++) {
			res[i]=0;
			for(int j=1;j<=m && j<=i;j++) {
				res[i]+=res[i-j];
			}
		}
		return res[n-1];
		
	}

	private static int countWays(int s) {
		// TODO Auto-generated method stub
		return countWaysUtil(s+1);
	}

	private static int countWaysUtil(int s) {
		if(s<=1)
			return s;
		return countWaysUtil(s-1)+countWaysUtil(s-2);
	}

}
