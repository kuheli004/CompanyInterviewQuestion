package OlaCabs;

public class StockBuyNSell {
	static  int price[] = {100, 180, 170, 310, 40, 535, 695};

	public static void main(String[] args) {
		  int n=price.length;
		  stockBuySell(price, n);
	}

	private static void stockBuySell(int[] price, int n) {
		int pos=0,maxSell,buy=0,sell=0,p=0;
		for(int i=0;i<price.length-1;i+=p) {
			 buy=price[i];
			  p=0;
			  maxSell=Integer.MIN_VALUE;
			 for(int k=i+1;k<price.length;k++) {
				 p++;
				  sell=price[k];
				  if(sell>buy && sell > maxSell)
				  {
					  maxSell=sell;
					  pos=k;
				  }
				  else if(sell<buy)
					  break;
				  
				  
			 }
			  System.out.println("buy: "+i+" Sell:"+pos);
		}
		
	}

}
