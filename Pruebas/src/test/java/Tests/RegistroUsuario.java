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
import org.openqa.selenium.support.ui.Select;


public class RegistroUsuario {
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
	  public void registroUsuario() {
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().setSize(new Dimension(1296, 696));
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("email_create")).click();
	    driver.findElement(By.id("email_create")).sendKeys("p@p7.com");
	    //driver.findElement(By.cssSelector(".form-ok")).click();
	    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    WebElement selectGender = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
	    selectGender.click();
	    //driver.findElement(By.id("id_gender1")).click();
	    driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("Johan");
	    driver.findElement(By.cssSelector(".required:nth-child(4)")).click();
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_lastname")).sendKeys("Escobar");
	    driver.findElement(By.cssSelector(".account_creation:nth-child(1) > .required:nth-child(5)")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.cssSelector(".account_creation:nth-child(1)")).click();
	    driver.findElement(By.id("account-creation_form")).click();
	    driver.findElement(By.cssSelector(".password")).click();
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys("Johan1");
	    driver.findElement(By.cssSelector(".password")).click();
	    driver.findElement(By.id("days")).click();
	    {
	     /* WebElement dropdown = driver.findElement(By.id("days"));
	     dropdown.findElement(By.xpath("//option[. = 'regexp:1\\s+']")).click();*/
	    	WebElement dropdown = driver.findElement(By.id("days"));
	    	Select sel=new Select(dropdown);
	    	sel.selectByValue("1");
	    }
	    driver.findElement(By.id("months")).click();
	    {
	    	WebElement dropdown = driver.findElement(By.id("months"));
	    	Select sel=new Select(dropdown);
	    	sel.selectByValue("1");
	      /*WebElement dropdown = driver.findElement(By.id("months"));
         dropdown.findElement(By.xpath("//option[. = 'regexp:January\\s']")).click();*/
	    }
	    driver.findElement(By.id("years")).click();
	    {
	      /*WebElement dropdown = driver.findElement(By.id("years"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:1992\\s+']")).click();*/
	    	WebElement dropdown = driver.findElement(By.id("years"));
	    	Select sel=new Select(dropdown);
	    	sel.selectByValue("1992");
	    }
	    driver.findElement(By.cssSelector(".checkbox:nth-child(8)")).click();
	    driver.findElement(By.id("firstname")).click();
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2) > .required:nth-child(3)")).click();
	    driver.findElement(By.id("firstname")).click();
	    driver.findElement(By.cssSelector(".columns-container")).click();
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2) > .required:nth-child(3)")).click();
	    driver.findElement(By.id("company")).click();
	    driver.findElement(By.id("company")).sendKeys("Pruebas");
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2)")).click();
	    driver.findElement(By.id("address1")).click();
	    driver.findElement(By.id("address1")).sendKeys("calle1");
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2)")).click();
	    driver.findElement(By.id("address2")).click();
	    driver.findElement(By.id("address2")).sendKeys("Calle2");
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2) > .required:nth-child(5)")).click();
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.id("city")).sendKeys("Florencia");
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2)")).click();
	    driver.findElement(By.id("id_state")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("id_state"));
	      dropdown.findElement(By.xpath("//option[. = 'Alabama']")).click();
	    }
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2)")).click();
	    driver.findElement(By.id("postcode")).click();
	    driver.findElement(By.id("postcode")).sendKeys("11111");
	    driver.findElement(By.cssSelector(".id_state")).click();
	    driver.findElement(By.id("id_country")).click();
	    driver.findElement(By.cssSelector(".required:nth-child(10)")).click();
	    driver.findElement(By.id("other")).click();
	    driver.findElement(By.id("other")).sendKeys("Pruebas");
	    driver.findElement(By.cssSelector(".textarea")).click();
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).sendKeys("1111111");
	    driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).sendKeys("11111111");
	    driver.findElement(By.cssSelector(".account_creation:nth-child(2)")).click();
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("address_alias")).click();
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.cssSelector(".columns-container")).click();
	    driver.findElement(By.id("alias")).sendKeys("My Address");
	    driver.findElement(By.id("address_alias")).click();
	    driver.findElement(By.cssSelector("#submitAccount > span")).click();
	    driver.findElement(By.cssSelector(".addresses-lists")).click();
	    driver.findElement(By.cssSelector(".page-heading")).click();
	  }
}
