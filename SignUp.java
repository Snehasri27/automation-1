import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
   @Test
	public void signUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/sneha.g/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Sneha");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Govindaraj");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("snehasri@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sri123");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("04/02/1998");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9876543210");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Artist");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@type='Submit']")).click();
	    
	}
	
}
