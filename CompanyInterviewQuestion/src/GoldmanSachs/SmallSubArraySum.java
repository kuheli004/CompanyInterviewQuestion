package GoldmanSachs;

public class SmallSubArraySum {

	public static void main(String[] args) {
	int arr[]= {- 8, 1, 4, 2, -6};
	int x=6;
	int n=arr.length;
	int count =smallestSubArraySum(arr,n,x);
	System.out.println(count);

	}

	private static int smallestSubArraySum(int[] arr, int n, int x) {
	int end=0,start=0,minLen=n,currSum=0;
	
	while(currSum<=x && end <n) {
		
		if(currSum<0 && x>0 )
		{
			start=end;
			currSum=0;
		}
		currSum+=arr[end++];
	}
	
	while(currSum>x && start<n) {
		
		if(end-start<minLen)
			minLen=end-start;
		currSum-=arr[start++];
			
	}
	return minLen;
	
}

}