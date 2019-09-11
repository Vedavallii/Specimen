package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static Object[][] readData() throws IOException
{
	
	XSSFWorkbook wbook=new XSSFWorkbook("./data/createLead.xlsx");
	XSSFSheet sheet=wbook.getSheetAt(0);
	int rowNum = sheet.getLastRowNum();
	int CellNum = sheet.getRow(0).getLastCellNum();
	System.out.println("Count of row :" + rowNum);
	System.out.println("Count of cells" + CellNum);
	String [][]data=new String[rowNum][CellNum];
	for(int i=1;i<=rowNum;i++)
	{
		XSSFRow row=sheet.getRow(i);
		for (int j=0;j<CellNum;j++)
		{
			XSSFCell cell=row.getCell(j);
			data[i-1][j]=cell.getStringCellValue();
		}
	}
	
	wbook.close();
	return data;
	
}
}
