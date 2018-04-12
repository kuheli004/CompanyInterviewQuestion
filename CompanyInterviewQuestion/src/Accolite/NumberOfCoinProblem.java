package Accolite;

public class NumberOfCoinProblem {

	public static void main(String[] args) {
		int coins[]= {9,6,5,1};
		int m=coins.length;
		int V=11;
		System.out.println(minCoins(coins,m,V));
	}

	private static int  minCoins(int[] coins, int m, int V) {
		int table[]=new int[V+1];
		table[0]=0;
		for(int i=1;i<=V;i++)
			table[i]=Integer.MAX_VALUE;
		for(int i=1;i<=V;i++) {
			for(int j=0;j<m;j++) {
				if(coins[j]<=i) {
					int subres=	table[i-coins[j]];
					if(subres!=Integer.MAX_VALUE && subres+1<table[i])
						table[i]=subres+1;
				}
			}
		}
		return table[V];
		
		
		
		
	}

}
