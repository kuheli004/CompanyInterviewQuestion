package MorganStanley;

import java.util.Arrays;

public class NextGreaterNumber {

	public static void main(String[] args) {
		 char digits[] = { '5','3','4','9','7','6' };
	        int n = digits.length;
	        findNext(digits, n);
	}

	private static void findNext(char[] arr, int n) {
	int i;
	for(i=n-1;i>=0;i--) {
		if(arr[i]>arr[i-1])
			break;
	}
		
	if(i==0)
	{
		System.out.println("Not Possible");
	}
	else {
		int x=arr[i-1]-48,min=i;
		for(int j=i+1;j<n;j++) {
			if((arr[j]-48)>x && (arr[j]-48)<(arr[min]-48))
				min=j;
		}
		swap(arr,i-1,min);
		Arrays.sort(arr,i,n);
		
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	}

	private static void swap(char[] arr, int i, int min) {
	char temp=arr[i];
	arr[i]=arr[min];
	arr[min]=temp;
		
	}

}
