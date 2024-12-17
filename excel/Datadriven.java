package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		
	FileInputStream file = new FileInputStream("C:/users/Lenovo/Documents/DATA1.xlsx");
	
	
	
 /*HSSFWorkbook workbook = new HSSFWorkbook("file");
	
	HSSFSheet sheet = workbook.getSheet("Sheet1");            //giving sheet name
	XSSFSheet sheet = workbook.getSheetAt(0);              // giving index
	
	 int rowcount = sheet.getLastRowNum();              //returns the row count
	 
	// int colcount = sheet.getRow(0).getLastCellNum();            //returns column/cellcount
	 
	 //for(int i=0;i<rowcount;i++)    // to get the rowcount ,i<rowcount means get until the last row
	 {
	     XSSFRow currentrow = HSSFSheet.getRow(i);          // focussed on current row
	      
	      // in this current row read the all cell values
	      
	     for (int j=0;j<colcount;j++)
	      {
	      String value=currentrow.getCell(j).toString();        //string for to get a value from cell,also read a value from cell
	      
	      System.out.println(value);*/
	      
	         }
	 
	

	}


