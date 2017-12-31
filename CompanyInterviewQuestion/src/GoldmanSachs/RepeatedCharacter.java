package GoldmanSachs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			if(hm.containsKey(c))
				hm.put(c,hm.get(c)+1);
			else
				hm.put(c,1);
		}
		Set<Entry<Character, Integer>> hs=hm.entrySet();
		boolean flag=true;
		for(Entry e:hs) {
			
			int val=(int) e.getValue();
			if(val>1) {
				System.out.println(e.getKey());
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(-1);
		
		}
	

}
