package Pages;

import org.example.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
    private WebDriver driver;
    private Elementutil util = new Elementutil(Base.getDriver());
    private Propreader propreader = new Propreader();
    private By about= By.xpath(propreader.getValue("about"));
    private By version_txt = By.xpath(propreader.getValue("version_txt"));
    private By close_icon = By.xpath(propreader.getValue("close_icon"));
    private By Shared_obj = By.xpath(propreader.getValue("Shared_obj"));
    private By Sub_var = By.xpath(propreader.getValue("Sub_var"));
    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement verify_about(){
        return util.waitForElement(about,30);
    }

    public void click_about(){
        util.Click(about);
        util.takeSS();
        ComLogger.info("Clicked on About");
    }

    public boolean retrive_version(){
        util.waitForElement(version_txt,20);
        String version = util.getText(version_txt);
        int i = version.indexOf(Data.ADMIN_VERSION);
        ComLogger.info("Verified Admin Version");
        return i > 0;

    }
    public void click_shared_obj(){
        util.Click(Shared_obj);

    }
    public void click_sub_var(){
        util.Click(Sub_var);
        util.pause(3000);

    }

}
