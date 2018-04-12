package Accolite;

public class StringRotatedTwoPlace {

	public static void main(String[] args) {
		String str1 = "geeks";
        String str2 = "eksge";
      
        System.out.println(isRotated(str1, str2) ?  "Yes"
                              : "No");

	}

	private static boolean isRotated(String str1, String str2) {
	int len=str2.length();
	String ClockWise="";
	String AntiClockWise="";
	AntiClockWise=str2.substring(str2.length()-2)+str2.substring(0,str2.length()-2);
	ClockWise=str2.substring(2)+str2.substring(0,2);
	if(ClockWise.equals(str1)||AntiClockWise.equals(str1))
		return true;
	return false;
	
	}

}
