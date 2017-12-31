package GoldmanSachs;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {
	static int front,rear,capacity,size;
	 int arr[];
	Queue(int capacity){
		this.capacity=capacity;
		front=this.size=0;
		rear=capacity-1;
		arr=new int[this.capacity];
		
	}
	private  int rear() {
		if(!isEmpty(this))
		return arr[rear];
		else 
			return Integer.MIN_VALUE;
	}
	
	private  int front() {
		if(!isEmpty(this))
			return arr[front];
			else 
				return Integer.MIN_VALUE;
	}
	
	private  void enqueue(int item) {
		if(isFull(this))
			return;
		else
		{
			rear=(rear+1)%capacity;
			arr[rear]=item;
			size=size+1;
		}
		
	}
	private  int dequeue() {
		
		if(!isEmpty(this))
		{
			int temp=arr[front];
			front=(front+1)%capacity;
			size=size-1;
			return temp;
		}
		return -1;
	}
	
	private  boolean isFull(Queue queue) {
		return (queue.size==queue.capacity);
		
	}
	private  boolean isEmpty(Queue queue) {
		return (queue.size==0);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue(10);
		int n=sc.nextInt();
		while(n-->0) {
			int c=sc.nextInt();
			switch(c) {
			case 1:
				int x=sc.nextInt();
				q.enqueue(x);
				break;
			case 2:
				q.dequeue();
				break;
			}
		}
		for(int i=front;i<=rear;i++) {
			System.out.println(q.arr[i]+" ");
		}

	}

}
