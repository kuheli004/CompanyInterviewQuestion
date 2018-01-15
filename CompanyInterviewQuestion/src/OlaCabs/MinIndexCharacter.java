package OlaCabs;

import java.util.HashMap;
import java.util.Map;

public class MinIndexCharacter {

	public static void main(String[] args) {
		 String str = "geeksforgeeks";
	        String patt = "set";
	        printMinIndexChar(str, patt);

	}

	private static void printMinIndexChar(String str, String patt) {
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		int minIndex=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!hm.containsKey(c)) 
				hm.put(c,i);
		}
		
		for(int i=0;i<patt.length();i++) {
			char p=patt.charAt(i);
			if(hm.containsKey(p))
			{
				int j=hm.get(p);
				if(j<minIndex)
					minIndex=j;
			}
		}
		
		if(minIndex!=Integer.MAX_VALUE)
			System.out.println(str.charAt(minIndex));
		else
			System.out.println("No character present");
		
		
		
	}

}
