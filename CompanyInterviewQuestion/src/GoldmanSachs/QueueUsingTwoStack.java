package GoldmanSachs;

import java.util.Stack;

public class QueueUsingTwoStack {

	Stack<Integer> st1=new Stack<Integer>();
	Stack<Integer> st2=new Stack<Integer>();
	public static void main(String[] args) {
		QueueUsingTwoStack q=new QueueUsingTwoStack();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q.dequeue() +" is dequeed");
		q.enqueue(50);
		q.enqueue(60);
		System.out.println(q.dequeue()+" is dequeed");
		System.out.println("Size is::"+q.size());
		System.out.println("Empty::"+q.isEmpty());
		System.out.println("front is "+q.front());

	}

	private boolean isEmpty() {
		return st1.isEmpty()&& st2.isEmpty();
	}

	private int front() {
		if(st2.isEmpty()) {
			while(!st1.isEmpty()) 
				st2.add(st1.pop());
				
			}	
				
			return st2.peek();
		
	}

	private int size() {
		return (st1.size()+st2.size());
	}

	private int dequeue() {
	if(st2.isEmpty()) {
	while(!st1.isEmpty()) 
		st2.add(st1.pop());
		
	}	
		
	return st2.pop();
	}

	private void enqueue(int i) {
	st1.add(i);
	System.out.println(i+" is enqued");
		
	}

}
