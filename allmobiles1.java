
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class allmobiles1 {



    public static void main(String[] args) throws InterruptedException {
         
       System.setProperty("webdriver.chrome.driver","C:/Users/sneha.g/Downloads/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
             
           
       landingpage landingpage3 = new landingpage(driver);
       landingpage3.goTo();
       Thread.sleep(1000);
       landingpage3.allmobilesapplication("Samsung Galaxy Z");
     }
}
