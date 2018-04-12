package GoldmanSachs;

import java.util.HashSet;

public class SubArrayZeroSum {

	public static void main(String[] args) {
		int arr[] = {-3, 2, 3, 1, 6};
        if (subArrayExists(arr))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");   
	}

	private static boolean subArrayExists(int[] arr) {
		HashSet<Integer> hm=new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]==0|| sum==0|| hm.contains(sum))
				return true;
			hm.add(sum);
		}
		return false;
	}

}
