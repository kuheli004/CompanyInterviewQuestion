package MorganStanley;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int arr[]= {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int n=arr.length;
		System.out.println(Arrays.toString(RemoveDuplicate(arr,n)));
		RemoveDuplicateConstantExtraSpace(arr,n);
	}

	private static void RemoveDuplicateConstantExtraSpace(int[] arr, int n) {
		
		if(n==0)
		{
			
			System.out.println(0);
		}
		else if(n==1) {
			System.out.println(arr[0]);
		}
		else
		{
			int j=0,i=0;
		
			for(;i<n-1;i++) {
				if(arr[i]!=arr[i+1]) {
					arr[j++]=arr[i];
				}
			}
			arr[j++]=arr[n-1];
			for(int k=0;k<j;k++)
				System.out.print(arr[k]+" ");
			
		}
		
	}

	private static int[] RemoveDuplicate(int[] arr, int n) {
		int temp[]=new int[n];
		if(n==0)
		{
			temp[0]=0;
			return temp;
		}
		else if(n==1) {
			temp[0]=arr[0];
			return temp;
		}
		else
		{
			int j=0,i=0;
		
			for(;i<n-1;i++) {
				if(arr[i]!=arr[i+1]) {
					temp[j++]=arr[i];
				}
			}
			temp[j]=arr[n-1];
			
			return temp;
		}
		
		
	}

}
