package Walmart;

public class MaxPattern {
	public static void main(String[] s) {
		String[] data = { "R", "RBB", "BB", "BR" };
		MaxPattern obj = new MaxPattern();
		obj.check(data);
	}

	String maxStringFound = null;
	private void check(String[] data) {
		maxStringFound = null;
		for (int i = 0; i < data.length; i++) {
			check(data[i], getStringArray(data, i));
		}
		System.out.println("MAX STRING FOUND " + maxStringFound);

	}

	private void check(String string, String[] data) {
		for (int i = 0; i < data.length; i++) {
			if (string.endsWith("" + data[i].charAt(0))) {
				if (data.length == 1) {
					string = string + " " + data[i];
				} else {
					check(string + " " + data[i], getStringArray(data, i));
				}
			}
		}
		System.out.println(string);
		String s1 = string.replaceAll("\\s", "");
		if (maxStringFound == null || maxStringFound.length() < s1.length()) {
			maxStringFound = s1;
		}

	}

	private String[] getStringArray(String[] data, int index) {
		String[] d = new String[data.length - 1];
		int k = -1;
		for (int i = 0; i < data.length; i++) {
			if (i != index) {
				k++;
				d[k] = data[i];
			}
		}
		return d;
	}
}