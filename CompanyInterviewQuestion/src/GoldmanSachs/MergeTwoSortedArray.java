package GoldmanSachs;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
	int arr1[]= {20,25,30};
	int arr2[]= {21,22,23,26,27};
	int newArr[]=mergeArray(arr1,arr2,arr1.length,arr2.length);
	System.out.println(Arrays.toString(newArr));
	}

	private static int[] mergeArray(int[] arr1, int[] arr2, int n1, int n2) {
		int len=n1+n2;
		int newArr[]=new int[len];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				newArr[k++]=arr1[i++];
			}
			else
				newArr[k++]=arr2[j++];
		}
		
		while(i<n1) {
			newArr[k++]=arr1[i++];
		}
		while(j<n2)
		{
			newArr[k++]=arr2[j++];
		}
		return newArr;
	}

}
