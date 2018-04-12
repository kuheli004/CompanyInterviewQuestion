package Accolite;

public class MissingRangeNumber {

	public static void main(String[] args) {
		  int arr[] = {88, 105, 3, 2, 200, 0, 10};
	        int n = arr.length;
	        printMissing(arr, n);

	}

	private static void printMissing(int[] arr, int n) {
		int limit=100;
		boolean seen[]=new boolean[limit];
		for(int i=0;i<n;i++) {
			if(arr[i]<limit)
				seen[arr[i]]=true;
		}
			
		
		int i=0;
		while(i<limit) {
			if(!seen[i]) {
				int j=i+1;
				while(j<limit && seen[j]==false)
					j++;
				int p=j-1;
				System.out.println(i+1==j?i:i+"-"+p);
				i=j;
			}
			else
				i++;
		}
	}

}
