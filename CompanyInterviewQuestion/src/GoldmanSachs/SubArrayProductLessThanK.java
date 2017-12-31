package GoldmanSachs;

import java.util.ArrayList;

public class SubArrayProductLessThanK {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<Integer> ();
		    al.add(1);
		    al.add(2);
		    al.add(3);
		    al.add(4);
		    System.out.println(
		        countSubArrayProductLessThanK(al, 10));
		     
		    ArrayList<Integer> al1 = new ArrayList<Integer> ();
		    al1.add(1);
		    al1.add(9);
		    al1.add(2);
		    al1.add(8);
		    al1.add(6);
		    al1.add(4);
		    al1.add(3);
		    System.out.	println(
		         countSubArrayProductLessThanK(al1, 100));
		     
		    ArrayList<Integer> al2 = new ArrayList<Integer> ();
		    al2.add(5);
		    al2.add(3);
		    al2.add(2);
		    System.out.println(
		        countSubArrayProductLessThanK(al2, 16));
		     
		    ArrayList<Integer> al3 = new ArrayList<Integer> ();
		    al3.add(100);
		    al3.add(200);
		    System.out.println(
		        countSubArrayProductLessThanK(al3, 100));
		     
		    ArrayList<Integer> al4 = new ArrayList<Integer> ();
		    al4.add(100);
		    al4.add(200);
		    System.out.println(
		        countSubArrayProductLessThanK(al3, 101));

	}

	private static int countSubArrayProductLessThanK(ArrayList<Integer> al, long k) {
		int n=al.size();
		long p=1;
		int res=0;
		for(int start=0,end=0;end<n;end++) {
			p*=al.get(end);
			while(p>k)
				p/=al.get(start++);
			
			if(p<k) {
				int len=(end-start)+1;
				res+=len;
			}
			
			
		}
		return res;
	}

}
