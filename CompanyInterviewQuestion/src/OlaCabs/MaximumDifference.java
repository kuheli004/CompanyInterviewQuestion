package OlaCabs;

public class MaximumDifference {

	public static void main(String[] args) {
	    MaximumDifference maxdif = new MaximumDifference();
        int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;
        System.out.println("MaximumDifference is " + 
                                maxdif.maxDiff(arr, size));
        System.out.println("MaximumDifference is " + 
                maxdif.maxDiffFromBack(arr, size));

	}
	
	//Using Maximum Element
private int  maxDiffFromBack(int[] arr, int size) {
	int max_diff=-1;
	int maxElem=arr[size-1];
	for(int i=size-2;i>=0;i--) {
		if(maxElem-arr[i]>max_diff)
			max_diff=maxElem-arr[i];
		else if(arr[i]>maxElem)
			maxElem=arr[i];
	}
	return max_diff;
	}
//Using Minimum Element
	private int maxDiff(int[] arr, int size) {
	int max_diff=-1;
	int minElem=arr[0];
	for(int i=1;i<size;i++) {
		if(arr[i]-minElem>max_diff)
			max_diff=arr[i]-minElem;
		else if(arr[i]<minElem)
			minElem=max_diff;
			
	}
	return max_diff;
	}
	

	
	
	

}
