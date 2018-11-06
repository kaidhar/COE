package test;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class JSONProblem {
	
	@Test
	public static void JsonIssue()
	{

		
		//Use TreeMap to ignore case in Keys. I have hardcoded the inputs, you can try out other options as well. Solution will be to store the JSON Object in a TreeMap.
		Map<String, String> TM = 
			    new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);  
		
		TM.put("User", "Tim");
		TM.put("Password", "Cook");
		
		String KeyCheck = "UseR";
		
		System.out.println(TM.get(KeyCheck));

		
		
	}

}
