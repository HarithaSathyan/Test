package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pgm1 {
WebDriver driver;
By resource=By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span/span/svg");
By tech=By.xpath("//*[@id=\"list-item-50\"]/div/div[2]/small");
By shop=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div");
By credit=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span");
public Pgm1(WebDriver driver)
{
	 this.driver=driver;
}
public void resource()
{
	driver.findElement(resource).click();
}
public void tech() 
{
driver.findElement(tech).click();	
}
public void shop()
{
	driver.findElement(shop).click();
}
public void credit()
{
	driver.findElement(credit).click();
}
}


