package webautoexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static final String UserName = "mahesh.qa1@gmail.com";
    public static final String Password = "Mahesh123";
    public static WebDriver Driver;

    protected void TestSetup(){
        String os = System.getProperty("os.name").toLowerCase();

        Driver = new ChromeDriver();

        if (os.contains("mac")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        }
    }

    protected void TestTearDown(){
        Driver.quit();
    }
}
