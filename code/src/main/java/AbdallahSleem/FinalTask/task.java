package AbdallahSleem.FinalTask;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task {
	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void openurl() 
	{
		 driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		 driver.manage().window().maximize();	 
	}
     @AfterTest
	public void close()
	{
		driver.close();
	}
      	@Test
	public void test() throws InterruptedException
	{
	// Choose the following ((from "CHIKKAMAGALURU" to "BENGALURU”)) from the popular routes
		WebElement a = driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/a[2]/span[1]"));
		a.click();
		WebElement b = driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]/a"));
		b.click();	
	//-	Choose the arrival date only 	
		WebElement c = driver.findElement(By.id("txtJourneyDate"));
		c.click();
		WebElement d = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[5]/td[3]/a"));
		d.click();
	Thread.sleep(3000);
	//-Click “Search for bus”	
		WebElement e = driver.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button"));
		e.click();
	Thread.sleep(1000);
	//-	Select a seat
	WebElement popup = driver.findElement(By.xpath("//*[@id=\"corover-cb-widget\"]"));
	WebElement closepopup = driver.findElement(By.id("corover-close-btn"));
	closepopup.click();
		WebElement f = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div"));
		f.click();
		Thread.sleep(1000);	
		WebElement g = driver.findElement(By.id("Forward46"));
		g.click();
	Thread.sleep(1000);
	//-	Choose the boarding point and dropping point	
		WebElement h = driver.findElement(By.id("Forwardboarding-tab"));
		h.click();
		WebElement i = driver.findElement(By.id("Forwarddroping-tab"));
		i.click();
		WebElement j = driver.findElement(By.id("Forward-1467467616730"));
		j.click();
		Thread.sleep(3000);
		// customer details	
		WebElement l = driver.findElement(By.id("Forwardprofile-tab"));
		l.click();
		WebElement m = driver.findElement(By.id("mobileNo"));
		m.sendKeys("6789125987");
		WebElement n = driver.findElement(By.id("email"));
		n.sendKeys("abdallah@gmail.com");
		Thread.sleep(3000);
	//passenger details	
		WebElement o = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/p/a"));
		o.click();
		WebElement p = driver.findElement(By.id("passengerNameForward0"));
		p.sendKeys("abdallah");
		WebElement q = driver.findElement(By.id("genderCodeIdForward0"));
		q.click();
		q.sendKeys("m");
		WebElement s = driver.findElement(By.id("passengerAgeForward0"));
		s.sendKeys("24");
		WebElement x = driver.findElement(By.id("concessionIdsForward0"));
		x.sendKeys("g");
		Thread.sleep(3000);
		//-	Click on “make payment” and fill all the fields without submitting the payment
		WebElement y = driver.findElement(By.id("PgBtn"));
		    y.click();
		Thread.sleep(3000);
	/*
		
	WebElement aa = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/div/button[1]/div"));
				aaa.click();
	WebElement bb = driver.findElement(By.id("card_number"));
			bb.sendKeys("4738 6400 3063 8930");
	WebElement cc = driver.findElement(By.id("card_expiry"));
			cc.sendKeys("07 / 28");
	WebElement dd = driver.findElement(By.id("card_cvv"));
			dd.sendKeys("588");
	Thread.sleep(3000);
	WebElement ee = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/button"));
				ee.click();
	WebElement ff = driver.findElement(By.id("positiveBtn"));
				ff.click(); 
	*/
		}
}
