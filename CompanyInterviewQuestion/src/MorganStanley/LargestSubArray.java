package MorganStanley;

import java.util.HashMap;

public class LargestSubArray {

	public static void main(String[] args) {
		   LargestSubArray sub;
	        sub = new LargestSubArray();
	        int arr[] = {1, 0, 0, 1, 0, 1, 1};
	        int size = arr.length;
	 
	        sub.findSubArray(arr, size);
	        sub.maxLen(arr,size);

	}

	private int maxLen(int[] arr, int n) {

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
 
        int sum = 0;     // Initialize sum of elements
        int max_len = 0; // Initialize result
        int ending_index = -1;
        int start_index = 0;
 
        for (int i = 0; i < n; i++) 
        {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }
 
        // Traverse through the given array
  
        for (int i = 0; i < n; i++) 
        {
            // Add current element to sum
  
            sum += arr[i];
 
            // To handle sum=0 at last index
  
            if (sum == 0) 
            {
                max_len = i + 1;
                ending_index = i;
            }
 
            // If this sum is seen before, then update max_len
            // if required
  
            if (hM.containsKey(sum)) 
            {
                if (max_len < i - hM.get(sum + n)) 
                {
                    max_len = i - hM.get(sum + n);
                    ending_index = i;
                }
            } 
            else // Else put this sum in hash table
                hM.put(sum + n, i);
        }
 
        for (int i = 0; i < n; i++) 
        {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }
 
        int end = ending_index - max_len + 1;
        System.out.println(end + " to " + ending_index);
 
        return max_len;
		
	}

	private void findSubArray(int[] arr, int n) {
		int sum=0,maxSize=-1,startIndex=0,endIndex=0;
		for(int i=0;i<n-1;i++) {
			sum+=(arr[i]==0?-1:1);
			for(int j=i+1;j<n;j++) {
				if(arr[j]==0)
					sum+=-1;
				else
					sum+=1;
				if(sum==0 && maxSize<j-i+1)
				{
					maxSize=j-i+1;
					startIndex=i;
				}
			}
		}
		endIndex=startIndex+maxSize-1;
		if(maxSize==-1)
			System.out.println("No such SubArray");
		else
			System.out.println(startIndex+" To "+endIndex);
		
	}

}
