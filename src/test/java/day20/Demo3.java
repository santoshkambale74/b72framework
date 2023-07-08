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

public class Demo3 {

	public static void main(String[] args) throws Exception {

		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xlsx"));

		int rowcount = wb.getSheet("sheet2").getLastRowNum();
		System.out.println(rowcount);//4
		
		int cc1=wb.getSheet("sheet2").getRow(0).getLastCellNum();
		System.out.println(cc1);//2
		
		int cc2=wb.getSheet("sheet2").getRow(1).getLastCellNum();
		System.out.println(cc2);//3
		
//		int cc3=wb.getSheet("sheet2").getRow(2).getLastCellNum();
//		System.out.println(cc3);
		
		int cc4=wb.getSheet("sheet2").getRow(3).getLastCellNum();
		System.out.println(cc4);//1
		
		int cc5=wb.getSheet("sheet2").getRow(4).getLastCellNum();
		System.out.println(cc5);//4
		
		wb.close();

	}

}
