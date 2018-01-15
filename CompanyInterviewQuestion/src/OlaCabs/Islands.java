package OlaCabs;


public class Islands {
static final int ROW=5,COL=5;
	public static void main(String[] args) {
		 int M[][]=  new int[][] {{1, 1, 0, 0, 0},
             {0, 1, 0, 0, 1},
             {1, 0, 0, 1, 1},
             {0, 0, 0, 0, 0},
             {1, 0, 1, 0, 1}
            };
            Islands I=new Islands();
            System.out.println("Number of islands is: "+ I.countIslands(M));

	}

	private int  countIslands(int[][] M) {
		int count=0;
	boolean visited[][]=new boolean[ROW][COL];
	
	for(int i=0;i<ROW;i++) {
		for(int j=0;j<COL;j++) {
			if(M[i][j]==1 && !visited[i][j]) {
				DFS(M,visited,i,j);
			count++;
			}
		}
	}
	return count;
	
	}

	private void DFS(int[][] M, boolean[][] visited, int row, int col) {
		int rowNmbr[]=  {-1, -1, -1,  0, 0,  1, 1, 1};
		int colNmbr[]= {-1,  0,  1, -1, 1, -1, 0, 1};
		visited[row][col]=true;
		
		for(int k=0;k<8;k++) {
			if(isSafe(M,row+rowNmbr[k],col+colNmbr[k],visited))
				DFS(M,visited,row+rowNmbr[k],col+colNmbr[k]);
		}
		
	}

	private boolean isSafe(int[][] M, int row, int col, boolean[][] visited) {
		// TODO Auto-generated method stub
		return ((row>=0 && row<ROW)&&(col>=0 &&col<COL)&&
				((M[row][col]==1) &&(!visited[row][col])));
	}

}

