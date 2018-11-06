package test;

import java.io.IOException;
import org.testng.annotations.Test;

public class DriverClass {

	
	@Test
	public void driver() throws IOException
	{
		JSONProblem.JsonIssue();
		ExcelProblem.ExcelTask();

		String Value = StringProblem.StringIssue("kartikaydhar");
		System.out.println(Value);
		
		    
		    
	}
	
	}
