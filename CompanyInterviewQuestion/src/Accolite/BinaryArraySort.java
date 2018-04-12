package Accolite;

public class BinaryArraySort {

	public static void main(String[] args) {
		   int a[] = { 1, 0, 0, 1, 0};
	 
	        int n = a.length;
	 
	        sortBinaryArray(a, n);
	 
	        for (int i = 0; i < n; i++)
	            System.out.print(a[i] + " ");

	}

	private static void sortBinaryArray(int[] arr, int n) {
		int j=-1;
		for(int i=0;i<n;i++) {
			
			if(arr[i]<1)
			{
				j++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
	}

}
