package Data;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingexcelDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		// create workbook--> inside workbook create sheet--> inside that no.of.rows----> no.of.cells
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("EMP Info");
		// add some data into sheet
		// now take two diemensional array
		Object empdata [][]= {   {"Empid","Name","JOB"},
		                         {"100","Dhivya","Engineer"},
		                         {"101","Ramya","Manager"},
		                         {"102","Priya","Analyst"}
		                     
		};
//write data into sheet
	     // using loop
		// to findout the no.of rows and no.of.cols
		int rows= empdata.length;
		int cols= empdata[0].length;
		
	System.out.println(rows);//4
	System.out.println(cols);//3
	for(int r=0;r<rows;r++) // this for row
	{    // to create a row take a sheet object
		XSSFRow row=sheet.createRow(r); // row will be created
		
		for (int c=0;c<cols;c++)             // this for cols 
		{ // inside row we created multiple cols
			XSSFCell cell=row.createCell(c); // cell created and stored in one value
			Object value=empdata[r][c];
			//to check the value is string number r boolean
		if(value instanceof String)
			cell.setCellValue((String)value); // value is in object but cell accepts the string so casting the string
		if(value instanceof Integer)                                                                  //and store in cell
			cell.setCellValue((Integer)value);
//		if(value instanceof Boolean)
//			cell.setCellValue((Boolean)value);
		}
	}                   
		////////////// using each loop
		
	 String Filepath="C:\\Users\\Lenovo\\employee.xlsx";
	 FileOutputStream output = new FileOutputStream(Filepath);
	workbook.write(output);
	
	output.close();
	System.out.println("Employee .xslx is succesfully created");
	
	
	}

}
