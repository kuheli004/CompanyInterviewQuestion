package Accolite;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		   int arr[] = {10, 3, 5, 6, 2};
	        int n = arr.length;
	        System.out.println("The product array is : ");
	        productArray(arr, n);

	}

	private static void productArray(int[] arr, int n) {
		int totalSum=1;
		for(int i=0;i<n;i++) {
			totalSum*=arr[i];
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=totalSum/arr[i];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
