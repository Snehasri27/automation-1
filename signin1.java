import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin1 {
	public static void main(String[] args) throws InterruptedException {
	    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha.g\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    //driver.get("https://mobileworld.banyanpro.com/");
    
    driver.manage().window().maximize();
    
    landingpage Landingpage = new landingpage(driver);
    Landingpage.goTo();
    Thread.sleep(1000);

    Landingpage.signin1application("Sneha", "Sri@123");
         
    }
}
