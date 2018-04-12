package Accolite;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSequencingProblem {

	public static void main(String[] args) {
	Job arr[]= {new Job('a',2,100),new Job('b',1,19),
			new Job('c',2,27),new Job('d',1,25),new Job('e',3,15)};
	int n=arr.length;
	   printJobScheduling(arr, n);
	}

	private static void printJobScheduling(Job[] arr, int n) {
	List<Job>li=Arrays.asList(arr);
	Collections.sort(li,new JobCompertaor());
	arr=(Job[]) li.toArray();
	int result[]=new int[n];
	boolean slot[]=new boolean[n];
	
	for(int i=0;i<n;i++) {
		for(int j=Math.min(n,arr[i].dead)-1;j>=0;j--) {
			if(slot[j]==false)
			{
				result[j]=i;
				slot[j]=true;
				break;
			}
		}
	}
	for (int i=0; i<n; i++) {
	       if (slot[i])
	     System.out.print(arr[result[i]].id+" ");
	}
	}
		

}
class Job{
	char id;
	int dead;
	int profit;
	public Job(char id, int dead, int profit) {
		super();
		this.id = id;
		this.dead = dead;
		this.profit = profit;
	}
	
	
	
}
class JobCompertaor implements Comparator<Job>{
	@Override
	public int compare(Job o1, Job o2) {
		// TODO Auto-generated method stub
		if(o1.profit>o2.profit)
			return -1;
		else 
			return 0;
	}
}