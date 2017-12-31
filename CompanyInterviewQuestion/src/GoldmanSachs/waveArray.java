package GoldmanSachs;

import java.util.Arrays;

public class waveArray {
	static int arr[]= { 1,2,3,4};
	public static void main(String args[]) {
	
		int n=arr.length;
		int finalArr[]=waveForm(arr,n);//nlogn Approach
		int finalArr2[]=waveForm2(arr,n);//n Approach
		System.out.println(Arrays.toString(finalArr2));
	}

	private static int[] waveForm2(int[] arr, int n) {
		for(int i=0;i<n;i+=2) {
			
			if(i>0 &&(arr[i]<arr[i-1]))
				swap(i,arr[i],arr[i-1]);
			
			if(i<n-1 &&(arr[i]<arr[i+1]))
				swap(i,arr[i],arr[i+1]);
		}
		return arr;
	}

	private static int[] waveForm(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-1;i+=2) {
			swap(i,arr[i],arr[i+1]);
		}
		
		return arr;
	}

	private static void swap(int i, int val1, int val2) {
		arr[i]=val2;
		arr[i+1]=val1;
		
	}

	

}
