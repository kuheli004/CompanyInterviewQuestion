package MorganStanley;

public class KadenesAlgorithm {

	public static void main(String[] args) {
	    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	    int n = a.length;   
	    int max_sum = maxSubArraySum(a, n);
	    System.out.println("Maximum contiguous sum is "
	                       + max_sum);
	    System.out.println("Maximum contiguous sum using dynamic Programming "
                + MaxSumDynamic(a,n));
}

	private static int MaxSumDynamic(int[] a, int n) {
		int max_end_here=0;
		int max_so_far=0;
		for(int i=0;i<n;i++) {
			max_end_here=Math.max(a[i],max_end_here+a[i]);
			max_so_far=Math.max(max_so_far, max_end_here);
	}
		return max_so_far;
	}
	

	private static int maxSubArraySum(int[] a, int n) {
		int max_end_here=0;
		int max_so_far=0;
		for(int i=0;i<n;i++) {
			max_end_here=max_end_here+a[i];
			if(max_end_here<0)
				max_end_here=0;
			else if(max_end_here>max_so_far)
				max_so_far=max_end_here;
		}
		return max_so_far;
	}

}
