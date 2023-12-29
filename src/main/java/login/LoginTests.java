package login;

import base.BaseTests2;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests2



{
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFromAuthentication();
        loginPage.userName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()      //×
                        .contains("You logged into a secure area!"),
                " Your password is invalid!");
//                .contains("You logged into a secure area!"),
//                message: "Your password is invalid!");

    }
}


// You logged into a secure area!     Your password is invalid!

