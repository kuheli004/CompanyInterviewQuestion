package GoldmanSachs;

import java.util.Stack;

public class sortStack {
	static Stack<Integer> st=new Stack<Integer>();

	public static void main(String[] args) {
		
		st.push(-3);
		st.push(14);
		st.push(18);
		st.push(-5);
		st.push(30);
		
		System.out.println(st);
		reverse();
		System.out.println(st);

	}

	private static void reverse() {
		if(!st.isEmpty()) {
			int s=st.pop();
			reverse();
			insert(s);
		}
		
	}

	private static void insert(int val) {
		if(st.isEmpty()|| val>st.peek())
			st.push(val);
		else
		{
			int c=st.pop();
			insert(val);
			st.push(c);
		}
		
	}

}
