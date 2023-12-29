package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests1 {

    private WebDriver driver;


    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\proj-maven\\src\\main\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");  //to launch browser

        //to return more than one elements  //interview questions
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //here we can return only one element  --interview questions
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();  // to click on "inputs" link




        System.out.println(driver.getTitle());

    }
    public static void main(String args[]){
        BaseTests2 test = new BaseTests2();
        test.setUp();  //to call this setUp
    }

}
