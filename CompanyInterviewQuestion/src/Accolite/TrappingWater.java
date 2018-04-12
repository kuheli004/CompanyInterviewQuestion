package Accolite;

public class TrappingWater {

	public static void main(String[] args) {
		int arr[]={3,0,0,2,0,4};
		int n=arr.length;
			System.out.println("trapped water is::"+findWater(arr,n));

	}

	private static int  findWater(int[] arr, int n) {
	int left_max=0, right_max=0,result=0;
	int lo=0,high=n-1;
	while(lo<=high) {
		if(arr[lo]<arr[high]) {
			if(arr[lo]>left_max)
				left_max=arr[lo];
			else
				result+=left_max-arr[lo];
			lo++;
		}
		else
		{
			if(arr[high]>right_max)
				right_max=arr[high];
			else
				result+=right_max-arr[high];
			high--;
		}
	}
	return result;
	
	}

}
