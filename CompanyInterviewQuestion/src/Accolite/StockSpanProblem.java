package Accolite;

import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int S[]= new int[n];
         
        // Fill the span values in array S[]
      //  calculateSpan(price, n, S); 
        calculateSpanUsingStack(price, n, S); 
         
        // print the calculated span values
        printArray(S);

	}	

	private static void calculateSpanUsingStack(int[] price, int n, int[] s) {
		Stack<Integer> st=new Stack<>();
		st.push(0);
		s[0]=1;
		for(int i=1;i<n;i++) {
			
			while(!st.isEmpty() && price[st.peek()]<=price[i])
				st.pop();
			
			s[i]=st.isEmpty()?i+1:i-st.peek();
			st.push(i);
			
		}
		
		
		
	}

	private static void printArray(int[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
	}

	private static void calculateSpan(int[] price, int n, int[] s) {
		s[0]=1;
	for(int i=1;i<n;i++) {
		s[i]=1;
		int j=i-1;
		while(j>=0 && price[j]<=price[i]) {
			s[i]++;
			j--;
		}
	}
		
	}

}
