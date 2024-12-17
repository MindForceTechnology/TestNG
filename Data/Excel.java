package Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException   {
		
		// fileinput stream argument
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\DATA1.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
	
	  XSSFSheet sheet =workbook.getSheetAt(0);
	
	///////////////using loop
	int rows= sheet.getLastRowNum(); // to get row count
	int cols= sheet.getRow(1).getLastCellNum(); // to get the column r cell count
	System.out.println(rows);
	System.out.println(cols);
	
	
	for(int r=0;r<=rows;r++) // for rows
	{
		XSSFRow row = sheet.getRow(r); // from the particular row want the cell count
		
		for(int c=0; c<cols; c++) //  for columns
		{
			XSSFCell cell =row.getCell(c);
			
			switch(cell.getCellType()) 
			{
			case STRING:System.out.print(cell.getStringCellValue()); break;
			case NUMERIC :System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN:System.out.print(cell.getNumericCellValue());break;
			}
			System.out.print(" | "); // space between the value
			
		}
		System.out.println();
	}
	  
	 	  }
	 
	
	}


