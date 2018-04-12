package Accolite;

public class FindTwoNonRepeatingNumber {
	static int x;
	static int y;
	public static void main(String[] args) {
		int arr[]= {2,1,3,2};
	
		get2NonRepeatingNos(arr, 4);
		System.out.println(x+" "+y);
		
	}
	private static void get2NonRepeatingNos(int[] arr, int n) {
	int xor=arr[0];
	int set_bit_no=0;
	for(int i=1;i<n;i++)
		xor=xor ^arr[i];
	set_bit_no=xor &~(xor-1);
	for(int i=0;i<n;i++)
	{
		if((arr[i]&set_bit_no)==0)
		x=x^arr[i];
		else
		y=y^arr[i];
			
	}
	
	}

}
