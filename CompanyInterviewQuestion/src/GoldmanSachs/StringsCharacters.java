package GoldmanSachs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			ArrayList list = new ArrayList<>();
			StringBuilder builder = new StringBuilder();
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			StringBuilder outputBuilder = new StringBuilder();
			ArrayList list2 = new ArrayList<>();

			System.out.println("Please enter how many characters : ");
			int characterArraySize = scanner.nextInt();
			System.out.println("Please enter the elements : ");

			for (int i = 0; i < characterArraySize; i++)
				list.add(scanner.next().charAt(0));

			System.out.println("Please enter how many strings : ");
			int stringArraySize = scanner.nextInt();
			System.out.println("Please enter the elements : ");

			for (int i = 0; i < stringArraySize; i++)
				builder.append(scanner.next());

			for (int i = 0; i < builder.length(); i++) {
				if (i + 1 < builder.length()) {
					String key = builder.substring(i, i + 2);

					if (map.containsKey(key)) {
						int value = (int) map.get(key);
						value++;
						map.put(key, value);
					} else
						map.put(key, 1);
				}
			}

			for (String temp : map.keySet())
				list2.add(temp);

			for (int i = 0; i < list2.size(); i += 2)
				outputBuilder.append(list2.get(i));

			System.out.println("Largest Possible String is : " + outputBuilder.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Strings Characters Program Failed.");
			System.exit(1);
		} finally {
			scanner.close();
		}
	}
}