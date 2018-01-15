package MorganStanley;

public class KnapSackProblem {

	public static void main(String[] args) {
		   int val[] = new int[]{60, 100, 120};
		    int wt[] = new int[]{10, 20, 30};
		    int  W = 50;
		    int n = val.length;
		    System.out.println(knapSack(W, wt, val, n));

	}

	private static int knapSack(int W, int[] wt, int[] val, int n) {
	int T[][]=new int[n+1][W+1];
	
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=W;j++) {
			if(i==0||j==0)
				T[i][j]=0;
			else if(wt[i-1]<=j)
			{
				T[i][j]=Math.max(val[i-1]+T[i-1][j-wt[i-1]], T[i-1][j]);
			}
			else
			T[i][j]=T[i-1][j];
		}
	}
	
		return T[n][W];
	}

}
