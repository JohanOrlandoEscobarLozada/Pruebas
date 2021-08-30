package Tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class CompraBancaria {
	private WebDriver driver;
	  private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	  private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	  private String URL = "http://automationpractice.com/index.php";
	  JavascriptExecutor js;
	  
	  @BeforeClass
	  public static void setUpBeforeClass()
	  {
		  System.out.println("INICIO DE TEST");
		  System.setProperty(TIPO_DRIVER, PATH_DRIVER);
	  }
	  
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void compraBancaria() {
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().setSize(new Dimension(1296, 696));
	    driver.findElement(By.cssSelector(".columns-container")).click();
	    driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(1) .replace-2x")).click();
	    driver.findElement(By.name("Submit")).click();
	    driver.findElement(By.cssSelector(".continue > span")).click();
	    driver.findElement(By.cssSelector(".shopping_cart > a")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("1117527088@teinco.edu.co");
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys("Johan1");
	    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
	    driver.findElement(By.cssSelector(".cart_navigation")).click();
	    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
	    driver.findElement(By.cssSelector(".cart_navigation")).click();
	    driver.findElement(By.cssSelector(".cart_navigation")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector(".fancybox-item")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
	    driver.findElement(By.cssSelector("#HOOK_PAYMENT > .row:nth-child(2)")).click();
	    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
	    driver.findElement(By.cssSelector("p:nth-child(5)")).click();
	    driver.findElement(By.cssSelector(".box")).click();
	    driver.findElement(By.cssSelector("p:nth-child(3)")).click();
	    driver.findElement(By.cssSelector("#cart_navigation span")).click();
	    driver.findElement(By.cssSelector(".box")).click();
	    driver.findElement(By.cssSelector(".row:nth-child(3)")).click();
	  }

}
