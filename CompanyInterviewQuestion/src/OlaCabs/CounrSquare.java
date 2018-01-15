package OlaCabs;

public class CounrSquare {

	public static void main(String[] args) {
	int temp=39;
	CountSquare(temp);

	}

	private static void CountSquare(int num) {
	int temp=(int) Math.sqrt(num);
	if(temp * temp==num)
		System.out.println(temp-1);
	else 
		System.out.println(temp);
	}

}
