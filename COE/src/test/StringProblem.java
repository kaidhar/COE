package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringProblem {

	public static String StringIssue(String Value) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String ValueToTest = Value;
		String Palmid = null;

		String finalString = null;

		Map<Character, Integer> frequencies = new HashMap<>();
		for (char ch : ValueToTest.toCharArray())
			frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);

		
		// To get the Middle character.
		for (Entry<Character, Integer> c : frequencies.entrySet()) {

			if (c.getValue() % 2 != 0) {
				Palmid = (c.getKey().toString());
				break;

			}

		}


		StringBuilder palstart = new StringBuilder("");
		StringBuilder palend = new StringBuilder("");
		
		//This code is written to create the largest pallindrome.
		
		for (Entry<Character, Integer> d : frequencies.entrySet()) {

			int count2 = d.getValue();
			if (d.getValue() % 2 == 0) {
				for (int i = 0; i < count2 / 2; i++) {
					palstart.append(d.getKey().toString());

					palend.append(d.getKey().toString());
				}

			}
			else
			{
				if(d.getValue()==1)continue;
				for (int i = 0; i < (count2-1) / 2; i++) {
					palstart.append(d.getKey().toString());

					palend.append(d.getKey().toString());
				}
				
			}

		}

		finalString = palstart.reverse().toString() + Palmid.toString() + palend.toString();
		return finalString;

	}

}
