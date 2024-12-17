package test1;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Democart {
	@Test
	public void kidsCart() throws InterruptedException
	{
		
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		   Thread.sleep(4000);
		   driver.get("https://automationexercise.com");
		   driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		   driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("shivaprakash500@gmail.com");
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Account123!!");
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		   
		   Thread.sleep(3000);
		   
		driver.findElement(By.xpath("(//span[@class='badge pull-right'])[3]")).click();
		JavascriptExecutor NoElementisInteractable= (JavascriptExecutor)driver;
		NoElementisInteractable.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Kids']//a[contains(text(),'Dress')]")).click();
		driver.findElement(By.xpath("(//a[@href='/brand_products/Babyhug'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[7]")).click();
		
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//div[@class='modal-content']/div[3]/button"))).build().perform();
//		Thread.sleep(3000);
//		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//div[@class='modal-content']/div[3]/button"));
		//WebElement element1 = driver.findElement(By.xpath("//div[@class='modal-content']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-content']/div[3]/button"))).click();
		element.click();
	}
	
	@Test(enabled = false)
	public void waitExp() throws Exception
	{
		ChromeDriver driver= new ChromeDriver();
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://automationexercise.com");
			System.out.println("Started: " + LocalDateTime.now());
			driver.findElement(By.xpath("//a[normalize-space()='Signedup / Login']")).click();
		}
		catch (NoSuchElementException ne)
		{
			System.out.println("Ended: " + LocalDateTime.now());
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Signup / Login']"))).click();
			driver.quit();
		}
	
	}
}

