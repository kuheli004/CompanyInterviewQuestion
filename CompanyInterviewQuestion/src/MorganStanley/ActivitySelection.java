package MorganStanley;

public class ActivitySelection {

	public static void main(String[] args) {
		 int s[] =  {1, 3, 0, 5, 8, 5};
		 int f[] =  {2, 4, 6, 7, 9, 9};
		 int n = s.length;
		     
		 printMaxActivities(s, f, n);

	}

	private static void printMaxActivities(int[] s, int[] f, int n) {
		int i=0;
		int count=1;
		System.out.print(i+" ");
		for(int j=1;j<n;j++) {
			if(s[j]>f[i])
			{
				System.out.print(j+" ");
				count++;
				i=j;
			}
		}
		System.out.println();
		System.out.println("No of Maximum Activity: "+count);
	}

}
