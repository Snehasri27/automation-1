
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class signup1 {



    public static void main(String[] args) throws InterruptedException {
         
       System.setProperty("webdriver.chrome.driver","C:/Users/sneha.g/Downloads/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
             
           
       landingpage landingpage2 = new landingpage(driver);
       landingpage2.goTo();
       Thread.sleep(1000);
       landingpage2.signup1application("Sneha","Govindaraj","snehasri@gmail.com","Sri123" ,"04/02/1998","9876543210","Artist");
           
     }
}