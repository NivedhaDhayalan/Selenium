package DataproviderTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DatproviderTest5EXCEL {
   /* No need to modify code   if we want to add row or column 
    *  for that we can use  Integrating with excel file to read and write data 
    * excel file can be used -extensions are xls,xlsx
    * libraries-Apache POI, Jxl    <<<<for Apache poi we need -->Poi, ooxml>>>>>>
    */
	
	
	
	
	@DataProvider
	public String[][] logindetails() throws Exception{ 
	File ExcelFile = new File("./src/test/java/DataproviderTestNg/ExcelFile.xlsx");
	// System.out.println(ExcelFile.exists()); just to check file is existing
	
	FileInputStream Input = new FileInputStream(ExcelFile);
	XSSFWorkbook WorkBook = new XSSFWorkbook(Input);
	XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
	int NoofRows = Sheet.getPhysicalNumberOfRows();
	int NoofColumns = Sheet.getRow(0).getPhysicalNumberOfCells();
	
	
	String[][] Data = new String[NoofRows-1][NoofColumns];
	
	for(int i=0;i<NoofRows-1; i++) { 
		for(int j=0; j<NoofColumns;j++) {
			//System.out.println(Sheet.getRow(i).getCell(j).getStringCellValue());
			DataFormatter DF = new DataFormatter();
			Data[i][j]=DF.formatCellValue(Sheet.getRow(i+1).getCell(j));
		}
	}
	Input.close();//we are closing the file and workbook(excelfile) because to stop memory leakage
	WorkBook.close();
	return Data;
}
}