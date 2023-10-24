package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static String[][] excelData(String filename) throws IOException {
		
    // Path for the workbook
		
		XSSFWorkbook Wbook = new XSSFWorkbook("./data/"+filename+".xlsx");
	
	    XSSFSheet sheet = Wbook.getSheetAt(0);
	    
	    int rowCount = sheet.getLastRowNum();
	    System.out.println("no.of.rows :"+ rowCount );
	
	    XSSFRow row = sheet.getRow(0);
	    
	    int CellCount = row.getLastCellNum();
	    System.out.println("no.of cells :"+ CellCount);
	    
	    String[][] data = new String[rowCount][CellCount];
	    
//	    int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	    System.out.println("With header row :"+ physicalNumberOfRows);
//	    
//	    String value = sheet.getRow(1).getCell(1).getStringCellValue();
//	    System.out.println(value);
	    
	    for (int i = 1; i <= rowCount; i++) {
	    	
	    	XSSFRow row2 = sheet.getRow(i);
	    	
	    	for (int j = 0; j < CellCount; j++) {
	    		
	    		String data1 = row2.getCell(j).getStringCellValue();
	    		System.out.println(data1);	
	    		
	    		data[i-1][j]= data1;
			}
		}
	    Wbook.close();
	    
	    return data;
	
	}

}
