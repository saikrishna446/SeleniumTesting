package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file =    new File("C:\\Users\\saikrishna.vandanapu\\OneDrive - Qentelli\\Desktop\\Automation Projects\\Testdata.xlsx");

		FileInputStream fs = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		for(int i=0; i<=lastRow; i++){
		Row row = sheet1.getRow(i);
		Cell cell = row.createCell(2);

		cell.setCellValue("testing123");

		}

		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		fos.close();
		}
	

}
