package AtlantBH;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoEcommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanji\\Desktop\\selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("http://automationpractice.com/index.php");

	System.out.println("Title; " +driver.getTitle());
	
	driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	
	WebElement email = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("passwd"));
	
	System.out.println("Display status email ; " +email.isDisplayed());
	System.out.println("Display status password ; " +pass.isEnabled());
	
	driver.findElement(By.id("email")).sendKeys("sanjin@qa.team");
	driver.findElement(By.id("passwd")).sendKeys("sanjin123");
    driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
    
    driver.findElement(By.xpath("//img[@alt='My Store']")).click();
    
    driver.findElement(By.xpath("//a[@title='Women']")).click(); 
    
    driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
    
    driver.findElement(By.id("color_14")).click();
    
    WebElement element = driver.findElement(By.xpath("//select[@id='group_1']"));
    Select sel = new Select(element);
    sel.selectByVisibleText("L");
    
    driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']//span")).click();
    
    driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    
    driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
    
    driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
    driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
    driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
    driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']")).click();
    
    System.out.println(driver.findElement(By.xpath("//strong[normalize-space()='Your order on My Store is complete.']")).getText());
    
    
	}

}
