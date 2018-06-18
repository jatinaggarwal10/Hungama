package Music;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SignIn {
	
	AppiumDriver <WebElement>driver;
	XSSFWorkbook wb; 
	XSSFSheet sheet;
	FileInputStream fis;
	
	@Test
	
	public void Excel() throws IOException {
		
		FileInputStream fis =new FileInputStream("Z:\\Data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook (fis);
	
		XSSFSheet sheet= wb.getSheet("signin");
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "45");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.hungama.myplay.activity");
	    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hungama.myplay.activity.ui.OnApplicationStartsActivity");
		
	     driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.findElement(By.id("com.hungama.myplay.activity:id/check_terms")).click();
		//driver.findElement(By.id("com.hungama.myplay.activity:id/check_terms")).click();
		 driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']")).click();
		 driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);	
	
		driver.findElement(By.xpath("//android.widget.Button[@text='Got It!']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Got It!']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		 driver.findElement(By.id("com.hungama.myplay.activity:id/mdImage")).click();
		 driver.findElement(By.id("com.hungama.myplay.activity:id/login_btn_fb")).click();
		 driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		 
		
		 XSSFRow row=sheet.getRow(3);
		//XSSFRow row=sheet.getRow(4);
		 XSSFCell cell=row.getCell(0);
		 String value=cell.getStringCellValue();
		 System.out.println(value);
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Phone or Email']")).sendKeys(value);
		 XSSFRow row1=sheet.getRow(3);
		// XSSFRow row1=sheet.getRow(4);
		 XSSFCell cell1=row.getCell(1);
		 String value1=cell1.getStringCellValue();
		 System.out.println(value1);
		 driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).sendKeys(value1);
	
		 
		 driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']")).click();
		 driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		 driver.findElement(By.xpath("//android.widget.Button[@text='Got It!']")).click();
		 
		 driver.findElement(By.xpath("//android.widget.TextView[@text='My Playlist']")).click();
		 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
		 
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Bollywood Top 40']")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Bom Diggy Diggy']")).click();
		
		 driver.findElement(By.id("com.hungama.myplay.activity:id/button_cache_state")).click();
		 driver.findElement(By.id("com.hungama.myplay.activity:id/player_queue_line_button_more")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Play Next']")).click();
		 
		
		 driver.findElement(By.id("com.hungama.myplay.activity:id/player_queue_line_button_more")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Add to queue']")).click();
		 
		 
		 driver.findElement(By.id("com.hungama.myplay.activity:id/player_queue_line_button_more")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='View Details']")).click();
		 
		
		 ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.BACK);
		 driver.findElement(By.id("com.hungama.myplay.activity:id/player_queue_line_button_more")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Add To Playlist']")).click();
		 
		 
		 driver.findElement(By.id("com.hungama.myplay.activity:id/play_list_edit_text")).sendKeys("Hungama");
		 driver.navigate().back();
		 driver.findElement(By.id("com.hungama.myplay.activity:id/save_button")).click();
	
	}
		

}

