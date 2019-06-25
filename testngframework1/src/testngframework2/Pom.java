package testngframework2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public WebDriver driver;
  @FindBy(id="identifierId")
  private WebElement un;
  @FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
  private WebElement pwd;
  @FindBy(xpath="//span[.='Next']")
  private WebElement loginbtn;
  public Pom(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public void setname(String u)
  {
	  un.sendKeys(u);
	  un.sendKeys(Keys.ENTER);
  }
  public void setpwd(String p)
  {
	  pwd.sendKeys(p);
	  pwd.sendKeys(Keys.ENTER);
  }
  public void liginbbtn()
  {
	  loginbtn.click();
  }
}
