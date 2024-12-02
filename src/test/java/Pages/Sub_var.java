package Pages;

import org.example.Base;
import org.example.ComLogger;
import org.example.Elementutil;
import org.example.Propreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

public class Sub_var {
private WebDriver driver;
private Elementutil util = new Elementutil(Base.getDriver());
private Propreader propreader = new Propreader();
private By add = By.xpath(propreader.getValue("add"));
private By sbname = By.xpath(propreader.getValue("sbname"));
private By sbtxtvalue= By.xpath(propreader.getValue("sbtxtvalue"));
private By sbvalue= By.xpath(propreader.getValue("sbvalue"));

private By sbdatatype= By.xpath("sbdatatype");
private By datatype = By.xpath("datatype");
private By select_data = By.xpath(propreader.getValue("select_data"));

private By msg = By.xpath("msg");
private By close = By.xpath(propreader.getValue("close"));
private By savebtn = By.xpath(propreader.getValue("savebtn"));
private String subvar_name=util.generateString(5);
    public Sub_var(WebDriver driver) {
        this.driver = driver;
    }

    public void add_sbvar(){
        util.Click(add);
        util.pause(3000);

    }
    public void enter_name(){
        util.enter_text(sbname,subvar_name);
    }
    public void selectDatatype(){
        util.Click(sbdatatype);
        util.Click(datatype);
        util.Click(select_data);
        util.pause(3000);
    }
    public void enter_sbvvalue(){
        util.Click(sbtxtvalue);
        util.enter_text(sbvalue,"test");
        util.pause(3000);
    }
    public void save(){
        util.Click(savebtn);
        util.pause(3000);
    }
    public void verify_action(){
        WebElement msgelement = util.findElement(msg);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(msgelement,"Your changes were successfully saved"));
        ComLogger.info(util.getText(msg));
    }
}
