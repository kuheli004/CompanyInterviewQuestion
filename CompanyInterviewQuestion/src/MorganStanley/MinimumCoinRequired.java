package MorganStanley;

public class MinimumCoinRequired {

	public static void main(String[] args) {
		  int coins[] =  {9, 6, 5, 1};
	       int m = coins.length;
	       int V = 11;
	       System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
	       System.out.println("Minimum coins required is "+ minCoinsDynamic(coins, m, V) );

	    }

	private static int minCoinsDynamic(int[] coins, int m, int v) {
	int table[]=new int[v+1];
	table[0]=0;
	for(int i=1;i<=v;i++) {
		int subRes=0;
		table[i]=Integer.MAX_VALUE;
 		for(int j=0;j<m;j++) {
			if(coins[j]<=i)
				subRes=table[i-coins[j]];
		       	if(subRes!=Integer.MAX_VALUE && subRes+1<table[i])
				table[i]=subRes+1;
			
		}
	}
	return table[v];
	}

	private static int minCoins(int[] coins, int m, int v) {
		if(v==0)
			return 0;
		int res=Integer.MAX_VALUE;
		int subRes=0;
		for(int i=0;i<m;i++) {
			if(coins[i]<=v)
				 subRes=minCoins(coins,m,v-coins[i]);
			if(subRes!=Integer.MAX_VALUE && subRes+1<res)
				res=subRes+1;
		}
		return res;
	}
	

}
