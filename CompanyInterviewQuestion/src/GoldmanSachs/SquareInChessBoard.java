package GoldmanSachs;

public class SquareInChessBoard {

	public static void main(String[] args) {
		int n=8;
		System.out.println(findSquare(n));
	}

	private static int findSquare(int n) {
	return (n*(n+1)*((2*n)+1)/6);
	}

}
