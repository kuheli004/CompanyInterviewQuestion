package GoldmanSachs;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			String str1=sc.next();
			String str2=sc.next();
			int n1=str1.length();
			int n2=str2.length();
			int len=n1+n2;
			char ch[]=new char[len];
			int i=0,j=0,k=0;
			while(i<n1 && j<n2) {
				ch[k]=str1.charAt(i);
				ch[k+1]=str2.charAt(j);
				i++;
				j++;
				k+=2;
			}
			while(i<n1)
			{
				ch[k]=str1.charAt(i);
				i++;
				k++;
				
			}
			while(j<n2)
			{
				ch[k]=str2.charAt(j);
				j++;
				k++;
				
			}
			
			System.out.println(String.valueOf(ch));
		}
	}

}
