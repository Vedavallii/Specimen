package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {
	public static Object[][] readData() throws IOException
	{
		XSSFWorkbook wbook=new XSSFWorkbook("./data/Readdata.xls");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum=sheet.getLastRowNum();
		int cellnum=sheet.getRow(0).getLastCellNum();
		System.out.println(rowNum);
		System.out.println(cellnum);
		return readData();
	}

}
