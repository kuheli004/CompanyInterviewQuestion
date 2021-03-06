package Accolite;

public class KadenesAlgo {

	public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));


	}

	private static int maxSubArraySum(int[] a) {
		int n=a.length;
		int max_ending_here=0,max_so_far=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max_ending_here=max_ending_here+a[i];
			if(max_ending_here<0)
				max_ending_here=0;
			else if(max_ending_here>max_so_far)
				max_so_far=max_ending_here;
				
		}
		return max_so_far;
	}

}
