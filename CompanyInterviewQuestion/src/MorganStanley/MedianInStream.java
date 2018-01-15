package MorganStanley;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class MedianInStream {
public static double[] getMedians(int[] arr) {
	
	
	Comparator<Integer> cmp=new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			Integer a=(Integer)o1;
			Integer b=(Integer)o2;
			return -1*a.compareTo(b);
		}

		
	};
	PriorityQueue<Integer> lower=new PriorityQueue<>(cmp);
	PriorityQueue<Integer> higher=new PriorityQueue<>();
	double[] median=new double[arr.length];
	for(int i=0;i<arr.length;i++) {
		int number=arr[i];
		addNumber(number,lower,higher);
		rebalance(lower,higher);
		median[i]=getMedian(lower,higher);
	}
	return median;
}
	private static double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> biggerHeap=lower.size()>higher.size()?lower:higher;
		PriorityQueue<Integer> smallerHeap=lower.size()>higher.size()?higher:lower;
		
		if(biggerHeap.size()==smallerHeap.size())
			return(biggerHeap.peek()+smallerHeap.peek())/2;
		else
		return	biggerHeap.peek();
}
	private static void rebalance(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		PriorityQueue<Integer> biggerHeap=lower.size()>higher.size()?lower:higher;
		PriorityQueue<Integer> smallerHeap=lower.size()>higher.size()?higher:lower;
		if(biggerHeap.size()-smallerHeap.size()>=2)
			smallerHeap.add(biggerHeap.poll());
	
}
	private static void addNumber(int number, PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
		if(lower.size()==0 || number <lower.peek())
			lower.add(number);
		else
			higher.add(number);
	
}
	public static void main(String[] args) {
	int arr[]= {5,15,1,3};
	System.out.println(Arrays.toString(getMedians(arr)));

	}

}
