package day20;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	//generic methods (not specific to a project)
	public static String getData(String path,String sheet,int r,int c)
	{
		String value="";
		try
		{
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				value=wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
				wb.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		String path="./data/Book1.xlsx";
		String sheet="Sheet3";
		String un=getData(path,sheet,1,0);
		String pw=getData(path, sheet,1,1);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
	}
}
