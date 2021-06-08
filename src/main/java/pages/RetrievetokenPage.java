package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

public class RetrievetokenPage {

    public RetrievetokenPage() {
        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }


}
