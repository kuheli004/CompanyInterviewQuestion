package GoldmanSachs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {

	int size=0;
	@Override
	public boolean removeEldestEntry(Map.Entry<Integer,Integer> entry) {
		return size()>size;
		
	}
	
	LRUCache(int size){
		super(size, 0.25f,true);
		this.size=size;
		
	}
	public static LRUCache newInstance(int size) {
		return  new LRUCache(size);
	}
	
	public int get(int x) {
		if(super.containsKey(x))
			return x;
		return -1;
	}
	
	public void set(int x,int y) {
		super.put(x, y);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LRUCache lruCache=LRUCache.newInstance(2);
		lruCache.put(1,2);
		lruCache.put(2,	3);
		lruCache.put(3, 4);
		lruCache.put(4, 2);
		lruCache.put(5, 1);
		System.out.println(lruCache);
	}

}
