package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class BaseTests {
    private WebDriver driver;
    
//protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\proj-maven\\src\\main\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");  //to launch browser

       //driver.manage().window().maximize();  // to get maximize seize of window

       // driver.manage().window().fullscreen();  //to get full screen

       // driver.manage().window().setSize(new Dimension( width:375, height:812));
          
        System.out.println(driver.getTitle());



    }
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();  //to call this setUp
    }
}
