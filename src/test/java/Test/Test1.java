package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Pgm1;

public class Test1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com/");
	}
	@Test
	public void set()
	{ 
		Pgm1 pg =new Pgm1(driver);
		pg.resource();
		pg.tech();
		pg.shop();
		pg.credit();
	}
}
