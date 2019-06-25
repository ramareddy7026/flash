package testngframework2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testlogin extends Excel{
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

	}
	@Test
	public void mainprocess() throws InterruptedException
	{
	// driver = new ChromeDriver();
	// driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	 String s="Sheet1",p="./data/book1.xlsx";
	 String un= Excel.getdata(p, s, 0, 0);
	 String pw=Excel.getdata(p, s, 0, 1);
	 
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	Pom page=new Pom(driver);
	page.setname(un);
	Thread.sleep(1000);
	page.setpwd(pw);
	page.liginbbtn();
		
	}

}
