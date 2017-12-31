package GoldmanSachs;

import java.util.Stack;

public class sortStackUsingTmpStack {
	static Stack<Integer> st=new Stack<>();
	
	public static void main(String[] args) {

		st.push(-3);
		st.push(14);
		st.push(18);
		st.push(-5);
		st.push(30);
	
		System.out.println(st);
			Stack<Integer> sortedStack=sortStack();
		System.out.println(sortedStack);

	}
	private static Stack<Integer> sortStack() {
		 Stack<Integer> tmpStck=new Stack<>();
		while(!st.isEmpty()) {
			int tmp=st.pop();
			while(!tmpStck.isEmpty() && tmpStck.peek()>tmp)
			{
				st.push(tmpStck.pop());
			}
			tmpStck.push(tmp);
		}
		return tmpStck;
	}

}
