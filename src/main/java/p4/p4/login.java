package p4.p4;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;


public class login {
	@Test
	public void verify()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.alt-team.com/4_demo3/index.php");
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("(//a[contains(.,'Electronics')])[3]"))).build().perform();
	}
	
	
	
}