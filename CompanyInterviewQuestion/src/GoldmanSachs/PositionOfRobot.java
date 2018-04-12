package GoldmanSachs;

public class PositionOfRobot {

	public static void main(String[] args) {
		String move="UDDLLRUUUDUURUDDUULLDRRRR";
	    finalPosition(move);

	}

	private static void finalPosition(String move) {
		int countUp=0,countDown=0,countRight=0,countLeft=0;
		for(int i=0;i<move.length();i++) {
			if(move.charAt(i)=='L')
				countLeft++;
			else if(move.charAt(i)=='R')
				countRight++;
			else if(move.charAt(i)=='U')	
				countUp++;
			else if(move.charAt(i)=='D')	
				countDown++;
		}
		System.out.println("final Position:::"+(countRight-countLeft)+","+(countUp-countDown));
	}

}

