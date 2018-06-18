package Music;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SignUp {
	
	AppiumDriver <WebElement>driver;
	
@Test(priority=0)
	
	public void Before_Login() {
		
		driver.findElement(By.id("com.hungama.myplay.activity:id/check_terms")).click();
		 driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']")).click();
		 driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);	
	
		driver.findElement(By.xpath("//android.widget.Button[@text='Got It!']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Got It!']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		 driver.findElement(By.id("com.hungama.myplay.activity:id/mdImage")).click();
		
		 driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
	}


@Test(priority=1)

public void Sign_Up() {
	
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Sign up now!']")).click();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();
	 
	 WebElement fname=driver.findElement(By.xpath("//android.widget.EditText[@text='* First Name']"));
	 fname.sendKeys("B");
	// driver.hideKeyboard();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();
	 fname.clear();
	 fname.sendKeys("Ba");
	 driver.hideKeyboard();
	 
	 WebElement Lname=driver.findElement(By.xpath("//android.widget.EditText[@text='* Last Name']"));
	 Lname.sendKeys("C");
	 driver.hideKeyboard();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();
	 Lname.clear();
	 Lname.sendKeys("Ch");
	 driver.hideKeyboard();
	 
	 WebElement Email=driver.findElement(By.xpath("//android.widget.EditText[@text='* Email id']"));
	 Email.sendKeys("chandler@");
	 //driver.hideKeyboard();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();
	 Email.clear();
	 Email.sendKeys("jatinatj12@gmail.com");
	 driver.hideKeyboard();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();
	 Email.clear();
	 Email.sendKeys("chandler@gmail.com");
	 driver.hideKeyboard();
	 
	 WebElement Mnum=driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile number']"));
	 Mnum.sendKeys("9990009090909[]'';");
	 driver.hideKeyboard();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();
	 Mnum.clear();
	 Mnum.sendKeys("9990009090909");
	 driver.hideKeyboard();
	 driver.findElement(By.id("com.hungama.myplay.activity:id/login_hungama_signup_button_login")).click();



}

	@BeforeClass
	 
	  public void setup() throws MalformedURLException, InterruptedException {
		 
		    DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "45");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.hungama.myplay.activity");
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hungama.myplay.activity.ui.OnApplicationStartsActivity");
			
		    /*AndroidDriver<AndroidElement>*/ driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
						
}

}

