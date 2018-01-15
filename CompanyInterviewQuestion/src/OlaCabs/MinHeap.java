package OlaCabs;

public class MinHeap {
	int harr[];
	int capacity;
	int heap_size;
	MinHeap(int cap){
		capacity=cap;
		heap_size=0;
		harr=new int[cap];
	}
	public int parent(int i) {
		return (i-1)/2;
	}
	public int left(int i) {
		return (2*i+1);
	}
	public int right(int i) {
		return (2*i+2);
	}
	public int getMin() {
		return harr[0];
	}
	public void insertKey(int k) {
		if(heap_size==capacity)
		{
			System.out.println("OVERFLOW.Couldn't insert key");
		}
		
		heap_size++;
		int i=heap_size-1;
		harr[i]=k;
		while(i!=0 && harr[parent(i)]>harr[i]) {
			swap(parent(i),i);
		i=parent(i);
		
		}
	}
	public void decreaseKey(int i,int new_val) {
		harr[i]=new_val;
		while(i!=0 && harr[parent(i)]>harr[i]) {
			swap(parent(i),i);
		i=parent(i);
		
		}
	}
	public int extractMin() {
		if(heap_size<=0)
			return Integer.MIN_VALUE;
		if(heap_size==1)
		{
			heap_size--;
			return harr[0];
		}
		int root=harr[0];
		harr[0]=harr[heap_size-1];
		heap_size--;
		MinHeapify(0);
		return root;
	}

	public void deleteKey(int i) {
		decreaseKey(i,Integer.MIN_VALUE);
		extractMin();
	}
	public void MinHeapify(int i) {
		int l=left(i);
		int r=right(i);
		int smallest=i;
		if(l<heap_size && harr[l]<harr[i])
			smallest=l;
		if(r<heap_size && harr[r]<harr[smallest])
			smallest=r;
		if(smallest!=i)
		{
			swap(i,smallest);
			MinHeapify(smallest);
			
		}
		
	}
	private void swap(int i, int j) {
		int temp=harr[i];
		harr[i]=harr[j];
		harr[j]=temp;
	}
	public static void main(String[] args) {
		MinHeap h=new MinHeap(11);
		h.insertKey(3);
		h.insertKey(2);
		h.deleteKey(1);
		h.insertKey(15);
		h.insertKey(5);
		h.insertKey(4);
		h.insertKey(45);
		System.out.println(h.extractMin());
		System.out.println(h.getMin());
		 h.decreaseKey(2, 1);
		 System.out.println(h.getMin());
	}

}
