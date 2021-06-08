package impl;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.CucumberScreenShot;
import utils.WebdriverUtils;



public class LoginImpl {

    private static WebDriver driver;

    LoginPage loginPage = new LoginPage();

    public void navigateToPage() {
        String url = ConfigReader.getProperty("url");
        WebdriverUtils.getDriver().get(url);
        CucumberScreenShot.logPass("Successfully navigated to url", true);
    }

    public void validateLoginPage() {
        if (loginPage.loginPage.isDisplayed()) {
            CucumberScreenShot.logPass("Login page is displayed", true);
        } else {
            CucumberScreenShot.logFail("Login page is NOT displayed", true);
        }

    }


    public void enterUsername(String name, String input) {
        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_INPUTFIELD, input);
        WebElement inputField = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        inputField.sendKeys(name);
        CucumberScreenShot.logPass(name + " was entered in " + input + " input field successfully", true);

    }

    public void clickSignInBtn(String signInBtn) {
        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_BUTTON, signInBtn);
        WebElement signinBtn = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        signinBtn.click();

        CucumberScreenShot.logPass("Click " + signInBtn + " button ", true);

        CucumberScreenShot.logPass("Click on Update button ", true);

    }

    public void invalidCredUsername(String invalidUsername) {

        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_INVALIDCREDENTIALS, invalidUsername);
        WebElement invalidUser = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));

        if (invalidUser.getText().contains(invalidUsername)) {
            CucumberScreenShot.logPass("Invalid username is present on the Login page " + invalidUsername, true);
        } else {
            CucumberScreenShot.logFail("Invalid username is NOT present on the Login page " + invalidUsername, true);
        }

    }


    public void validateHomePage(String homePage) {
        if (loginPage.homePage.isDisplayed()) {
            CucumberScreenShot.logPass("Welcome page is present ", true);
        } else {
            CucumberScreenShot.logFail("Welcome page is NOT present ", true);
        }
    }

    public boolean validateSigninBtnDis(String btnDis) {
        if (loginPage.disableBtn.isEnabled()) {
            CucumberScreenShot.logFail("Sign in button is Disable if no input was made " + btnDis, true);
            return false;

        }
        CucumberScreenShot.logPass("Sign in button is Enable if no input was made " + btnDis, true);
        return true;
    }


    public void validateSigninBtnWithOneInput(String btn, String value, String input) {
        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_INPUTFIELD, input);
        WebElement oneInput = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        oneInput.sendKeys(value);

        if (loginPage.disableBtn.isEnabled()) {
            CucumberScreenShot.logFail("Sign in button is Enable if no input was made " + btn, true);
        } else {
            CucumberScreenShot.logPass("Sign in button is Disable if no input was made " + btn, true);
        }

    }


}


