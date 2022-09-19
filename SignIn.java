import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	@Test

	public void signin() throws InterruptedException {
		
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver","C:\\Users\\sneha.g\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sneha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sri2123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@type='submit']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();

	}

}