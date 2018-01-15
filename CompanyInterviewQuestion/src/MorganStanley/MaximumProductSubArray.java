package MorganStanley;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		 int arr[] = {1, -2, -3, 0, 7, -8, -2};
	        System.out.println("Maximum Sub array product is "+
	                            maxSubarrayProduct(arr));

	}

	private static int maxSubarrayProduct(int[] arr) {
	int max=1,min=1,max_so_far=1;
	int n=arr.length;
	for(int i=0;i<n;i++) {
		if(arr[i]>0) {
			max=max*arr[i];
			min=Math.min(1,min*arr[i]);
		}
		else if(arr[i]==0) {
			max=1;
			min=1;
		}
		else
		{
			int temp=max;
			max=Math.max(min*arr[i], 1);
			min=Math.min(temp*arr[i], 1);
			
		}
		
		if(max>max_so_far)
			max_so_far=max;
	}
		return max_so_far;
	}

}
