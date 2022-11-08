package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =    new File("C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Desktop\\Automation Projects\\Testdata.xlsx");

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);
	    
	    Workbook book = new XSSFWorkbook(inputStream);
	    
	    XSSFSheet sheet = (XSSFSheet) book.getSheet("Testsheet");
	    Row row = sheet.getRow(0);
	    Cell cell = row.getCell(0);
	    System.out.println(sheet.getRow(0).getCell(0));
	    Row row1 = sheet.getRow(0);
	    Cell cell1 = row1.getCell(1);
	    System.out.println(sheet.getRow(0).getCell(1));
	    
	    

	}

}
