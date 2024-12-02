package Pages;

import org.example.Base;
import org.example.Data;
import org.example.Elementutil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Host {
    private WebDriver driver;
    private Elementutil util = new Elementutil(Base.getDriver());

    private String hname= util.generateString(5);

    private By infra= By.id("_jsx_0_10");
    private By hostmenu=By.xpath("//*[@jsxid='tibco.admin.host']");
    private By newHost= By.xpath("//*[@id=\"_jsx_0_2v\"]");
    private By hostname=By.xpath("//*[@id='_jsx_0_4c']//div[6]/input");
    private By mgmtturl = By.xpath("//*[@id='_jsx_0_4h']//div[6]/input");
    private By mcdrpdwm = By.className("jsx30combo_text");
    private By save_host= By.xpath("//*[@label='saveButton']");
    private By install_host = By.xpath("//*[@label='tibco.admin.host.ActionMenuButton.install']");
    private By start_host= By.xpath("//*[@label='tibco.admin.host.ActionMenuButton.start']");

    public Host(WebDriver driver) {
        this.driver = driver;
    }

    public void changemc(){
        util.Click(mcdrpdwm);
    }
    public void click_infra(){
        util.Click(infra);
    }
    public void click_host(){
        util.Click(hostmenu);
        util.pause(3000);
    }
    public void New_host(){
        util.Click(newHost);
    }
    public void enterHostname(){
        util.enter_text(hostname,hname);
    }
    public void enterMgmturl(){
        String url ="service:jmx:jmxmp://localhost:"+util.getRandomport();
        System.out.println(url);
        util.clear_text(mgmtturl);
        util.enter_text(mgmtturl,url);
        util.pause(5000);
    }
    public void saveHost(){
        util.Click(save_host);
        util.pause(2000);
    }
    public void installHost(){
        util.ClickWithText(hname);
        util.pause(3000);
        util.Click(install_host);
        System.out.println(hname);
        util.refresh(hname, Data.IN_PROGRESS);
    }
    public void startHost(){
        util.ClickWithText(hname);
        util.pause(2000);
        util.Click(start_host);
        util.refresh(hname,Data.HOST_SCUCCESS);
        util.pause(3000);
        util.doRefresh();
    }


}
