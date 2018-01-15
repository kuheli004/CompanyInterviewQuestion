package MorganStanley;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistinctElement {

	public static void main(String[] args) {
		  int arr[] = {2, 4, 1, 5, 3, 5, 1, 3};
	        int m = 3;
	 
	        System.out.println(distinctIds(arr, arr.length, m));

	}

	private static int  distinctIds(int[] arr, int n, int m) {
		
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int count=0,size=0;
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i],1);
				size++;
			}
		}
		for(Map.Entry<Integer,Integer> e:hm.entrySet()) {
			if(e.getValue()<=m)
			{
				m-=e.getValue();	
				count++;
				
			}
			else
			return size-count;
			
			}
		return size-count;
		}
	
	

}
