package GoldmanSachs;

public class SmallSubArraySum {

	public static void main(String[] args) {
	int arr[]= {1, 4, 45, 6, 0, 19};
	int x=51;
	int n=arr.length;
	int count =smallestSubArraySum(arr,n,x);
	System.out.println(count);

	}

	private static int smallestSubArraySum(int[] arr, int n, int x) {
	int end=0,start=0,minlen=n;
	while(end <n) {
		int currSum=0;
		
		while(currSum<=x && end<n)
			currSum+=arr[end++];
		while(currSum>x && start <n) {
			
			if((end -start)<minlen)
				minlen=end-start;
			
			currSum-=arr[start++];
		}
		
	}
		return minlen;
	}

}
