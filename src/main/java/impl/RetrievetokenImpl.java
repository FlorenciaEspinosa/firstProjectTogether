package impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.RetrievetokenPage;
import utils.CucumberScreenShot;
import utils.WebdriverUtils;

public class RetrievetokenImpl {

    RetrievetokenPage retrievetokenPage = new RetrievetokenPage();

    public void vlidatrCopyTokenBtnIsPresent(String tokenBtn) {
        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_BUTTON, tokenBtn);
        WebElement BtnCopyToken = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        if (BtnCopyToken.isDisplayed()) {
            CucumberScreenShot.logPass(tokenBtn + " is present on the page",true);
        }else {
            CucumberScreenShot.logFail(tokenBtn + " is NOT present on the page",true);
        }
    }


}
