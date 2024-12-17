package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String filePath = "C:\\Users\\Lenovo\\Desktop\\DATA1.xlsx";
	        FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = new XSSFWorkbook(fis) ;

	            Sheet sheet = workbook.getSheetAt(1);// Assuming the first sheet

	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    String cellValue = "";
	                    if (cell.getCellType() == CellType.STRING) {
	                        cellValue = cell.getStringCellValue();
	                    } else if (cell.getCellType() == CellType.NUMERIC) {
	                        cellValue = String.valueOf(cell.getNumericCellValue());
	                    }
	                    System.out.print(cellValue + "\t");
	                }
	                System.out.println();
	            }
	             
	}
	
}

	             
	        
	        
	    
	



	


