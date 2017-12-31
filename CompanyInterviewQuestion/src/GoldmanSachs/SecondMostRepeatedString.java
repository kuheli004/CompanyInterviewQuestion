package GoldmanSachs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class SecondMostRepeatedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			Map<String,Integer> hm=new HashMap<String,Integer>();
			int len=sc.nextInt();
			String arr[]=new String[len];
			for(int i=0;i<len;i++) {
				arr[i]=sc.next();
				if(hm.containsKey(arr[i]))
				{
					hm.put(arr[i], hm.get(arr[i])+1);
				}
				else
					hm.put(arr[i], 1);
			}
			Set<Entry<String, Integer>> hs=hm.entrySet();
			int max=0,secMax=0;
			String maxStr="",secMaxStr="";
			for(Entry e:hs) {
				int val=(int) e.getValue();
				if(val>max) {
					secMax=max;
					secMaxStr=maxStr;
					max=val;
					maxStr=(String) e.getKey();
				}
				else if(val>=secMax && val<max) {
					secMax=val;
					secMaxStr=(String) e.getKey();
				}
			}
			System.out.println(secMaxStr);
		}

	}

}
