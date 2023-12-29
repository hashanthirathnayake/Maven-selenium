package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class shifttingContent {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\proj-maven\\src\\main\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");  //to launch browser



        //here we can return only one element  
        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();  // to click on "inputs" link

        WebElement inputsLink1 = driver.findElement(By.linkText("Menu Element"));
        inputsLink.click();  // to click on "inputs" link


        System.out.println(driver.getTitle());

    }
    public static void main(String args[]){
        shifttingContent test = new shifttingContent();
        test.setUp();  //to call this setUp
    }

}
