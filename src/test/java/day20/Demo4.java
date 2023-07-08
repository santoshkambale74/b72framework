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

public class Demo4 {

	public static void main(String[] args) throws Exception {

		String path="./data/book1.xlsx";
		String sheet="Sheet2";
		
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));

		int rc = wb.getSheet(sheet).getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			try {
					int cc=wb.getSheet(sheet).getRow(i).getLastCellNum();
					for(int j=0;j<cc;j++)
					{
						try 
						{
							String v=wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
							System.out.print(v+" ");
						}
						catch (Exception e) {
							System.out.print("-- ");
						}
					}
					System.out.println();
			}
			catch (Exception e) {
				System.out.println("-- -- --");
			}
		}
		wb.close();

	}

}
