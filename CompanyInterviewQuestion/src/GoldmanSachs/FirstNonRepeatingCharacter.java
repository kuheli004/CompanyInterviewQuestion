package GoldmanSachs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	int count,index;
	
	public FirstNonRepeatingCharacter(int count, int index) {
		super();
		this.count = count;
		this.index = index;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	FirstNonRepeatingCharacter(){
		
	}

	public static void main(String[] args) {
		String str="xxyyz";
		boolean flag=false;
		
	Map<Character,FirstNonRepeatingCharacter> hm=new LinkedHashMap<Character,FirstNonRepeatingCharacter>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!hm.containsKey(ch))
			{
			int  count=1;
			int index=1;
			hm.put(ch, new FirstNonRepeatingCharacter(count,index));
			}
			else
			{
				FirstNonRepeatingCharacter obj=hm.get(ch);
				int count=obj.getCount();
				int index=obj.getIndex();
				hm.put(ch, new FirstNonRepeatingCharacter(++count,index));
			}
		}
		
	for(Map.Entry<Character,FirstNonRepeatingCharacter> hs:hm.entrySet()) {
		int cnt=hs.getValue().getCount();
		if(cnt==1)
		{
			flag=true;
			System.out.println(hs.getKey());
			break;
			
		}
	
		
	}
	if(!flag)
		System.out.println(-1);
		
	}

}
