package Accolite;

public class AddTwoArrayNumber {

	public static void main(String[] args) {
		 int b[] = { 9,5,4,9};
         int a[] = { 2, 1, 4 };
      
         int n = a.length;
         int m = b.length;
     System.out.println(calSum(a, b, n, m));
	}

	private static int calSum(int[] a, int[] b, int n, int m) {
		if(n>=m)
		return	calSumUtil(a, b, n, m);
		return 	calSumUtil(b, a, m, n);
	}

	private static int calSumUtil(int[] a, int[] b, int n, int m) {
		int  sum[]=new int[n+1];
		int i=n-1,j=m-1,k=n;
		int c=0,s=0,ans=0;
		while(j>=0) {
			s=a[i]+b[j]+c;
			c=s/10;
			sum[k]=s%10;
			j--;
			k--;
			i--;
			
		}
		while(i>=0) {
			s=a[i]+c;
			c=s/10;
			sum[k]=s%10;
			k--;
			i--;
		}
		if(c==1)
			sum[k]=c;
		
		for( i=k;i<=n;i++) {
		ans=ans*10+sum[i];
		}
		
		return ans;
	}

}
