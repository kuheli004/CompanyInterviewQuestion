package MorganStanley;

public class MaxSumIncreasingSubsequences {

	public static void main(String[] args) {
		  int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
	        int n = arr.length;
	        System.out.println("Sum of maximum sum increasing "+
	                           " subsequence is "+
	        maxSumIS( arr, n ) );

	}

	private static int maxSumIS(int[] arr, int n) {
		int max=Integer.MIN_VALUE;
		int msis[]=new int[n];
		msis[0]=arr[0];
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && (msis[j]+arr[i])>msis[i])
					msis[i]=msis[j]+arr[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			if(msis[i]>max)
				max=msis[i];
		}
		return max;
	}

}
