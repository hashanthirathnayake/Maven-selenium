package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {


    private WebDriver driver;
    private By usernameField= By.id("userName");
    private By passwordField=By.id("password");
    private By loginButton= By.cssSelector("#login button");

    public LoginPage (WebDriver driver){

        this.driver= driver;
    }
      public void userName(String userName)
    {

        driver.findElement(usernameField).sendKeys(userName);
    }

    public void setPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton);
        return new SecureAreaPage(driver);
    }


}

