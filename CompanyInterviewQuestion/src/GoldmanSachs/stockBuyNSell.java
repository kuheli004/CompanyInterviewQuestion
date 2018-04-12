package GoldmanSachs;

public class stockBuyNSell {
	static  int price[] = {100, 180, 170, 310, 40, 535, 695,20,700};


	public static void main(String[] args) {

		  int n=price.length;
		  stockBuySell(price, n);

	}


	private static void stockBuySell(int[] price, int n) {
		int pos=0,p=0;
		for(int i=0;i<n-1;i+=p) {
			int buy=price[i];
			p=0;
			int max_sell=Integer.MIN_VALUE;
			for(int k=i+1;k<n;k++) {
				p++;
				int sell=price[k];
				if(sell>buy && sell>max_sell) {
					max_sell=sell;
					pos=k;
				}
				else if(sell <buy) {
					
					break;
				}
					
				
			}
			System.out.println("Buy at:::"+i+" sell at::"+pos);
		}
		
	}

}
