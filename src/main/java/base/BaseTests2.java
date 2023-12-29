package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests2 {

    private WebDriver driver;
    protected HomePage homePage;

 @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\proj-maven\\src\\main\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");  //to launch browser

       homePage = new HomePage(driver);

    }


public static void main(String args[]){
    BaseTests2 test = new BaseTests2();
    test.setUp();  //to call this setUp
}

}
