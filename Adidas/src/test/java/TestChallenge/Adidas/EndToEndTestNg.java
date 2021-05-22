package TestChallenge.Adidas;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class EndToEndTestNg extends CapabilitiesDriver {

	public AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void capabilities() throws MalformedURLException {
		
		 driver=Capabilities();
		
		System.out.println("starting test");
	}
	
	@Test
	public void endToend() throws InterruptedException {
		
		System.out.println("test end to end");
		int x = 390; int y =973 ;
		int z = 516; int a= 448;
		(new TouchAction(driver)).press(PointOption.point(x, y)).moveTo(PointOption.point(z, a)).release().perform();
		  
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
		el1.click();

		  x = 240; y=1049; z=340; a=786;
		  (new TouchAction(driver)).press(PointOption.point(x, y)).moveTo(PointOption.point(z, a)).release().perform();
		  
		
		  
		  x = 232; y=1102; z=325; a=765;
			  (new TouchAction(driver)).press(PointOption.point(x, y)).moveTo(PointOption.point(z, a)).release().perform();
			  
		  
		
		  x = 226; y=1137; z=334; a = 791;
			  (new TouchAction(driver)).press(PointOption.point(x, y)).moveTo(PointOption.point(z, a)).release().perform();
			  
		  
		  x = 267; y=1146; z=378; a = 818;
			  (new TouchAction(driver)).press(PointOption.point(x, y)).moveTo(PointOption.point(z, a)).release().perform();
			  
		  
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("TODO");
		el2.click();
		Thread.sleep(1000);
		
		MobileElement el3 = (MobileElement) driver.findElementById("com.example.challenge:id/reviewDetails");
		el3.click();
		
		el3.sendKeys("good quality");
		
		MobileElement el4 = (MobileElement) driver.findElementById("android:id/text1");
		el4.click();
		
		Thread.sleep(500);
		MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.widget.CheckedTextView[4]");
		el5.click();
				
		
		MobileElement el6 = (MobileElement) driver.findElementById("com.example.challenge:id/saveReview");
		el6.click();
		
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	@AfterTest
	public void endSession() {
		
		driver.quit();
		System.out.println("driver closed");
	}

	
}
