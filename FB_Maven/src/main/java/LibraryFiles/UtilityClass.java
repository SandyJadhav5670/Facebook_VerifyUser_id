package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
		public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\New folder (2)\\New folder\\FB_Maven\\TestData\\Record1.xlsx");
			 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();			
			return value;
		}
		public static void captureScreenshot(WebDriver driver,int TCID) throws IOException 
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Admin\\Desktop\\New folder (2)\\New folder\\FB_Maven\\Screenshots\\TestCaseID"+TCID+".jpg");
			FileHandler.copy(src, dest);
		}
		public static String getPFData(String key) throws IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\New folder (2)\\New folder\\FB_Maven\\Propertyfile.properties");
			
			Properties p=new Properties();
			p.load(file);
			
			String value = p.getProperty(key);
			
			return value;
		}
		
}
