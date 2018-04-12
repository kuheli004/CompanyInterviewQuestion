package Accolite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InFirstButNotInSecond {

	public static void main(String[] args) {
		int arr1[]= {4,3,5,9,11};
		int arr2[]= {4,9,3,11,10};
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
			
		}
		for(int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i]))
				hs.remove(arr2[i]);
			
		}
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}

}
