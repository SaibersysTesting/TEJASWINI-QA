/**
 * 
 */
package com.selenium.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Tejaswini
 *
 */
public class DDExample {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//get url		
		driver.get("C:\\Users\\Tejaswini\\Desktop\\DataDriven.html");
		driver.manage().window().maximize();  
		WebElement firstname  = driver.findElement(By.id("firstname"));
		WebElement lastname  = driver.findElement(By.id("lastname"));
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		{
      
		
		try {
		    
			  FileInputStream file = new FileInputStream("C://Users//Tejaswini//Desktop//Sample.xlsx");
			  
			  System.out.println("Test");
			  XSSFWorkbook wb = new XSSFWorkbook(file);
			  
			  System.out.println("Working???");
			  
			  int rowCount = wb.getSheetAt(0).getLastRowNum();
				int colCount = wb.getSheetAt(0).getRow(0).getLastCellNum();

				String[][] excelData = new String[rowCount + 1][colCount];
				// String[][] accountCredentials;
				

				String data = "";

				for (int i = 0; i <= rowCount; i++) {
					for (int j = 0; j < colCount; j++) {
						data = wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
						excelData[i][j] = data;
						 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					}
				}
				for (int i = 0; i <= rowCount; i++) {
					for (int j = 0; j < colCount; j++) {
						
						firstname.clear(); 
						firstname.sendKeys(excelData[i][j]);
						lastname.clear();
						lastname.sendKeys(excelData[i][++j]);
						
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//						driver.get("C:\\Users\\Tejaswini\\Desktop\\DataDriven.html");
						//data = wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
						System.out.print(excelData[i][j]+"----");
						//System.out.println("Reading???");
					}
					System.out.println("");
				}
				
				

				wb.close();
				return;
		//  HSSFWorkbook workbook = new HSSFWorkbook(file);
		 
	//	  System.out.println("Test1");
	//	  HSSFSheet sheet = workbook.getSheet("Sheet1");

		}
	catch (IOException e) {
        System.out.println("Test data file not found");
    }
		return;
		   
	}
	}
}
