package test;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelProblem {

	@Test
	public static void ExcelTask() throws IOException {

		FileInputStream FIS = new FileInputStream(new File("/Users/h895458/Desktop/Workspace/COE/src/test/Test.xlsx"));  // I'm using my data. Will require actual demo data to test it out.

		XSSFWorkbook WB = new XSSFWorkbook(FIS);
		XSSFSheet Sheet = WB.getSheetAt(0);
		XSSFRow Row = null;
		int numberOfRows = Sheet.getLastRowNum();
		
		for(int i = 0;i<=numberOfRows;i++)
		{
			Row= Sheet.getRow(i);
			Cell cell = Row.getCell(0);
			Double Value =cell.getNumericCellValue();

			NumberFormat nf = new DecimalFormat("####################################################################.########################################################################");
			String decimalString = nf.format(Value);

			if(decimalString.equals("0"))return;
			System.out.println(decimalString);
			WB.close();
		}

				

	}
}
