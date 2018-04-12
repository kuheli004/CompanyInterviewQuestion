package GoldmanSachs;

public class MaximumConsecutiveRepeat {

	public static void main(String[] args) {
		String str = "aabbbbaaccdeeeeeeeee";
        System.out.println(maxRepeating(str));

	}

	private static char maxRepeating(String str) {
	int n=str.length();
	char res=str.charAt(0);
	int count=1,maxCount=1;
	
	for(int i=0;i<n;i++) {
		
	if(i<n-1 && str.charAt(i)==str.charAt(i+1))
		count++;
	else
	{
		if(count>maxCount) {
			maxCount=count;
			res=str.charAt(i-1);
		}
		count=1;
	}
		
	}
		
		
		
		return res;
	}

}
