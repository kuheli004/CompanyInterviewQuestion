		package MorganStanley;

import java.util.Scanner;

public class CountTheNumber {

	public static void main(String[] args) {
		{
			Scanner in=new Scanner(System.in);
			int count=0;
			int queries=in.nextInt();
			for(int i=0;i<queries;i++)
			{
			count=in.nextInt();
			int total=0;
			int n=count/100;
			int m=count%100;
			if(count>=10 && count<600) {
				
				
				total=(n*25)+5;
				if(m>=60){
					total+=25;
				}
				else if(m>=10 && m<60){
					int x1=m/5;
					if(x1%2==1)
					total+=(x1/2)*5;
					else 
						total+=(x1/2-1)*5+m%10;
				}
				
			}
			else if(count>600)
				total=(25*5)+5;
			else if(count<10) {
				if(count/5==1)
					total=5;
				else
					total=count%5;
			}

			System.out.println(total);
			}
		}

	}

}
