package com.app.base;

import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void browserlaunch() {
		driver = new ChromeDriver();
	//	driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	public static void input_Data(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public static void input_Data_clear(WebElement element,String data) {
		element.clear();
		element.sendKeys(data);
	}
	public static void click_Value(WebElement element) {
		element.click();
	}
	
	public static void dropdpown_Value(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}
	
	public static String excel_Read_Base_ReUse(int row1, int cell1) {
		String value= null;
		try {
			// file locate
			File f = new File("C:\\Users\\HP\\Downloads\\Oct_2023_Project\\Oct_2023_Project_One\\src\\test\\resources\\TestData\\Test_One.xlsx");
			// fileread
			FileInputStream fis = new FileInputStream(f);
			// workbook access
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row2 = sheet.getRow(row1);
			Cell cell2 = row2.getCell(cell1);
			int cellType = cell2.getCellType();
			if (cellType == 1) {
				value = cell2.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell2)) {
					Date dateCellValue = cell2.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell2.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
		}
		return value;

	}
	public static String prop_reuse(String data) {
		String value = null;
		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\new\\Oct_Cucumebr\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value= prop.getProperty(data);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
	
	@AfterClass
	public static void afterClass() {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\HP\\Downloads\\Oct_2023_Project\\Oct_2023_Project_One\\Screen\\test.png");
			org.openqa.selenium.io.FileHandler.copy(screenshotAs, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

