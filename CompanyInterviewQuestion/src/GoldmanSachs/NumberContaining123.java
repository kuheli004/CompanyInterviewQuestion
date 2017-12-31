package GoldmanSachs;

import java.util.Scanner;

public class NumberContaining123 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		if(has123(arr[i]))
			System.out.println(arr[i]);
	}

	}

	private static boolean has123(int num) {
		String str=String.valueOf(num);
		if((str.contains("4"))|| (str.contains("5"))||(str.contains("6"))||(str.contains("7"))
				||(str.contains("8"))||(str.contains("9"))||(str.contains("0")))
			return false;
		return true;
	}

}
