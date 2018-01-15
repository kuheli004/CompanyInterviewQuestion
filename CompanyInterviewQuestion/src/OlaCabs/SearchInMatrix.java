package OlaCabs;

public class SearchInMatrix {

	public static void main(String[] args) {
		int m=3,n=3;
		int temp[][]= {{3,30,38},{44,52,54},{57,60,69}};
		int x=57;
		System.out.println(search(temp,x,m,n));
	}

	private static String search(int[][] temp, int x,int m,int n) {
	int i=0,j=n-1;
	while(i<n && j>=0) {
		if(x==temp[i][j])
			return ("i:"+i+" "+"j:"+j);
		else if(x>temp[i][j])
			i++;
		else 
			j--;
	}
		return "not found";
	}

}
