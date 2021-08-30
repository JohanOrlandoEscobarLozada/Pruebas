package Tests;

import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Busqueda {
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
    new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void busqueda() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1296, 696));
    driver.findElement(By.id("search_query_top")).click();
    driver.findElement(By.id("search_query_top")).sendKeys("summer dresses");
    driver.findElement(By.name("submit_search")).click();
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
    driver.findElement(By.cssSelector(".continue > span")).click();
  }
}
