package OlaCabs;

public class ArithmeticNumber {

	public static void main(String[] args) {
		int A=1;
		int B=2;
		int C=3;
		System.out.println(isExistInSeries(A,B,C));

	}

	private static boolean isExistInSeries(int a, int b, int c) {
		/*if(c!=0 && ((b-a)%c==0)) {
			return true;
			
		}
		else if(c==0 && a==b)
			return true;
		else
			return false;*/
		return(c!=0?((b-a)%c==0):a==b);
	}

}
