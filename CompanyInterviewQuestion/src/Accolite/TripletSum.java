package Accolite;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		int A[] = {12, 3, 4, 1, 6, 9};
        int sum = 24;
        int arr_size = A.length;
 
        find3Numbers(A, arr_size, sum);

	}

	private static void find3Numbers(int[] arr, int arr_size, int sum) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr_size-2;i++) {
			int l=i+1;
			int r=arr_size-1;
			while(l<r) {
				if(arr[i]+arr[l]+arr[r]==sum)
				{
					System.out.println(arr[i]+ " "+arr[l]+" "+arr[r]);
					break;
				}
				else if(arr[i]+arr[l]+arr[r]<sum)
				l++;
				else 
				r--;
			}
			
		}
	}

}
