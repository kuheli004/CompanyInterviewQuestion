package GoldmanSachs;

public class OverlappingRectangle {

	public static void main(String[] args) {
		  Point l1 = new Point(0, 10), r1 =new Point(10, 0);
		    Point l2 = new Point(5, 5), r2 =new Point(15, 0);
		    if (doOverlap(l1, r1, l2, r2))
		        System.out.println("Rectangles Overlap");
		    else
		    	 System.out.println("Rectangles Don't Overlap");
		 
	}

	private static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
	if(l1.x>r2.x || l2.x>r1.x)
		return false;
	if(l1.y<r2.y || l2.y<r1.y)
		return false;
	return true;
	}

}
class Point {

	public int x;
	public int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	Point(){
		
	}
}