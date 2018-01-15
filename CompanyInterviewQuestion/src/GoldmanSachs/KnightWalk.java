package GoldmanSachs;

import java.util.LinkedList;

public class KnightWalk {

	public static void main(String[] args) {
		int N=6;
		int knightPos[]= {4,5};
		int targetPos[]= {1,1};
		System.out.println(minStepToReachTarget(knightPos,targetPos,N));
			

	}

	private static int  minStepToReachTarget(int[] knightPos, int[] targetPos, int N) {
		 int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
		  int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
		  cell t;
		  int x,y;
		  Boolean visit[][]=new Boolean[N+1][N+1];
		  LinkedList<cell> q = new LinkedList<cell>();
		  q.push(new cell(knightPos[0], knightPos[1], 0));
		  
		  for(int i=1;i<=N;i++) {
			  for(int j=1;j<=N;j++) {
				  visit[i][j]=false;
			  }
		  }
		  
		  visit[knightPos[0]][knightPos[1]]=true;
		  
		  while(!q.isEmpty()) {
			  t=q.removeFirst();
			 visit[t.x][t.y]=true;
			 
			 if(t.x==targetPos[0] && t.y==targetPos[1])
				 return t.dis;
			 for(int i=0;i<8;i++) {
				 x=t.x+dx[i];
				 y=t.y+dy[i];
				 
				 if(isInside(x,y,N) && !visit[x][y])
					 q.addLast(new cell(x,y,t.dis+1));
			 }
		  }
		  return -1;
	}

	private static boolean isInside(int x, int y, int N) {
			if(x>=1 && x<=N && y>=1 && y<=N)
				return true;
		return false;
	}

}
class cell{
	int x;
	int y;
	int dis;
	cell(){
		
	}
	cell(int x,int y,int dis){
		this.x=x;
		this.y=y;
		this.dis=dis;
	}

}