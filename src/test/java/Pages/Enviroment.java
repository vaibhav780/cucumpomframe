package Pages;

import org.example.Base;
import org.example.Data;
import org.example.Elementutil;
import org.example.Propreader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enviroment {
    private WebDriver driver;
    private Elementutil util = new Elementutil(Base.getDriver());
    private Propreader propreader = new Propreader();

    private By envMenu = By.id("_jsx_0_11_tibco.admin.environment");
    private By newEnv = By.xpath("//*[@title=\"Create new environment\"]");
    private By EnvName = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/span/div/div[3]/span/div[7]/span/div/div[2]/span/span[1]/div/div/div[6]/input");
    private By Env_desc = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/span/div/div[3]/span/div[7]/span/div/div[2]/span/span[2]/div/div/div[6]/textarea");
    private By NxtBtn= By.xpath("//*[@label=\"nextBtn\"]");

    private By EmsUrl= By.xpath("//*[@label=\"tibco.admin.envrionment.nw.messagingbus.emsServerURL\"]/div[6]/input");
    private By Ems_username= By.xpath("//*[@label=\"tibco.admin.envrionment.nw.messagingbus.frUserName\"]/div/div/div[6]/input");
    private By TestconnBtn= By.xpath("//*[@label=\"tibco.admin.common.messagingbus.testconnection_fld\"]/div[6]/span/span");
    private By conn_status= By.xpath("//*[@label=\"dlgAlertDialog\"]/div/div[2]/div/div/div");
    private By conn_ok_btn= By.xpath("//*[@label=\"dlgAlertDialog\"]/div/div[2]/div/div/div[2]/span");
    private By finish_btn=By.xpath("//*[@label=\"buttonBar\"]/span[3]");
    private String Envname = util.generateString(5);
    public Enviroment(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickEnviroment(){
        util.Click(envMenu);
    }

    public void ClickNewEnv(){
        util.Click(newEnv);
    }
    public void EnterEnvData(){
      util.enter_text(EnvName,Envname);
      util.enter_text(Env_desc,"Created By Automation");
      util.Click(NxtBtn);
      util.pause(3000);
    util.clear_text(EmsUrl);
    util.Click(EmsUrl);
      util.enter_text(EmsUrl,propreader.getValue("EMS_url"));
        util.pause(3000);
        util.enter_text(Ems_username,"admin");
        util.Click(TestconnBtn);
        util.pause(3000);
        if(util.getText(conn_status).contains(Data.Ems_SCUCCESS)){
            Assert.assertTrue(true);
            util.Click(conn_ok_btn);
        }else {
            Assert.fail();
        }
            util.Click(finish_btn);
    }

}
