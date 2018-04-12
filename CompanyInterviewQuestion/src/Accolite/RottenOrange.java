package Accolite;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottenOrange {
static Queue<Orange> q=new ArrayDeque<Orange>();
	public static void main(String[] args) {
		int arr[][] =  {{2, 1, 0, 2, 1},
		 	    {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
			int ans = rotOranges(arr);
			if (ans == -1)
				System.out.println("All oranges cannot rot\n");
			else
				System.out.println("Time required for all oranges to rot => "+ans);
	
	}

	private static int rotOranges(int[][] arr) {
		int N=arr.length;
		int M=arr[0].length;
		int currTime=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j]==2)
					q.add(new Orange(i,j,currTime));
			}
		}
		while(!q.isEmpty()) {
			Orange o=q.remove();
			currTime=o.currTime;
			if(o.i+1<N && arr[o.i+1][o.j]==1) {
				 arr[o.i+1][o.j]=2;
				q.add(new Orange(o.i+1,o.j,currTime+1));
			}
			
			if(o.i-1>=0 && arr[o.i-1][o.j]==1) {
				 arr[o.i-1][o.j]=2;
				q.add(new Orange(o.i-1,o.j,currTime+1));
			}
			if(o.j+1<M && arr[o.i][o.j+1]==1) {
				 arr[o.i][o.j+1]=2;
				q.add(new Orange(o.i,o.j+1,currTime+1));
			}
			if(o.j-1>=0 && arr[o.i][o.j-1]==1) {
				 arr[o.i][o.j-1]=2;
				q.add(new Orange(o.i,o.j-1,currTime+1));
			}
		}
		return currTime;
	}

}
class Orange{
	int i;
	int j;
	int currTime;
	public Orange(int i, int j, int currTime) {
		super();
		this.i = i;
		this.j = j;
		this.currTime = currTime;
	}
	
	
}
