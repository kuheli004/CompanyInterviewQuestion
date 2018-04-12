package GoldmanSachs;

public class CircleLatticePoint {

	public static void main(String[] args) {
		 int r = 5;
		    System.out.println(countLattice(r));

	}

	private static int  countLattice(int r) {
	
		if(r<=0)
			return 0;
		int result=4;
		
		for(int x=1;x<r;x++) {
			int ysquare=r*r-x*x;
			int y=(int)Math.sqrt(ysquare);
			if(y*y==ysquare)
				result+=4;
			
		}
		return result;
		
	}	

}
