package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		//1.open the excel file (workbook)
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		//2.goto sheet1
		Sheet sheet1 = wb.getSheet("sheet1");
		//3.goto 1st row
		Row r1 = sheet1.getRow(0);
		//4.goto 1st cell
		Cell c1 = r1.getCell(0);
		//5.get the value present in cell
		String v=c1.getStringCellValue();
		//6.print it
		System.out.println(v);
		//7.close the excel file
		wb.close();

	}

}
